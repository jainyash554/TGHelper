package com.example.tghelper.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Student1DatabaseHelper extends SQLiteOpenHelper{	
	
	public Student1DatabaseHelper(Context context) {
		//DB will be created 
		//arg: host, db-name, factory, version
		super(context, "tg_helper_db", null, 1);		
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		String createTable="create table student1(" +
				"studentId INTEGER primary key autoincrement," +
				" name TEXT, " +
				" phone TEXT, " +
				"add TEXT)";
		db.execSQL(createTable);
		//TODO: create more tables
		//Insert default script here
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int verOld, int verNew) {		
		//TODO: Your customize logic for version management
		db.execSQL("DROP TABLE IF EXISTS student1");
	    onCreate(db);
	}
}
