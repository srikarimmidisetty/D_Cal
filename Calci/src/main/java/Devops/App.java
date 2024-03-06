package Devops;

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        double num1,num2,Result;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers ");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        Result=num1+num2;
        System.out.print("Addition of two numbers " + Result);
       
    }
}
