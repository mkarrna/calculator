package calculator;

import java.util.Scanner;

public class Calculator{
        public static void main(String[] args){
        		Scanner sc = new Scanner(System.in);
        		 String input1= getInput("Enter value one:");
                 String input2= getInput("Enter value two:");
               	int ch,input2ref;
                try{
              
					do
                	{
                		System.out.println("**************MENU****************");
                		System.out.println("1.ADDITION\n 2.SUBSTRACTION\n 3.MULTIPLICATION\n 4.DIVISION\n");
                		System.out.println("-----------------------------------");
                		System.out.println("Enter your choice");
                		ch= Integer.parseInt(sc.next());
                   switch(ch){
                         case 1:	System.out.println("-----------------------------------");
                        	 		System.out.println("Answer   :"+ addValues(input1,input2));
                               		break;
                         case 2: 	System.out.println("-----------------------------------");
                        	 		System.out.println("Answer   :"+subtractValues(input1,input2));
                        	 		break;
                         case 3:	System.out.println("-----------------------------------");
                        	 		System.out.println("Answer   :"+ multiplyValues(input1,input2));
                        	 		break;
                        	 		
                        	 		
                         case 4:	System.out.println("-----------------------------------");
                        	 		input2ref= Integer.parseInt(input2);
                        	 		if(input2ref==0)
                        	 		{
                        	 				System.out.println("divided by zero exception!");
                        	 				break;
                        	 		}
                        	 		else
                        	 		{
                        	 				System.out.println("Answer    :"+divideValues(input1,input2));
                        	 				break;
                        	 		}
                        
                         default:	System.out.println("-----------------------------------");
                        	 		System.out.println("INVALID OPTION");
                        	 		continue;
                        	 		
                        	 		
                        	 
                     }
                  
                	}
					while(ch>=1&&ch<=4);
                
                 }
                	catch(Exception e){
                    System.out.println(e.getMessage());
                 }
               }
               private static double addValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a+b;
               }
               private static double subtractValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a-b;
               }
               private static double multiplyValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a*b;
               }
               private static double divideValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a/b;
               }
               private static String getInput(String prompt){
                       System.out.print(prompt);
                       Scanner scan= new Scanner(System.in);
                       return scan.nextLine();
               }
 }
 