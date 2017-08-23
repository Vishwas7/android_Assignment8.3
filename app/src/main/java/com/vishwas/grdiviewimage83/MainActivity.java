package com.vishwas.grdiviewimage83;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaring variable
    GridView gridView;
    // Keeping all Images in array
   Integer[]images={R.drawable.gingerbread,R.drawable.honeycomb,
            R.drawable.ice_cream_sandwich,R.drawable.jelly_bean,R.drawable.kitkat,R.drawable.lollipop};
    //creating array for version names for toast
    String[] versionName = {"Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //casting variable
        gridView=(GridView)findViewById(R.id.GridView);
        //Create an object of MyGrdiAdapter and set Adapter to GirdView
        MyGrdiAdapter grdiAdapter= new MyGrdiAdapter(this,images);
        gridView.setAdapter(grdiAdapter);
        //seting onClickListener and toast
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Version "+ versionName[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}
