package com.penn.androidinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class ActivityAndroidApplication extends Activity {

	private static List<String> appQuestions;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_android_application);

		ExpandableListView androidApplication = (ExpandableListView) findViewById(R.id.androidApplication);

		appQuestions = new ArrayList<String>();
		appQuestions.add("Q1: What is Android software Stack?");
		appQuestions.add("Q2: What is the StrictMode in android?");
		String answer1 = "On top of the Linux kernel, there are the middleware, libraries and APIs written in C, and application software running on an application framework which includes Java-compatible libraries based on Apache Harmony.ьз";
		String answer2 = "StrictMode is a developer tool which detects things you might be doing by accident and brings them to your attention so you can fix them.";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(appQuestions.get(0), answer1);
		map.put(appQuestions.get(1), answer2);

		androidApplication
				.setAdapter(new CustomAdapter(this, appQuestions, map));

		// Listview Group expanded listener
		androidApplication.setOnGroupExpandListener(new OnGroupExpandListener() {

					@Override
					public void onGroupExpand(int groupPosition) {
						Toast.makeText(
								getApplicationContext(),
								appQuestions.get(groupPosition) + " Expanded",
								Toast.LENGTH_SHORT).show();
					}
				});

	}

}
