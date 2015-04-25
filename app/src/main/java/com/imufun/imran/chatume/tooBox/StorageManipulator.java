package com.imufun.imran.chatume.tooBox;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by imran on 4/25/15.
 */
public class StorageManipulator extends SQLiteOpenHelper {

    public StorageManipulator(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static final String Database_name = "AndroidChatter.db";
    public static final int Database_version = 1;

    public static final String _ID = "_id";
    public static final String Table_name_message = "table_message";
    public static final String Message_Reciever = "reciever";
    public static final String Message_Sender = "Sender";
    public static final String Message_Message = "message";


    public static final String TABLE_MESSAGE_CREATE
            = "CREATE TABLE" + Table_name_message
            + "(" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Message_Reciever + "VARCHAR(25),"
            + Message_Sender + "VARCHAR(25)";


    public static final String Table_Message_Drop = "DROP TABLE IF EXITS" + Table_name_message;


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("TABLE_MESSAGE_CREATE");
    }


    public void insert(String Sender, String Reciever, String Message) {
        long rowId;
        try {

            SQLiteDatabase db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Message_Reciever, Reciever);
            contentValues.put(Message_Sender, Sender);
            contentValues.put(Message_Message, Message);

            rowId = db.insert("Table_name_message", null, contentValues);

        } catch (Exception e) {

        }

    }

    public Cursor get(String sender, String Reciever) {

        SQLiteDatabase db = getWritableDatabase();
        String selectQuery = "SELECT * FROM" + Table_name_message + "WHERE" + Message_Sender + "LIKE" + sender + "AND" + Message_Reciever + "LIKE" + Reciever + "ORDER BY" + _ID + "ASC";


        return null;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Table_Message_Drop  ");
    }
}
