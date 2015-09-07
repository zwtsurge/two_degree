package com.exercise.swd3.two_degree.me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.exercise.swd3.two_degree.R;


public class MeActivity extends Activity {

    private LinearLayout name;
    private LinearLayout emotion;
    private LinearLayout age;
    private LinearLayout sex;
    private TextView nameTextView,emotionTextView,ageTextView,sexTextView;
    private String nameData,emotionData,ageData,sexData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);

        name = (LinearLayout) findViewById(R.id.name);
        emotion = (LinearLayout) findViewById(R.id.emotion);
        age = (LinearLayout) findViewById(R.id.age);
        sex = (LinearLayout) findViewById(R.id.sex);

        nameTextView = (TextView) findViewById(R.id.nameSelect);
        emotionTextView = (TextView) findViewById(R.id.emotionSelect);
        ageTextView = (TextView) findViewById(R.id.ageSelect);
        sexTextView = (TextView) findViewById(R.id.sexSelect);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendData = new Intent(MeActivity.this, ChangeNameActivity.class);
                nameData = nameTextView.getText().toString();
                sendData.putExtra("nameData",nameData);
                startActivityForResult(sendData,1);
            }
        });

        emotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendData = new Intent(MeActivity.this, ChangeEmotionActivity.class);
                emotionData = emotionTextView.getText().toString();
                sendData.putExtra("emotionData",emotionData);
                startActivityForResult(sendData,2);
            }
        });

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendData = new Intent(MeActivity.this, ChangeAgeActivity.class);
                ageData = ageTextView.getText().toString();
                sendData.putExtra("ageData", ageData);
                startActivityForResult(sendData,3);
            }
        });

        sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendData = new Intent(MeActivity.this, ChangeSexActivity.class);
                sexData = sexTextView.getText().toString();
                sendData.putExtra("sexData", sexData);
                startActivityForResult(sendData,4);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 1 && resultCode == 1){
            nameTextView.setText(data.getStringExtra("name"));
        }
        else if (requestCode == 2 && resultCode == 2){
            emotionTextView.setText(data.getStringExtra("emotion"));
        }
        else if (requestCode == 3 && resultCode == 3){
            ageTextView.setText(data.getStringExtra("age"));
        }
        else if (requestCode == 4 && resultCode == 4){
            sexTextView.setText(data.getStringExtra("sex"));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_me, menu);
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
