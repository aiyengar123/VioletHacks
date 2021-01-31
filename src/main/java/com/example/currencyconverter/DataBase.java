package com.example.currencyconverter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

//import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SQLiteOpenHelper {

    public static final String USER_TABLE = "USER_TABLE";
    public static final String COLUMN_USER_NAME = "USER_NAME";
    public static final String COLUMN_USER_PASS = "USER_PASS";

    public DataBase(@Nullable Context context) {
        super(context, "Username", null,  1);
    }

    //called first time database is accessed
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + USER_TABLE + " (" + COLUMN_USER_NAME + ", " + COLUMN_USER_PASS + ")";

        db.execSQL(createTableStatement);
    }

    //called when database is changed
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(UserModel userModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_USER_NAME, userModel.getUsername());
        cv.put(COLUMN_USER_PASS, userModel.getPassword());

        long insert = db.insert(USER_TABLE, null, cv);
        if (insert == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public List<UserModel> getEveryone() {
        List<UserModel> returnList = new ArrayList<>();

        //get data from the database
        String queryString = "SELECT * FROM " + USER_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()) {
            //loop through the results, create new user results, put into return list
            do {
                String userName = cursor.getString(0);
                String userPass = cursor.getString(1);

                UserModel newUser = new UserModel(userName, userPass);
                returnList.add(newUser);
            }
            while(cursor.moveToNext());

        }
        else {
            //do not add anything to list
        }

        cursor.close();
        db.close();
        return returnList;
    }

}
