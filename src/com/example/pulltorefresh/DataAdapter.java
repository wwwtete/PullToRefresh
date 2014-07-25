package com.example.pulltorefresh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class DataAdapter extends BaseAdapter {
	Context mContext;

	public DataAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
		return 20;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = View.inflate(mContext, R.layout.grid_item, null);
		}
		TextView tv=(TextView)convertView.findViewById(R.id.tv);
		tv.setText("text"+position);
		tv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(mContext, ((TextView)v).getText(), Toast.LENGTH_SHORT).show();
			}
		});
		return convertView;
	}
}