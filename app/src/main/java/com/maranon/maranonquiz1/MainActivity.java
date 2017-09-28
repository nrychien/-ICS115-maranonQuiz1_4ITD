package com.maranon.maranonquiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] versions;
    String[] androidEst;
    int[] logos;
    ListView lvVersions;
    CustomAdapter adapter;
    List<Versions> listNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNames = new ArrayList<Versions>();
        versions = getResources().getStringArray(R.array.androidVersions);
        androidEst = getResources().getStringArray(R.array.androidYears);
        lvVersions = (ListView) findViewById(R.id.androidList);
        logos = new int[] {R.drawable.androiddonut, R.drawable.androidkitkat, R.drawable.androidoreo};

        for(int i = 0; i < versions.length; i++){
            listNames.add(new Versions(logos[i], versions[i], androidEst[i]));
        }

//        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        adapter = new CustomAdapter(this, listNames);
        lvVersions.setAdapter(adapter);


        lvVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + versions[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
