package org.aptech;

import java.util.Scanner;

public class QuadraticEqn {
    static Scanner scanner =  new Scanner(System.in);



    public static void quadraticEqn(double a ,double b,double c){
        double i = a * c;
        double d = Math.pow(b,2) - (4 * i);
        double x1, x2;
        if(d == 0){
            System.out.println("EQUAL ROOTS");
            x1 = -b / (2*a);
            System.out.println("x1 = "+ x1 +"\nx2 = "+x1);
        }else if(d > 0) {
            System.out.println("UNEQUAL ROOTS");
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }else{
            System.out.println("ABSOLUTE VALUE");
        }
    }
}
