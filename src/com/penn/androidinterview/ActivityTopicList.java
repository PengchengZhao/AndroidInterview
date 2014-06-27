package com.penn.androidinterview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityTopicList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_topic_list);

		ListView topicList = (ListView) findViewById(R.id.topicList);

		String[] topics = { "Android Application", "Activity" };

		ArrayAdapter<String> topicAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, topics);
		topicList.setAdapter(topicAdapter);

		topicList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				
				if(position==0){
					
					Intent i1=new Intent(getApplicationContext(), ActivityAndroidApplication.class);
					startActivity(i1);
				}
				
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_topic_list, menu);
		return true;
	}

}
