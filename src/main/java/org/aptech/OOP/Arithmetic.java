package org.aptech.OOP;

public class Arithmetic {

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }


    public double monthlyInterest(double P, double r, double n){
        double M;
      double R;
        R = r/(12*100);
        M = (P*R)*Math.pow((1+R), n)/(Math.pow((1+R), n));
        return  M;
    }

}

