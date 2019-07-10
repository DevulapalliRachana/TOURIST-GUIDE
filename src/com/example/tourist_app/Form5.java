package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Form5 extends Activity {
	Button bt;
	Button bt1;
	Button bt2;
	Button bt3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form5);
	
	
		bt=(Button)findViewById(R.id.butt1);
		bt1=(Button)findViewById(R.id.butt2);
		bt2=(Button)findViewById(R.id.butt3);
		bt3=(Button)findViewById(R.id.butt4);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i1=new Intent(Form5.this,Benga.class);
				startActivity(i1);
				
			}
		});
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				
				Intent i2=new Intent(Form5.this,Mysore.class);
				startActivity(i2);
			}
		});
		
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				
				Intent i3=new Intent(Form5.this,Murdesh.class);
				startActivity(i3);
			}
		});
		
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i4=new Intent(Form5.this,Bangmap.class);
				startActivity(i4);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form5, menu);
		return true;
	}

}
