package com.example.fainal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class page2 extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
       listView=findViewById(R.id.list_v);
        ArrayList<String> listv=new ArrayList<>();
        listv.add("Jerusalem");
        listv.add("Gaza");
        listv.add("Ramallah");
        listv.add("jenin");
        listv.add("Nablus");
        listv.add("Tulkarm");
        listv.add("Al-Khalil");
        listv.add("Haifa");
        listv.add("Yafa");
        listv.add("Areeha");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listv);
        listView.setAdapter(adapter);
        listView.getSelectedItem();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==0){
                   Toast.makeText(page2.this, "Jerusalem", Toast.LENGTH_SHORT).show();

               }else  if (position==1){
                   Toast.makeText(page2.this, "Gaza", Toast.LENGTH_SHORT).show();
               } else if (position==2){
                    Toast.makeText(page2.this, "Ramallah", Toast.LENGTH_SHORT).show();
                }  else if (position==3){
                   Toast.makeText(page2.this, "jenin", Toast.LENGTH_SHORT).show();
               }else if (position==4){
                   Toast.makeText(page2.this, "Nablus", Toast.LENGTH_SHORT).show();
               } else if (position==5){
                   Toast.makeText(page2.this, "Tulkarm", Toast.LENGTH_SHORT).show();
               } else if (position==6){
                   Toast.makeText(page2.this, "Al-Khalil", Toast.LENGTH_SHORT).show();
               } else if (position==7){
                   Toast.makeText(page2.this, "Haifa", Toast.LENGTH_SHORT).show();
               } else if (position==8){
                   Toast.makeText(page2.this, "Yafa", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(page2.this, "Areeha", Toast.LENGTH_SHORT).show();
               }

            }
        });




    }
}