package com.vishwas.grdiviewimage83;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vishwas.grdiviewimage83.R;

/**
 * Created by Vishwas on 7/23/2017.
 */

public class MyGrdiAdapter extends BaseAdapter {

    Context context;
    Integer[]images;
    View view;
    LayoutInflater layoutInflater;

    public MyGrdiAdapter(Context context, Integer[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount()
    {

        return images.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            view=new View(context);
            view = layoutInflater.inflate(R.layout.images,null);// inflate the layout
            // get the reference of ImageView
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            imageView.setImageResource(images[position]);//set logo images

        }

        return view;
    }
}



