package com.exercise.swd3.two_degree.message;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.exercise.swd3.two_degree.MainActivity;
import com.exercise.swd3.two_degree.R;
import com.exercise.swd3.two_degree.twoDegree.FriendDetailActivity;

/**
 * Created by swd3 on 8/31/15.
 */
public class SendMessActivity extends Activity {
    ListView sendMessList;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendim);
        sendMessList = (ListView) findViewById(R.id.sendMessList);
        BaseAdapter Adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return 5;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View views = LayoutInflater.from(SendMessActivity.this).inflate(R.layout.sendmess_item,null);
                return views;
            }
        };
        sendMessList.setAdapter(Adapter);

        findViewById(R.id.callback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendMessActivity.this.finish();
                Intent it
                = new Intent(SendMessActivity.this, MainActivity.class);
                it.putExtra("flag", 1);
                it.addFlags(102);
                startActivity(it);
            }
        });
     }

}