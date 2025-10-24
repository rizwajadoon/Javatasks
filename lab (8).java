
package javalabtask;
import java.util.Scanner;
    

public class q3 {
    // creating addition function with return type and arguments
    public static int add(int x, int y){
      int  sum = x + y;
         System.out.println("sum of 2 numbers is ="+sum);
        return sum;
}
    // creating difference function with return type and arguments
    public static int diff(int x, int y){
        
      int  diff = x-y;
        System.out.println("difference  of 2 numbers is = "+diff);    
        return diff;
}
    // creating multiplication function with return type long and arguments
    public static long mul(long x, long y){
       
      long  mul = x *y;
        System.out.println("multiplication of 2 numbers is = "+mul);  
        return mul;
}
    // creating divide function with return type double and arguments
    public static double  div(double x , double y){
             double  div = x/y;
        System.out.println("division of 2 numbers is = "+div); 
        return div;
}
    // taking input from user and calling function:
       public static void main(String[] args) {
         Scanner x =new Scanner(System.in);
        System.out.println("enter first number :");
        int a=x.nextInt();
        System.out.println("enter second number :");
        int b=x.nextInt();
        add(a,b);
        diff(a,b);
        mul(a,b);
        div(a,b);
        
    }
    
}
