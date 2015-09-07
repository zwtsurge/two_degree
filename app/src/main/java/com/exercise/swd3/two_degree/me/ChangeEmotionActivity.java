package com.exercise.swd3.two_degree.me;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.exercise.swd3.two_degree.R;

public class ChangeEmotionActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton danshenRadioButton,baomiRadioButton,yihunRadioButton,tongxingRadioButton,lianaiRadioButton;
    private TextView saveText,cancelText;
    private String selectedContent,emotionData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_emotion);

        radioGroup = (RadioGroup) findViewById(R.id.emotion);
        danshenRadioButton = (RadioButton) findViewById(R.id.danshen);
        baomiRadioButton = (RadioButton) findViewById(R.id.baomi);
        yihunRadioButton = (RadioButton) findViewById(R.id.yihun);
        tongxingRadioButton = (RadioButton) findViewById(R.id.tongxing);
        lianaiRadioButton = (RadioButton) findViewById(R.id.lianai);
        saveText = (TextView) findViewById(R.id.save);
        cancelText = (TextView) findViewById(R.id.cancel);

        emotionData = getIntent().getStringExtra("emotionData");
        if ("单身".equals(emotionData)){
            danshenRadioButton.setChecked(true);
            selectedContent = danshenRadioButton.getText().toString();
        }
        else if ("保密".equals(emotionData)){
            baomiRadioButton.setChecked(true);
            selectedContent = baomiRadioButton.getText().toString();
        }
        else if ("已婚".equals(emotionData)){
            yihunRadioButton.setChecked(true);
            selectedContent = yihunRadioButton.getText().toString();
        }
        else if ("同性".equals(emotionData)){
            tongxingRadioButton.setChecked(true);
            selectedContent = tongxingRadioButton.getText().toString();
        }
        else if ("恋爱中".equals(emotionData)){
            lianaiRadioButton.setChecked(true);
            selectedContent = lianaiRadioButton.getText().toString();
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == danshenRadioButton.getId()) {
                    selectedContent = danshenRadioButton.getText().toString();
                }
                else if (checkedId == baomiRadioButton.getId()) {
                    selectedContent = baomiRadioButton.getText().toString();
                }
                else if (checkedId == yihunRadioButton.getId()) {
                    selectedContent = yihunRadioButton.getText().toString();
                }
                else if (checkedId == tongxingRadioButton.getId()) {
                    selectedContent = tongxingRadioButton.getText().toString();
                }
                else if (checkedId == lianaiRadioButton.getId()) {
                    selectedContent = lianaiRadioButton.getText().toString();
                }
            }
        });

        saveText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("emotion", selectedContent);
                setResult(2, intent);
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
        getMenuInflater().inflate(R.menu.menu_change_emotion, menu);
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
