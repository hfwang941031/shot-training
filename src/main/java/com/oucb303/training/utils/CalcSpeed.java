package com.oucb303.training.utils;

import android.util.Log;

import com.oucb303.training.activity.ShotActivity;

/**
 * Created by 王海峰 on 2017/10/30.
 */
/*
* 还要有设置距离和段数的函数
* */
public class CalcSpeed {
    //定义固定距离为0.1m
    private double distance = 0.10;
    public double[] calcSpeed(long []duringTime)
    {
        double []speed = new double[10];
        for (int i=0;i<duringTime.length;i++)
        {
            speed[i] = distance / duringTime[i];
            Log.d("显示速度", "速度" + i + speed[i]);
        }
       /* for (int i=0;i<speed.length;i++)
        {
            Log.d("显示速度", "速度" + i + speed[i]);
        }*/
        return speed ;
    }
}
