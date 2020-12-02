package first;
import java.util.Scanner;
import java.util.*;

public class ArithmeticJava {
	
    //Calculators  
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("Arithmetic Calculator");
	   System.out.println("Enter two numbers below: ");
	   System.out.println("Enter number 1");
	   float a = scan.nextFloat();
	   System.out.println("Enter number 2");
	   float b= scan.nextFloat();
	  
	   
	   System.out.println("Choose your selection: 1) Addition, 2)substraction 3)Multiplication and 4)Division:");
       System.out.println("Enter your selection : \n");
       
      
      int choose = scan.nextInt();
       switch (choose)
       
       {
           case 1 : 
              
               System.out.println("Addition is: " + add(a, b));
               break;
               
           case 2 : 
               System.out.println("Subtraction is: " + sub(a, b));
               break;
               
           case 3 : 
               System.out.println("Multiplication is: " + mul(a, b));
               break;
               
               
           case 4 : 
               System.out.println("Division is: " + div(a, b));
               break;
           
           default:
               System.out.println("Illigal Operation");
        		 
       }   
       
   }
   
   public static float add(float a,float b) {
		
		return a+b;	
	}
  
  public static float sub(float a,float b) {
		
		return a-b;	
	}
  
  public static float mul(float a,float b) {
		
		return a*b;	
	}
  
  public static float div(float a,float b) {
		
		return a/b;	
	}
  
}
       
   
