package com.example.tghelper;








import com.example.tghelper.service.Student1Service;

import android.os.Bundle;

import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class StudentList1 extends ListActivity {
	Student1Service student1service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_student_list1);
		 student1service=new Student1Service(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_list1, menu);
		return true;
	}
//	  @Override
//	    protected void onResume() {    
//	    	super.onResume();
//	    	student1service.open();
//	    	
//	    }
	    @Override
	    protected void onStop() {    	
	    	super.onStop();
	    	student1service.close();
	    }

	    
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.itemadding:
			openStudentForm1Activity();
			return true;

		case R.id.itemrefreshing:
			refreshing();
			return true;

		default:
			break;

		}
		return super.onOptionsItemSelected(item);
	}

	void refreshing()
	{
		
	}
	
	void openStudentForm1Activity()
	{
		Intent in = new Intent(this, StudentForm1.class);
		startActivity(in);
	}
}
