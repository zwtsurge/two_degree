package com.exercise.swd3.two_degree.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.exercise.swd3.two_degree.R;


/**
 * Created by swd3 on 8/27/15.
 */
public class DynamicActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.dynamic);
    }
}
