package com.penn.androidinterview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_main);

		new Handler().postDelayed(new Runnable() {
			public void run() {
				goHome();
			}
		}, 3000);
	}

	private void goHome() {
		Intent intent = new Intent(this, ActivityTopicList.class);
		this.startActivity(intent);
		this.finish();
	}

}
