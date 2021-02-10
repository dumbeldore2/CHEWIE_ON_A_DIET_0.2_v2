package com.example.chewie_on_a_diet_02_v_layout;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseRunner extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "databaserunner.db";
    //tabel 1
    public static final String DATABASE_table_1 = "accounts";
    public static final String Table_1_col_1 = "account_id";
    public static final String Table_1_col_2 = "account_naam";
    public static final String Table_1_col_3 = "email";
    public static final String Table_1_col_4 = "geactiveerd";

    //tabel 2
    public static final String DATABASE_table_2 = "food_en_drink";
    public static final String Table_2_col_1 = "food_en_drink_id";
    public static final String Table_2_col_2 = "food_en_drink_naam";
    public static final String Table_2_col_3 = "maker";
    public static final String Table_2_col_4 = "calories_per_100";
    public static final String Table_2_col_5 = "account_id";
    public static final String Table_2_col_6 = "type";

    //tabel 3
    public static final String DATABASE_table_3 = "activity";
    public static final String Table_3_col_1 = "activity_id";
    public static final String Table_3_col_2 = "activity_naam";
    public static final String Table_3_col_3 = "activity_datum";
    public static final String Table_3_col_4 = "activity_calories";
    public static final String Table_3_col_5 = "account_id";

    //tabel 4
    public static final String DATABASE_table_4 = "weight";
    public static final String Table_4_col_1 = "weight_id";
    public static final String Table_4_col_2 = "weight_datum";
    public static final String Table_4_col_3 = "weight_hour";
    public static final String Table_4_col_4 = "account_id";
    public static final String Table_4_col_5 = "weight";

    //tabel 5
    public static final String DATABASE_table_5 = "today_food_en_drink";
    public static final String Table_5_col_1 = "today_food_en_drink_id";
    public static final String Table_5_col_2 = "today_food_en_drink_datum";
    public static final String Table_5_col_3 = "today_food_en_drink_hour";
    public static final String Table_5_col_4 = "account_id";
    public static final String Table_5_col_5 = "food_en_drink_id";
    public static final String Table_5_col_6 = "today_food_en_drink_size";
    public static final String Table_5_col_7 = "today_food_en_drink_calories";

    //tabel 6
    public static final String DATABASE_table_6 = "today_activity";
    public static final String Table_6_col_1 = "today_activity_id";
    public static final String Table_6_col_2 = "today_activity_datum";
    public static final String Table_6_col_3 = "today_activity_hour";
    public static final String Table_6_col_4 = "account_id";
    public static final String Table_6_col_5 = "activity_id";
    public static final String Table_6_col_6 = "today_activity_calories";

    public DataBaseRunner(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DATABASE_table_1 + "("+Table_1_col_1+" INTEGER primary key,"+Table_1_col_2+" TEXT ,"+Table_1_col_3+" TEXT ,"+Table_1_col_4+" TEXT )");
        db.execSQL("create table " + DATABASE_table_2 + "("+Table_2_col_1+" INTEGER primary key,"+Table_2_col_2+" TEXT ,"+Table_2_col_3+" TEXT ,"+Table_2_col_4+" INTEGER ,"+Table_2_col_5+" INTEGER ,"+Table_2_col_6+" TEXT , foreign key ("+Table_2_col_5+") references "+DATABASE_table_1+"("+Table_1_col_1+"))");
        db.execSQL("create table " + DATABASE_table_3 + "("+Table_3_col_1+" INTEGER primary key,"+Table_3_col_2+" TEXT ,"+Table_3_col_3+" TEXT ,"+Table_3_col_4+" INTEGER ,"+Table_3_col_5+" INTEGER , foreign key ("+Table_3_col_5+") references "+DATABASE_table_1+"("+Table_1_col_1+"))");
        db.execSQL("create table " + DATABASE_table_4 + "("+Table_4_col_1+" INTEGER primary key,"+Table_4_col_2+" TEXT ,"+Table_4_col_3+" TEXT ,"+Table_4_col_4+" INTEGER ,"+Table_4_col_5+" INTEGER , foreign key ("+Table_4_col_4+") references "+DATABASE_table_1+"("+Table_1_col_1+"))");
        db.execSQL("create table " + DATABASE_table_5 + "("+Table_5_col_1+" INTEGER primary key,"+Table_5_col_2+" TEXT ,"+Table_5_col_3+" TEXT ,"+Table_5_col_4+" INTEGER ,"+Table_5_col_5+" INTEGER ,"+Table_5_col_6+" INTEGER ,"+Table_5_col_7+" INTEGER , foreign key ("+Table_5_col_4+") references "+DATABASE_table_1+"("+Table_1_col_1+") , foreign key ("+Table_5_col_5+") references "+DATABASE_table_2+"("+Table_2_col_1+"))");
        db.execSQL("create table " + DATABASE_table_6 + "("+Table_6_col_1+" INTEGER primary key,"+Table_6_col_2+" TEXT ,"+Table_6_col_3+" TEXT ,"+Table_6_col_4+" INTEGER ,"+Table_6_col_5+" INTEGER ,"+Table_6_col_6+" INTEGER , foreign key ("+Table_6_col_4+") references "+DATABASE_table_1+"("+Table_1_col_1+"), foreign key ("+Table_6_col_5+") references "+DATABASE_table_3+"("+Table_3_col_1+"))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_1);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_2);
        onCreate(db);
    }

    // Alle code omwile de eerste tabel

    public int IDMAKERTABLE1() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from "+ DATABASE_table_1, null
        );
        return cursor.getCount();
    }

    public void addToTabel1(String naam , String email){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        if (!naam.trim().isEmpty() && naam != null){
            contentValues.put(Table_1_col_1,IDMAKERTABLE1());
            contentValues.put(Table_1_col_2,naam);
            contentValues.put(Table_1_col_3,email);
            contentValues.put(Table_1_col_4,"on");
        }

        sqLiteDatabase.insert(DATABASE_table_1, null, contentValues);
    }
    public String[] firstLettersNaam(){

        String uit[];

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select substr("+Table_1_col_2+", 1, 1)from "+DATABASE_table_1+"",null);

        uit = new String[cursor.getCount()];

        for (int i = 0; i <= cursor.getCount(); i++){
            if (cursor.moveToPosition(i)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cursor.getString(0));
                uit[i] = stringBuffer.toString();
            }
        }

        return uit;
    }

    public String getTable_1_col_2Name(int id){
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor = sqLiteDatabase.rawQuery("select "+Table_1_col_2+" from "+DATABASE_table_1+" where "+Table_1_col_1+" == id",null);
        if (cursor.moveToFirst()){
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String getTable_1_col_3Email(int id){
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor =
                sqLiteDatabase.rawQuery("select "+Table_1_col_3+" from "+DATABASE_table_1+" where "+Table_1_col_1+" == id",null);
        if (cursor.moveToFirst()){
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String[] activated(){

        String uit[];

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select "+Table_1_col_4+" from "+DATABASE_table_1+"",null);

        uit = new String[cursor.getCount()];

        for (int i = 0; i <= cursor.getCount(); i++){
            if (cursor.moveToPosition(i)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cursor.getString(0));
                uit[i] = stringBuffer.toString();
            }
        }

        return uit;
    }

    public void updateEverythingToOff(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_1_col_1, id);
        contentValues.put(Table_1_col_2, getTable_1_col_2Name(id));
        contentValues.put(Table_1_col_3, getTable_1_col_3Email(id));
        contentValues.put(Table_1_col_4, "off");

        sqLiteDatabase.update(DATABASE_table_1, contentValues, "id = ?", new String[]{"" + id});
    }

    // Alle code omwile van de tweede tabel
    public int IDMAKERTABLE2() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from "+ DATABASE_table_2, null
        );
        return cursor.getCount();
    }

    public void addToTabel2(String naam, String maker , int aantalCal,int accountId,String type){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        if (!naam.trim().isEmpty() && naam != null && !maker.trim().isEmpty() && maker != null){
            contentValues.put(Table_2_col_1,IDMAKERTABLE2());
            contentValues.put(Table_2_col_2,naam);
            contentValues.put(Table_2_col_3,maker);
            if (aantalCal > -1 && accountId > -1){
                contentValues.put(Table_2_col_4,aantalCal);
                contentValues.put(Table_2_col_5,accountId);
                if (type == "food" || type == "drink"){
                    contentValues.put(Table_2_col_6,type);
                    sqLiteDatabase.insert(DATABASE_table_2, null, contentValues);
                }
            }
        }
    }
}
