package org.aptech;


public class Computation {
   public static final int AVALUE = 6;
   public static double PI = 3.14;
   public int findT(int u, int v){
       return (u + v);
   }

   public int findC(){
      return (findT(3,1) + AVALUE);
   }

   public int findK (int b){
      return (3*b) + findC()/2;
   }

   public void divideTwo(int a, int b){
      if(b != 0){
         System.out.println(a / b);
      }
      else{
         System.out.print("Division is impossible");
      }
   }

   public void gravityTS (double r, double m1, double m2){
      if(r == 0){
         System.out.println("Division impossible");
      }
      else{
         double G = (m1*m2)/Math.pow(r,2);
         System.out.println("Force = "+Math.round(G));
      }
}
}
