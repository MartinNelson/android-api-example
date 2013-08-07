package com.choiboi.apiexamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.choiboi.apiexamples.camera.CameraMainActivity;
import com.choiboi.apiexamples.gallery.GalleryMainActivity;
import com.choiboi.apiexamples.toast.ToastMainActivity;

public class MainActivity extends Activity {
    
    private final String[] LIST = new String[]{ "Toast", "Camera", "Gallery" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listView = (ListView)findViewById(R.id.main_listview);
        
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LIST);
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), ToastMainActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), CameraMainActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), GalleryMainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
