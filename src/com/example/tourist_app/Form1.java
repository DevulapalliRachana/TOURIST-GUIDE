package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form1 extends Activity {
	//We want to initiate the layout what ever we used 

	EditText et,et1;
	
	Button bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form1);
		// here we just call the variable by id value
		
		
		
		
		bt=(Button)findViewById(R.id.but);
		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
					
					
					Intent in=new Intent(Form1.this,Form2.class);
					startActivity(in);
					
					
			}
					
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form1, menu);
		return true;
	}

}
