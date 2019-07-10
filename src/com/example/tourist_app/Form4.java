package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Form4 extends Activity {
	Button bt;
	Button bt1;
	Button bt2;
	Button bt3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form4);
		bt=(Button)findViewById(R.id.b1);
		bt1=(Button)findViewById(R.id.b2);
		bt2=(Button)findViewById(R.id.b3);
		bt3=(Button)findViewById(R.id.b4);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i1=new Intent(Form4.this,Athi.class);
				startActivity(i1);
				
			}
		});
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2=new Intent(Form4.this,Padmana.class);
				startActivity(i2);
				
				
			}
		});
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i3=new Intent(Form4.this,Topst.class);
				startActivity(i3);
			}
		});
		
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i4=new Intent(Form4.this,Kerala.class);
				startActivity(i4);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form4, menu);
		return true;
	}

}
