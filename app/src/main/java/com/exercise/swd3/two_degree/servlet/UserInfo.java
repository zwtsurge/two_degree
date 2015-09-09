package com.exercise.swd3.two_degree.servlet;

import android.content.Intent;
import android.widget.Toast;

import com.exercise.swd3.two_degree.LoginActivity;
import com.exercise.swd3.two_degree.callback.ResultCallback;
import com.exercise.swd3.two_degree.constants.HttpConstants;
import com.exercise.swd3.two_degree.util.HttpUtil;

/**
 * Created by swd3 on 9/8/15.
 */
public class UserInfo {
    public void login(){
//        HttpUtil.doPost(HttpConstants.HTTP_LOGIN, allP, new ResultCallback() {
//
//            @Override
//            public void getReslt(String result) {
//                // TODO Auto-generated method stub
//                if (!result.isEmpty() && !"1".equals(result)) {
//                    BaseBean b = JSON.parseObject(result, BaseBean.class);
//
//                    if ("0".equals(b.getRespcode())) {
//
//                        UserBean u = JSON.parseObject(b.getData(), UserBean.class);
//                        new SharedPreferenceDb(LoginActivity.this).setUserId(u.getId());
//                        new SharedPreferenceDb(LoginActivity.this).setName(u.getName());
//                        Intent intent = new Intent();
//                        intent.putExtra("user", u);
//                        intent.setClass(LoginActivity.this, MainActivity.class);
//                        startActivity(intent);
//
//                        if (new SharedPreferenceDb(LoginActivity.this).getAnimation() == true) {
//                            overridePendingTransition(R.anim.slide_left,
//                                    R.anim.slide_right);
//                        }
//                        close();
//                    } else {
//                        showToast("用户名或密码错误");
//                        close();
//                    }
//                } else {
//                    Toast.makeText(LoginActivity.this, "服务器响应失败", Toast.LENGTH_LONG).show();
//                    close();
//                }
//            }
//        });
    }
}
