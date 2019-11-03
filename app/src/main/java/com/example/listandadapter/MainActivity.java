package com.example.listandadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.listandadapter.adapter.ActorListAdapter;
import com.example.listandadapter.model.Actor;
import com.example.listandadapter.utils.DataUtil;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new ActorListAdapter(this,
                DataUtil.generateActors()));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ActorListAdapter adapter = (ActorListAdapter) adapterView.getAdapter();
                Actor actor = adapter.getItem(position);
                Toast.makeText(getBaseContext(), actor.getName(), LENGTH_SHORT).show();
            }
        });
    }
}
