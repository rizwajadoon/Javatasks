
package javalabtask;

import java.util.Scanner;
public class q9 {
   public static int total;
    public static int totalMarks (int a,int b, int c){
        int total= a+b+c;
        return total;
    }
   public static double AverageMarks(double a){
        return a/3.0;
    }
    public static char grade(double avg) {
        if (avg >= 85) {
            return 'A';
        } else if (avg >= 70) {
            return 'B';
        } else if (avg >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        //  marks input from user
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = x.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = x.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = x.nextInt();
        
        // Calculate total marks using the function
        total=totalMarks(subject1, subject2, subject3);
        
        // Calculate average using the function
        double average = AverageMarks(total);
        
        // Determine grade using the function
        char studentGrade = grade(average);
        
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        
      
        if (studentGrade == 'F') {
            System.out.println("Grade = Fail");
        } else {
            System.out.println("Grade = " + studentGrade);
        }
        
    }
}
