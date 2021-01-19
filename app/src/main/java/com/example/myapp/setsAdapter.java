package com.example.myapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class setsAdapter extends BaseAdapter {

    private int noOfSets;


    public setsAdapter(int noOfSets) {
        this.noOfSets = noOfSets;
    }

    @Override
    public int getCount() {
        return noOfSets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if ((convertView ==null))
        {
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.set_layout,parent,false);
        }

        else
        {
            view=convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(parent.getContext(),QuestionActivity.class);
                intent.putExtra("SETNO",position);
                parent.getContext().startActivity(intent);
            }
        });
        ((TextView) view.findViewById(R.id.setno)).setText(String.valueOf(position+1));

        return view;
    }
}
