package day1;

public class FirstJava 
{
   public static void main (String args[])
   {
	   System.out.println("Welcome");
	   
	   int a=10;
	   int b=20;
	   System.out.println("sum of a and b is: "+ (a+b));
	   System.out.println();  //syso and ctrl + space
	   
	   //ternary operator
	   
	   int x = (a<b)? a: b ;
	   System.out.println(x);
	   
	   int person_age=30;
	   String res=(person_age>=18)? "aligible" : "not aligible";
	   System.out.println(res);
   }
   
}
	
	
	

