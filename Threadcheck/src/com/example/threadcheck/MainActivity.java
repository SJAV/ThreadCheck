package com.example.threadcheck;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
	Handler handler = new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		handler.postDelayed(myRunnable, 600); 
		
	}
	private Runnable myRunnable = new Runnable() {
		 public void run() {
		        readWebpage();
		        handler.postDelayed(this, 600); //now is every 2 minutes
		    }
		 };

	protected void readWebpage() {
		// TODO Auto-generated method stub
		System.out.println("hai");
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		handler.removeCallbacks(myRunnable);
	}
}

