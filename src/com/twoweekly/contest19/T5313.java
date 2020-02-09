package com.twoweekly.contest19;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 22:46
 */
public class T5313 {

    public double angleClock(int hour, int minutes) {
        double minAngle = minutes / 60.0;
        double hourAngle = (hour / 12.0 + minAngle / 12.0) * 360 ;
        double f = Math.abs(minAngle * 360 - hourAngle);
        if (f > 180){
            f = 360 - f;
        }
        return f;
    }

    public static void main(String[] args) {
        int hour = 12;
        int minutes = 30;
        System.out.println(new T5313().angleClock(hour, minutes));
    }
}
