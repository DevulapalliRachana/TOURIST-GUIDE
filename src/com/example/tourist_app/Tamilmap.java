package com.example.tourist_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class Tamilmap extends Activity {
	WebView wv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tamilmap);
		wv1=(WebView) findViewById(R.id.webView1);
		wv1.getSettings().setLoadsImagesAutomatically(true);
		wv1.getSettings().setJavaScriptEnabled(true);
		wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		wv1.loadUrl("http://www.ttdconline.com");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tamilmap, menu);
		return true;
	}

}
