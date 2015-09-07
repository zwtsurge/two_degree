package com.exercise.swd3.two_degree.me;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.exercise.swd3.two_degree.R;

public class ChangeNameActivity extends Activity {

    private EditText nameEditText;
    private String selectedContent;
    private TextView saveText,cancelText;
    private String nameData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_name);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        saveText = (TextView) findViewById(R.id.save);
        cancelText = (TextView) findViewById(R.id.cancel);

        nameData = getIntent().getStringExtra("nameData");
        nameEditText.setText(nameData);

        saveText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                selectedContent = nameEditText.getText().toString();
                intent.putExtra("name", selectedContent);
                setResult(1, intent);
                finish();
            }
        });

        cancelText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_change_name, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
