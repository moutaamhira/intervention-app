package com.example.interventionapp;

import android.content.Context;
import android.provider.SyncStateContract;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.interventionapp.model.Converter;
import com.example.interventionapp.model.Employee;
import com.example.interventionapp.model.clients;
import com.example.interventionapp.model.contrats;
import com.example.interventionapp.model.images;
import com.example.interventionapp.model.interventions;
import com.example.interventionapp.model.priorites;
import com.example.interventionapp.model.sites;
import com.example.interventionapp.model.taches;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Employee.class, clients.class, contrats.class, images.class, interventions.class, priorites.class, sites.class, taches.class}, version = 1, exportSchema = false)
@TypeConverters({Converter.class})
public abstract class IntervationDataRoom extends RoomDatabase {


    public abstract IntervationDAO intervationDAO();

    private static volatile IntervationDataRoom INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

  public   static IntervationDataRoom getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (IntervationDataRoom.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            IntervationDataRoom.class, "IntervationDataRa")
                            .addCallback(sRoomDatabaseCallback)

                            .build();


                }
            }
        }
        return INSTANCE;
    }
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                IntervationDAO dao = INSTANCE.intervationDAO();

                dao.deleteAllEmployee();
                dao.deleteAllClient();
                dao.deleteAllInterv();
                dao.deleteAllSites();
                Employee e = new Employee("admin","123","Mhira","Moutaa","mhira@gmail.com",true,0);
                dao.insert(e);
                clients c =new clients("Patrice","paris rue de paradie","65437865","6738274","patrice@gmail.com","","",0);
                dao.insert(c);
                sites s =new sites((float)45.00,1,(float)3.00,"paris rue de paradis","rue de paradie",75000,"paris","654636373","654636373",0);
                dao.insert(s);
                //interventions in = new interventions("intervation",null,null,null,null,"hhhh",null,null,null,true,null,false,null,0,1);
                //dao.insert(in);
                interventions i = new interventions("intervation",123423,12345,78965,54376,"hhhh",987765,98706,12345,true,12345,false,786534,0,1);
                dao.insert(i);
                interventions it = new interventions("intervation",123423,12345,78965,54376,"hhhh",987765,98706,12345,true,12345,false,786534,0,1);
                dao.insert(it);
                interventions inte = new interventions("intervation",123423,12345,78965,54376,"hhhh",987765,98706,12345,true,12345,false,786534,0,1);
                dao.insert(inte);

                try {
                    Date D = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-17");
                    Date D1 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-19");
                    Date T1 = new SimpleDateFormat("hh:mm").parse("12.00");
                    Date T2 = new SimpleDateFormat("hh:mm").parse("13.00");

                    interventions in = new interventions("intervation",123423,12345,78965,54376,"hhhh",987765,98706,12345,true,12345,false,786534,0,1);
                    dao.insert(in);

                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }



            });
        }
    };

}
