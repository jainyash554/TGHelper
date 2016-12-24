package com.example.tghelper.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BaseService {
	private Student1DatabaseHelper helper;
	private SQLiteDatabase db;	
	public BaseService(Context c) {
		helper=new Student1DatabaseHelper(c);
	}
	public void open(){
		db=helper.getWritableDatabase(); //R+W
	}
	public void close(){
		helper.close();
	}
	/**
	 * Call this method to get SQLiteDatabase object to perform CRUD.
	 * @return ready SQLiteDatabase object
	 */
	public SQLiteDatabase getDB() {
		return db;
	}
}
