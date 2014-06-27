package com.penn.androidinterview;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseExpandableListAdapter {

	private static Context context;
	private static List<String> questions;
	private HashMap<String, String> answer;
	private static LayoutInflater inflater;

	public CustomAdapter(Context context, List<String> questions,
			HashMap<String, String> answer) {

		this.context = context;
		this.questions = questions;
		this.answer = answer;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public Object getChild(int groupPosition, int childPosititon) {
		// TODO Auto-generated method stub
		return answer.get(questions.get(groupPosition));
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = inflater.inflate(R.layout.child_adapter_application, null);
		
		TextView textView = (TextView) convertView.findViewById(R.id.answer);
		textView.setText((CharSequence) getChild(groupPosition, childPosition));

		return convertView;
	}

	@Override
	public int getChildrenCount(int arg0) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return questions.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return questions.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int position, boolean arg1, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = inflater.inflate(R.layout.adapter_application, null);

		TextView textView = (TextView) convertView.findViewById(R.id.question);
		textView.setText(questions.get(position));

		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}
