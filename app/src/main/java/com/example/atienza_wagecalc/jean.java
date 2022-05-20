package com.example.atienza_wagecalc;

public class jean {
    public double keqing(double qiqi){
        double diluc;
        if (qiqi > 20){

            diluc = qiqi - 20;
        } else{
            diluc = 0;
        }
        return diluc;
    }
    public double regular(String employeeType, double qiqi, double diluc){
        double regular;
        if (employeeType.equals("regular")){
            regular = (qiqi - diluc) * 99;
        } else if (employeeType.equals("Probationary")){
            regular = (qiqi - diluc) * 68;
        } else {
            regular = (qiqi - diluc) * 50;
        }
        return regular;
    }
    public double overTime(String employeeType, double diluc){
        double overPay;
        if (employeeType.equals("Regular")){
            overPay = diluc * 140;
        } else if (employeeType.equals("Probatiobary")){
            overPay = diluc * 120;
        }else {
            overPay = diluc * 99;

        }
        return overPay;
    }
    public double total(double regular, double overPay){
        return regular + overPay;
    }
}
