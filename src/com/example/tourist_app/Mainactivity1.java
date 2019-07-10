package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class Mainactivity1 extends Activity {
	WebView wv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainactivity1);
		wv1=(WebView) findViewById(R.id.webView1);
		wv1.getSettings().setLoadsImagesAutomatically(true);
		wv1.getSettings().setJavaScriptEnabled(true);
		wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		wv1.loadUrl("https://www.google.co.in/search?q=madurai+tourist+places&spell=1&sa=X&ved=0ahUKEwj5juHfnbLbAhWBXysKHcvPBOcQBQgjKAA&biw=942&bih=726&dpr=1.25");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainactivity1, menu);
		return true;
	}

}
