package com.exercise.swd3.two_degree;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;

import com.exercise.swd3.two_degree.dynamic.DynamicActivity;
import com.exercise.swd3.two_degree.infomation.InformationActivity;
import com.exercise.swd3.two_degree.me.MeActivity;
import com.exercise.swd3.two_degree.twoDegree.TwoDegree;

/**
 * Created by swd3 on 8/27/15.
 */
public class MainActivity extends TabActivity {
    private TabHost tabhost;
    private RadioGroup main_radiogroup;
    private RadioButton tab_two_degree, tab_info, tab_dynamic,tab_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tab_two_degree = (RadioButton) findViewById(R.id.two_degreeBtn);
        tab_info = (RadioButton) findViewById(R.id.informationBtn);
        tab_dynamic = (RadioButton) findViewById(R.id.dynamicBtn);
        tab_me = (RadioButton) findViewById(R.id.meBtn);
        main_radiogroup = (RadioGroup) findViewById(R.id.main_radiogroup);

        tabhost = this.getTabHost();
        tabhost.addTab(tabhost.newTabSpec("two_degree").setIndicator("twodegree").setContent(new Intent(this,TwoDegree.class)));
        tabhost.addTab(tabhost.newTabSpec("info").setIndicator("info").setContent(new Intent(this,InformationActivity.class)));
        tabhost.addTab(tabhost.newTabSpec("dynamic").setIndicator("dynamic").setContent(new Intent(this,DynamicActivity.class)));
        tabhost.addTab(tabhost.newTabSpec("me").setIndicator("me").setContent(new Intent(this, MeActivity.class)));

        CheckListener checkradio = new CheckListener();
        main_radiogroup.setOnCheckedChangeListener(checkradio);
        tabhost.setCurrentTab(0);
    }
    public class CheckListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            // TODO Auto-generated method stub
            switch(checkedId){
                case R.id.two_degreeBtn:
                    tabhost.setCurrentTab(0);
                    break;
                case R.id.informationBtn:
                    tabhost.setCurrentTab(1);
                    break;
                case R.id.dynamicBtn:
                    tabhost.setCurrentTab(2);
                    break;
                case R.id.meBtn:
                    tabhost.setCurrentTab(3);
                    break;
            }


        }
    }

}
