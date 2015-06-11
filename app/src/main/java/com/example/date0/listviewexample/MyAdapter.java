package com.example.date0.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.date0.listviewexample.R;

class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater  theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout2, parent);

        String tvShow = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(tvShow);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);
        theImageView.setImageResource(R.drawable.dot);
        return super.getView(position,convertView,parent);
    }
}