package com.exercise.swd3.two_degree.message;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.exercise.swd3.two_degree.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by swd3 on 8/27/15.
 */
public class MessageActivity extends Activity{
    private int[] images = new int[]
            {R.drawable.u233,R.drawable.u233,R.drawable.u233,R.drawable.u233,R.drawable.u233,R.drawable.u233,R.drawable.u233};
    private String[] names = new String[]
            {"Alan","sunny","leo","jayson","surge","dy","aoa"};
    private String[] times = new String[]
            {"09:55","10.05","10.12","10.24","10.29","10.44","10.50"};
    private String[] info = new String[]
            {"吃过了没？","我吃过了！","你没吃啊？","去吃啊！","去哪吃呢？","都可以啊！","你定吧！"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);
        List<Map<String,Object>> listitems = new ArrayList<>();
        for (int i = 0;i < images.length;i++)
        {
            Map<String,Object> listitem = new HashMap<>();
            listitem.put("iamge",images[i]);
            listitem.put("name",names[i]);
            listitem.put("time",times[i]);
            listitem.put("infos",info[i]);
            listitems.add(listitem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listitems,R.layout.message_item,
                new String[] {"iamge" , "name" , "time" , "infos"},
                new int[] {R.id.image , R.id.name , R.id.time , R.id.info} );
        ListView listView = (ListView) findViewById(R.id.messageList);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MessageActivity.this,SendMessActivity.class));
            }
        });
    };
}