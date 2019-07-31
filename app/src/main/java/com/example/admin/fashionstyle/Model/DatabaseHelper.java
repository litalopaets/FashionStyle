package com.example.admin.fashionstyle.Model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.LinkedList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "User.db";
    public static final String TABLE_NAME = "User_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "USERNAME";
    public static final String COL_3 = "FULLNAME";
    public static final String COL_4 = "IMAGEURL";
    public static final String COL_5 = "BIO";


    public DatabaseHelper(Context context ) {
        super(context, DATABASE_NAME, null, 4);
        SQLiteDatabase db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("create table " + TABLE_NAME + "(ID TEXT PRIMARY KEY, USERNAME TEXT,FULLNAME TEXT,IMAGEURL TEXT,BIO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
