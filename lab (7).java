
package javalabtask;

import java.util.Scanner;

public class q4 {
    public static int totalmarks(int x,int y, int z){
    int sum = x+y+z;
    return sum;
}
    public static double averagemarks(int x,int y, int z){
       int obtmarks= totalmarks(x,y,z);
    double avg = ( (obtmarks/300.0)*100);
    return avg;
}
    public static void grade(int x, int y, int z ){
        double  avg= averagemarks(x,y,z);
          if ((avg) >= 85){
       System.out.println(" Grade : 'A");
   }
   else if (avg>= 70 && avg <=85){
       System.out.println("Grade : 'B' ");
   }
    else if (avg>= 60 && avg <=70){
       System.out.println("Grade : 'C' ");
   }
    else if (avg>= 50 && avg <=50){
       System.out.println("Grade : 'D' ");
   }
    else{
        System.out.println("Grade: F");
    }
   
   
}
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("enter marks of 1st subject :");
        int a=x.nextInt();
        System.out.println("enter marks of second subject :");
        int b=x.nextInt();
         System.out.println("enter marks of third subject :");
        int c=x.nextInt();

       int total= totalmarks(a,b,c);
        System.out.println("total marks of 3 subjects =" +total );
       double average= averagemarks(a,b,c);
        System.out.println("Average of total marks =" +average);
        grade(a,b,c);
    }
}
