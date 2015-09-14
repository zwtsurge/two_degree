package com.exercise.swd3.two_degree.util;

import android.util.Log;

import com.exercise.swd3.two_degree.constants.SystemConstants;


public class LogUtil {

	public static boolean Debug=true;
	
	public static void i(String str){
		if(Debug){
		Log.i(SystemConstants.LOG_NAME, str);
		}
	}
	
	
}
