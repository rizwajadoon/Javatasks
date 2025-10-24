
package javalabtask;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        //initialising ;
        String pizzasize ,pepperonisize;
        char pepperoni, cheese;
        int totalprice=0;
        // using while loop for validating pizza size 
        while (true ){
            System.out.println("Enter your pizza size: small->100/medium->200/large->300");
            pizzasize=x.nextLine().toLowerCase();
            if (pizzasize.equals("small" )|| pizzasize.equals("medium" ) || pizzasize.equals("large" ) ){
                break;
            }
            else {
                System.out.println("invalid pizza size !");
                
            }   
            //using switch case for adding price to bill acc to pizza size;
        }
        switch(pizzasize){
            case "small": 
                totalprice=100;
                break;
             case "medium": 
                totalprice=200;
                break;
                 case "large": 
               totalprice=300;
                break;  
                 default:
                     System.out.println("invalid !");
        }
        // options for pepperoni and cheese 
        System.out.println("Do you want to add pepperoni: small=+30, medium/large=+50.(y/n)");
        pepperoni =x.next().charAt(0);
        if (pepperoni == 'Y'||  pepperoni == 'y'){
            if (pizzasize.equals("small")){
                totalprice+=30;
            }
            else {
                totalprice+=50;
            }
        }
        
           
        System.out.println("do you want to add cheese:(y/n)+20");
        cheese = x.next().charAt(0);
        if(cheese=='y' || cheese=='Y'){
            totalprice+=20;}
        else{
            totalprice+=0;
            
        }
        // printing the total bill
        System.out.println("your total bill is : "+totalprice);
        
        }
        
            
    }


