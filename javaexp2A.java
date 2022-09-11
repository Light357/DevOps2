//import java.util.*;
import java .util.Scanner;

public class javaexp2A
{
    static void GetArea(){
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length: ");
         double l= s.nextDouble();
        System.out.println("Enter the breadth: ");
         double b= s.nextDouble();
        
          
          double  area=l*b;
      System.out.println("Area of Rectangle is: " + area);      
    }

    static void SetDim(){

    int l=10;
    int b=5;
    int c=l*b;
    System.out.println("The are of rectangle is "+c);
    }

   public static void main(String args[]) 
    {   
     // Scanner GetArea=new Scanner(System.in); 
    GetArea();
    SetDim();
      
   }

}
    

