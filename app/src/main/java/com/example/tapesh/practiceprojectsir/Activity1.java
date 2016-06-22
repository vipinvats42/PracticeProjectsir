package com.example.tapesh.practiceprojectsir;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import java.util.ArrayList;

/**
 * Created by TAPESH on 6/9/2016.
 */
public class Activity1 extends Activity{
    ArrayAdapter<String> adapter,adapter2;

   ListView listView;
   ArrayList<String> list1,list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);







        list1=new ArrayList<String>();



        listView=(ListView)findViewById(R.id.listView);

        RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.relative);
        RelativeLayout.LayoutParams lpramsj2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                120
        );
        int j1=120;
        for(int i=1;i<20;i++)
        {

            list1.add("list"+i+"                  "+"summary"+i+""  );






        }


        for(int j2=1;j2<20;j2++)
        {



            lpramsj2.setMargins(750, j1, 0, 0);
            Button tvj2 = new Button(this);
            tvj2.setText("Approval");
            tvj2.setLayoutParams(lpramsj2);


            rLayout.addView(tvj2);
            j1=j1+150;

        }

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1);
        listView.setAdapter(adapter);




    }
    }
