package Epam3.Calculater;
import java.util.*;
import java.io.*;
public class App {
	public static void main( String[] args ){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter First Number");
     float num1 = input.nextFloat();
     System.out.println("Enter Second Number");
     float num2 = input.nextFloat();
     System.out.println("Enter option");
     System.out.println("1. Addition"+"\n"+"2. Subtraction"+ "\n"+"3. Multiplication"+ "\n"+"4. Division");
     int op  = input.nextInt();
     switch(op) {
       case 1:
    	   Addition addition = new Addition(num1,num2);
    	   float sum = addition.add();
    	   System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
    	   break;
       case 2:
    	   Subtraction subtract = new Subtraction(num1,num2);
    	   float diff = subtract.subtract();
    	   System.out.println("Subtraction of "+num1+" and "+num2+" is "+diff);
    	   break;
       case 3:
    	   Multiplication multip = new Multiplication(num1,num2);
    	   float mul = multip.multiply();
    	   System.out.println("Multiplication of "+num1+" and "+num2+" is "+mul);
    	   break;
       case 4:
    	   Division division = new Division(num1,num2);
    	   float div = division.divide();
           System.out.println("Division of "+num1+" and "+num2+" is "+div);
           break;
       default:
    	   System.out.println("Invalid Option"); 	   
     }      
    }
}
