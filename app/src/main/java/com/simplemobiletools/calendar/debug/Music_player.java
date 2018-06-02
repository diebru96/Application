package com.simplemobiletools.calendar.debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.simplemobiletools.calendar.R;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music_player extends AppCompatActivity {

    ArrayList<String> arrayList;
    ListView listView;
    ArrayAdapter<String> adapter;
    final static String url="http//./api/v1.0/music";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        listView= (ListView) findViewById(R.id.ListViewPlay);
        arrayList=new ArrayList<>();
        arrayList=getSongs();

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //open

             Toast.makeText(getBaseContext(), "Play", Toast.LENGTH_SHORT ).show();

            }
        });
    }

    public static ArrayList<String> getSongs(){
        RestTemplate restTemplate = new RestTemplate();
        String[] songs = restTemplate.getForObject(url, String[].class);
        return (ArrayList<String>) Arrays.asList(songs);
    }
}
