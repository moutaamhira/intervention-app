package com.example.interventionapp.model;

import android.provider.SyncStateContract;

import androidx.room.TypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {
        @TypeConverter
        public static Date fromTimestamp(Long value) {

        return value == null ? null : new Date(value);}

        @TypeConverter
        public static Long dateToTimestamp(Date date) {
            return date == null ? null : date.getTime();}}

//blic class Converter {
 ///static DateFormat df = new SimpleDateFormat(SyncStateContract.Constants.DATA);

    //ypeConverter
    //blic static Date fromTimestamp(String value) {
      //if (value != null) {
        //  try {
          //    return df.parse(value);
           // catch (ParseException e) {
             // e.printStackTrace();
           //
          //return null;
    //  } else {
      //    return null;
      //}
  //}
