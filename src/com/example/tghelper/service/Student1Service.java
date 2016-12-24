package com.example.tghelper.service;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.example.tghelper.domain.*;

public class Student1Service extends BaseService {
public Student1Service(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
public void save(Student1 s)
{
	String sql="INSERT INTO student1( name, phone, add) VALUES(?,?,?)";
	SQLiteStatement st=getDB().compileStatement(sql);
	st.bindString(1, s.getName());
	st.bindString(2, s.getMobile());
	st.bindString(3, s.getAdd());
	st.execute();
	}
}
