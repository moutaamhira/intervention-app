package com.example.interventionapp.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.interventionapp.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class intervation_adapter extends RecyclerView.Adapter <intervation_adapter.MyViewHolder> {
    List<Intervention> data ;
   private SelectListener listener;

    public intervation_adapter(List<Intervention> data,SelectListener listener) {
        this.data = data;
        this.listener=listener;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.line,parent,false);

        return new MyViewHolder(v,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
   holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView sociaty , address , timing , titre;
        SelectListener listener;
        CheckBox checkBox;
       // public CardView cardView;
        public MyViewHolder(@NonNull View itemView,SelectListener listener) {
            super(itemView);

            titre = itemView.findViewById(R.id.titre);
            sociaty = itemView.findViewById(R.id.society);
            address = itemView.findViewById(R.id.address);
            timing= itemView.findViewById(R.id.timing);
            checkBox= itemView.findViewById(R.id.checkBox);
           // cardView=itemView.findViewById(R.id.title);
            this.listener=listener;


        }
        public void bind (Intervention intervention ){
            this.titre.setText(intervention.getTitle());
            this.sociaty.setText(intervention.getNom());
            this.address.setText(intervention.getAdresse());
            String dateDeb=new SimpleDateFormat("dd/MM/YYYY").format(intervention.getDatedebut());
            String dateFin=new SimpleDateFormat("dd/MM/YYYY").format(intervention.getDatefin());

            this.timing.setText(dateDeb+" - "+dateFin);
           // this.timing.setText(intervention.getDatedebut()+" - "+intervention.getDatefin());

            this.titre.setOnClickListener(v -> {
                this.listener.onItemClicked(intervention);
            });


        }

    }

}
