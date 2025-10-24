
package javalabtask;
import java.util.Scanner;

public class q5 {
    // creating function for converting temperature from celcius to fehranheit :
    public static double celsiusToFahrenheit(double C){
      double   F = (C * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit = " +F+"°");
      return F;
    }
    // creating function for converting temperature from  fehranheit to celcius :

    public static double fahrenheitToCelsius (double F){
        double C = (F - 32) * 5/9;
        System.out.println("Temperature in celcius = "+C+ "°");
        return C;
    }
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        // taking temperature and choice of conversion as input
        System.out.println("Enter temperature: ");
        double temp=x.nextDouble();
        System.out.println("Enter conversion choice:");
        System.out.println("Enter 'f' for celsius To Fahrenheit: ");
        System.out.println("Enter 'c' for fahrenheit To Celsius: ");
        char choice=x.next().charAt(0);
        // using switch case for conversion according to user choice:
        switch(choice){
            case 'C':
            case 'c':    
               celsiusToFahrenheit(temp);
                break;
            case 'F':
            case 'f':  
                fahrenheitToCelsius (temp);
                break;
            default:
                System.out.println("invalid choice !");
        }
    }
    
}
