package simpleCalculator;

import java.util.Scanner;

public class simple{

       public static void main(String[] args){
                 Scanner scan= new Scanner(System.in);
                 System.out.println("**SIMPLE CALCULATOR**");
                 System.out.print("Enter First number:");
                 double n1= scan.nextDouble();
                 System.out.print("Enter second number:");
                 double n2= scan.nextDouble();
                 System.out.println("Addition Result is       :"+(n1+n2));
                 System.out.println("Substraction Result is   :"+(n1-n2));
                 System.out.println("Multiplication Result is :"+(n1*n2));
       }
}