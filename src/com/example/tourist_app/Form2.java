package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Form2 extends Activity {
	
	
	
	
	
	
	
	
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form2);
		
		
		t13=(TextView)findViewById(R.id.but1);
		
		t11=(TextView)findViewById(R.id.but2);
		
		t9=(TextView)findViewById(R.id.but3);
		
		t2=(TextView)findViewById(R.id.but4);
		t10=(TextView) findViewById(R.id.but5);
		t8=(TextView) findViewById(R.id.but6);
		t6=(TextView) findViewById(R.id.but7);
		t1=(TextView) findViewById(R.id.but8);
		t12=(TextView) findViewById(R.id.but9);
		t5=(TextView) findViewById(R.id.but10);
		t3=(TextView) findViewById(R.id.but11);
		t4=(TextView) findViewById(R.id.but12);
		t7=(TextView) findViewById(R.id.but13);
		
		
		t13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Form2.this,Form3.class);
				startActivity(in);
			}
			
		});
		
		
		t11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				Intent i=new Intent(Form2.this,Form4.class);
				startActivity(i);
			}
		});
		
		t9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				Intent i1=new Intent(Form2.this,Form5.class);
				startActivity(i1);
			}
		});
		
		t2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i2=new Intent(Form2.this,Indiamap.class);
				startActivity(i2);
				
				
			}
		});
t10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Form2.this,AP.class);
				startActivity(in);
			}
			
		});
t6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i2=new Intent(Form2.this,Telangana.class);
		startActivity(i2);
		
		
	}
});
t6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i2=new Intent(Form2.this,Maha.class);
		startActivity(i2);
		
		
	}
});
t1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Jammu.class);
		startActivity(in);
	}
	
});
t12.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Gujarat.class);
		startActivity(in);
	}
	
});
t5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Uttar.class);
		startActivity(in);
	}
	
});
t3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Rajasthan.class);
		startActivity(in);
	}
	
});
t4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Orrisa.class);
		startActivity(in);
	}
	
});
t7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Form2.this,Assam.class);
		startActivity(in);
	}
	
});


	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form2, menu);
		return true;
	}

}
