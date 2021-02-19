package com.example.chewie_on_a_diet_02_v_layout;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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
        db.execSQL("create table " + DATABASE_table_1 + "(" + Table_1_col_1 + " INTEGER primary key," + Table_1_col_2 + " TEXT ," + Table_1_col_3 + " TEXT ," + Table_1_col_4 + " TEXT )");
        db.execSQL("create table " + DATABASE_table_2 + "(" + Table_2_col_1 + " INTEGER primary key," + Table_2_col_2 + " TEXT ," + Table_2_col_3 + " TEXT ," + Table_2_col_4 + " INTEGER ," + Table_2_col_5 + " INTEGER ," + Table_2_col_6 + " TEXT , foreign key (" + Table_2_col_5 + ") references " + DATABASE_table_1 + "(" + Table_1_col_1 + "))");
        db.execSQL("create table " + DATABASE_table_3 + "(" + Table_3_col_1 + " INTEGER primary key," + Table_3_col_2 + " TEXT ," + Table_3_col_3 + " TEXT ," + Table_3_col_4 + " INTEGER ," + Table_3_col_5 + " INTEGER , foreign key (" + Table_3_col_5 + ") references " + DATABASE_table_1 + "(" + Table_1_col_1 + "))");
        db.execSQL("create table " + DATABASE_table_4 + "(" + Table_4_col_1 + " INTEGER primary key," + Table_4_col_2 + " TEXT ," + Table_4_col_3 + " TEXT ," + Table_4_col_4 + " INTEGER ," + Table_4_col_5 + " INTEGER , foreign key (" + Table_4_col_4 + ") references " + DATABASE_table_1 + "(" + Table_1_col_1 + "))");
        db.execSQL("create table " + DATABASE_table_5 + "(" + Table_5_col_1 + " INTEGER primary key," + Table_5_col_2 + " TEXT ," + Table_5_col_3 + " TEXT ," + Table_5_col_4 + " INTEGER ," + Table_5_col_5 + " INTEGER ," + Table_5_col_6 + " INTEGER ," + Table_5_col_7 + " INTEGER , foreign key (" + Table_5_col_4 + ") references " + DATABASE_table_1 + "(" + Table_1_col_1 + ") , foreign key (" + Table_5_col_5 + ") references " + DATABASE_table_2 + "(" + Table_2_col_1 + "))");
        db.execSQL("create table " + DATABASE_table_6 + "(" + Table_6_col_1 + " INTEGER primary key," + Table_6_col_2 + " TEXT ," + Table_6_col_3 + " TEXT ," + Table_6_col_4 + " INTEGER ," + Table_6_col_5 + " INTEGER ," + Table_6_col_6 + " INTEGER , foreign key (" + Table_6_col_4 + ") references " + DATABASE_table_1 + "(" + Table_1_col_1 + "), foreign key (" + Table_6_col_5 + ") references " + DATABASE_table_3 + "(" + Table_3_col_1 + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_1);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_2);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_3);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_4);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_5);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_6);
        onCreate(db);
    }

    // Alle code omwile de eerste tabel

    public int IDMAKERTABLE1() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_1, null
        );
        return cursor.getCount();
    }

    public void addToTabel1(String naam, String email) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        if (!naam.trim().isEmpty() && naam != null) {
            contentValues.put(Table_1_col_1, IDMAKERTABLE1());
            contentValues.put(Table_1_col_2, naam);
            contentValues.put(Table_1_col_3, email);
            contentValues.put(Table_1_col_4, "on");
        }

        sqLiteDatabase.insert(DATABASE_table_1, null, contentValues);
    }

    public String[] firstLettersNaam() {

        String uit[];

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select substr(" + Table_1_col_2 + ", 1, 1)from " + DATABASE_table_1 + "", null);

        uit = new String[cursor.getCount()];

        for (int i = 0; i <= cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cursor.getString(0));
                uit[i] = stringBuffer.toString();
            }
        }

        return uit;
    }

    public String getTable_1_col_2Name(int id) {
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_1_col_2 + " from " + DATABASE_table_1 + " where " + Table_1_col_1 + " == " + id + "", null);
        if (cursor.moveToFirst()) {
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String getTable_1_col_2NameFirstLetter(int id) {
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor = sqLiteDatabase.rawQuery("select substr(" + Table_1_col_2 + ",1,1) from " + DATABASE_table_1 + " where " + Table_1_col_1 + " == " + id + "", null);
        if (cursor.moveToFirst()) {
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String getTable_1_col_3Email(int id) {
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor =
                sqLiteDatabase.rawQuery("select " + Table_1_col_3 + " from " + DATABASE_table_1 + " where " + Table_1_col_1 + " == " + id + "", null);
        if (cursor.moveToFirst()) {
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String[] activated() {

        String uit[];

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_1_col_4 + " from " + DATABASE_table_1 + "", null);

        uit = new String[cursor.getCount()];

        for (int i = 0; i <= cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cursor.getString(0));
                uit[i] = stringBuffer.toString();
            }
        }

        return uit;
    }

    public void updateOneLineToOff(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_1_col_1, id);
        contentValues.put(Table_1_col_2, getTable_1_col_2Name(id));
        contentValues.put(Table_1_col_3, getTable_1_col_3Email(id));
        contentValues.put(Table_1_col_4, "off");

        sqLiteDatabase.update(DATABASE_table_1, contentValues, "" + Table_1_col_1 + " = ?", new String[]{"" + id});
    }

    public void updateOneLineToOn(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_1_col_1, id);
        contentValues.put(Table_1_col_2, getTable_1_col_2Name(id));
        contentValues.put(Table_1_col_3, getTable_1_col_3Email(id));
        contentValues.put(Table_1_col_4, "on");

        sqLiteDatabase.update(DATABASE_table_1, contentValues, "" + Table_1_col_1 + " = ?", new String[]{"" + id});
    }

    public void updateAllLinesToOff() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from " + DATABASE_table_1 + "", null);
        for (int i = 0; i < cursor.getCount(); i++) {
            updateOneLineToOff(i);
        }
    }

    public int getIdActivated(){
        int uit = 0;
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select "+Table_1_col_1+" from "+DATABASE_table_1+" where "+Table_1_col_4+" == 'on'",null);
        StringBuffer stringBuffer = new StringBuffer();
        if (cursor.moveToFirst()){
            stringBuffer.append(cursor.getString(0));
        }
        uit = Integer.parseInt(stringBuffer.toString().trim());
        return uit;
    }

    // Alle code omwile van de tweede tabel
    public int IDMAKERTABLE2() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_2, null
        );
        return cursor.getCount();
    }

    public void addToTabel2(String naam, String maker, int aantalCal, int accountId, String type) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        if (!naam.trim().isEmpty() && naam != null && !maker.trim().isEmpty() && maker != null) {
            contentValues.put(Table_2_col_1, IDMAKERTABLE2());
            contentValues.put(Table_2_col_2, naam);
            contentValues.put(Table_2_col_3, maker);
            if (aantalCal > -1 && accountId > -1) {
                contentValues.put(Table_2_col_4, aantalCal);
                contentValues.put(Table_2_col_5, accountId);
                if (type == "food" || type == "drink") {
                    contentValues.put(Table_2_col_6, type);
                    sqLiteDatabase.insert(DATABASE_table_2, null, contentValues);
                }
            }
        }
    }


    public String getTable_2_col_2Name(int id) {
        String uit = "";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_2 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and "+Table_2_col_6+" == 'food'", null);
        if (cursor.moveToFirst()) {
            stringBuffer.append(cursor.getString(0));
        }
        uit += stringBuffer.toString();
        return uit;
    }

    public String [] getTable_2_col_2NameArrayListFood(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_2 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'food'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "name = " + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_2_col_3MakerArrayListFood(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_3 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'food'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "maker = " + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_2_col_4CaloriesArrayListFood(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_4 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'food'", null);
        String [] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = stringBuffer.toString()+" Cal/100g";
                }
            }
        }
        return uit;
    }

    public String [] getTable_2_col_1IdArrayListFood(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_1 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'food'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    //drink part van tabel 2

    public String [] getTable_2_col_2NameArrayListDrink(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_2 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'drink'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "name = " + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_2_col_3MakerArrayListDrink(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_3 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'drink'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "maker = " + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_2_col_4CaloriesArrayListDrink(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_4 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'drink'", null);
        String [] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = stringBuffer.toString()+" Cal/100ml";
                }
            }
        }
        return uit;
    }


    public int getTable_2_col_4CalorieForId(int foodendrinkID ){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_4 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + getIdActivated() + " and "+Table_2_col_1+" == "+foodendrinkID+" ", null);

        int uit = -1;
        StringBuffer stringBuffer = new StringBuffer();
        if (cursor.moveToFirst()){
            stringBuffer.append(cursor.getString(0));
            uit = Integer.parseInt(stringBuffer.toString().trim());
        }
        return uit;
    }
    public String [] getTable_2_col_1IdArrayListDrink(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_2_col_1 + " from " + DATABASE_table_2 + " where " + Table_2_col_5 + " == " + id + " and " + Table_2_col_6 + " == 'drink'", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = stringBuffer.toString();
                }
            }
        }
        return uit;
    }

// de activity databaseeeee 3
    public int IDMAKERTABLE3() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_3, null
        );
        return cursor.getCount();
    }


    public void addToTabel3(String naam, int calories) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Date calendar = Calendar.getInstance().getTime();
        String deDatum = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar);

        if (!naam.trim().isEmpty() && naam != null && calories > -1) {
            contentValues.put(Table_3_col_1, IDMAKERTABLE3());
            contentValues.put(Table_3_col_2, naam);
            contentValues.put(Table_3_col_3, deDatum);
            contentValues.put(Table_3_col_4, calories);
            contentValues.put(Table_3_col_5, getIdActivated());

        }

        sqLiteDatabase.insert(DATABASE_table_3, null, contentValues);
    }

    public String [] getTable_3_col_1IdArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_3_col_1 + " from " + DATABASE_table_3 + " where " + Table_3_col_5 + " == " + id, null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_3_col_2NameArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_3_col_2 + " from " + DATABASE_table_3 + " where " + Table_3_col_5 + " == " + id , null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "" + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_3_col_4CaloriesArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_3_col_4 + " from " + DATABASE_table_3 + " where " + Table_3_col_5 + " == " + id , null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "" + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    //tabel 4
    public int IDMAKERTABLE4() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_4, null
        );
        return cursor.getCount();
    }

    public void addToTabel4( float weight) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Date calendar = Calendar.getInstance().getTime();
        String deDatum = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar);
        String hetUur = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar);

        if (weight > -1) {
            contentValues.put(Table_4_col_1, IDMAKERTABLE4());
            contentValues.put(Table_4_col_2, deDatum);
            contentValues.put(Table_4_col_3, hetUur);
            contentValues.put(Table_4_col_4, getIdActivated());
            contentValues.put(Table_4_col_5, weight);

        }

        sqLiteDatabase.insert(DATABASE_table_4, null, contentValues);
    }

    public String [] getTable_4_col_1IdArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_4_col_1 + " from " + DATABASE_table_4 + " where " + Table_4_col_4 + " == " + id + " order by "+Table_4_col_1+" desc", null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "" + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_4_col_2DateArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_4_col_2 + " from " + DATABASE_table_4 + " where " + Table_4_col_4 + " == " + id + " order by "+Table_4_col_1+" desc" , null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "" + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public String [] getTable_4_col_5WeightArrayList(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_4_col_5 + " from " + DATABASE_table_4 + " where " + Table_4_col_4 + " == " + id + " order by "+Table_4_col_1+" desc" , null);
        String[] uit = new String[cursor.getCount()];

        for (int i = 0; i < cursor.getCount(); i++) {
            if (cursor.moveToPosition(i)) {
                if (cursor.moveToPosition(i)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(cursor.getString(0));
                    uit[i] = "" + stringBuffer.toString();
                }
            }
        }
        return uit;
    }

    public float getTable_4_col_5WeightLastData(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select " + Table_4_col_5 + " from " + DATABASE_table_4 + " where " + Table_4_col_4 + " == " + id + " order by "+Table_4_col_1+" desc limit 1" , null);
        float uit = -1;
        if (cursor.moveToFirst()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cursor.getString(0));
            uit = Float.parseFloat(stringBuffer.toString().trim());
        }
        return uit;
    }


    // Database 5

    public int IDMAKERTABLE5() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_5, null
        );
        return cursor.getCount();
    }

    public void addToTabel5( int id,int size) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Date calendar = Calendar.getInstance().getTime();
        String deDatum = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar);
        String hetUur = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar);

        contentValues.put(Table_5_col_1, IDMAKERTABLE5());
        contentValues.put(Table_5_col_2, deDatum);
        contentValues.put(Table_5_col_3, hetUur);
        contentValues.put(Table_5_col_4, getIdActivated());
        contentValues.put(Table_5_col_5, id);
        contentValues.put(Table_5_col_6, size);
        contentValues.put(Table_5_col_7, getTable_2_col_4CalorieForId(id));

        sqLiteDatabase.insert(DATABASE_table_5, null, contentValues);
    }

}
