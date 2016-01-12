package com.isee.stickylistheaderssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.isee.stickylistheaderssample.adapter.MyAdapter;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class MainActivity extends AppCompatActivity {

    private StickyListHeadersListView stickyListHeadersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();
        init();
    }

    private void init() {
        stickyListHeadersListView.setAdapter(new MyAdapter(this));

        stickyListHeadersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getAdapter().getItem(position);
                Toast.makeText(MainActivity.this,item+"99",Toast.LENGTH_LONG).show();


            }
        });
    }

    private void findviews() {
        stickyListHeadersListView = (StickyListHeadersListView) findViewById(R.id.stickyheadlistview);

    }

}
