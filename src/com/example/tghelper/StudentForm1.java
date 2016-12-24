package com.example.tghelper;





import com.example.tghelper.domain.Student1;
import com.example.tghelper.service.Student1Service;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentForm1 extends Activity {
	EditText etname, etmobile, etadd;
	Button btnsave;
	Student1Service student1service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_form1);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		student1service=new Student1Service(this);
		initView();
	}
//	@Override
//protected void onResume() {	
//	super.onResume();
//	student1service.open();	
//	}
//	
@Override
	protected void onStop() {	
		super.onStop();
		student1service.close();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_form1, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	

	void initView() {
		etname = (EditText) findViewById(R.id.etname);
		
		etmobile = (EditText) findViewById(R.id.etmobile);
	
	
		etadd = (EditText) findViewById(R.id.etadd);
         btnsave=(Button)findViewById(R.id.btnsave);
        
 				}
	public void onSave(View v){		
		String name=etname.getText().toString();
		String mobile=etmobile.getText().toString();
		String add=etadd.getText().toString();
		Log.i("tttttt","name" +name);
		Log.i("tttt","mobile" +mobile);
		Log.i("tttt","add" +add);
		Student1 s=new Student1();
		s.setName(name);
		s.setMobile(mobile);
		s.setAdd(add);
		try{
			student1service.save(s);
			Toast.makeText(this, "STUDENT Saved", Toast.LENGTH_LONG).show();
			finish();//close form
			}
			catch (Exception e) {
				Toast.makeText(this, "Failed to save", Toast.LENGTH_LONG).show();
				Log.i("student","Failed during save", e);
			}	

}
}
