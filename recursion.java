import java.util.*;
/* 
Program to implement recursion
*/
class recursion
{
	//Method main
	public static void main(String[] p)
	{	
		String g =input ("Please enter an expression");
		int result = evaluate(g);
		print("The result is : "+result);
		System.exit(0);
	}//end of main

	//Recursive method to evaluate the string
	public static int evaluate(String s)
	{ 
		int a , b;
		int sum=0;
		int n;
		if (s.charAt(0)=='S'||s.charAt(0)=='s')
		{
			n=evaluate(s.substring(1));
			sum=(n*(n+1))/2;
			return sum;
		}

		else if(s.charAt(0)=='+')
		{
		a=evaluate(s.substring(1));
		b=evaluate(s.substring(2));
		return a+b;
		}
		else 
		return Character.getNumericValue(s.charAt(0));
	}


       // Method to print statements
	public static void print(String s)
	{
		System.out.println(s);
	}


       // Method to accept Strings from the user
	public static String input(String i)
	{       
		Scanner scanner =new Scanner (System.in);
		print (i);
		return scanner.nextLine();
	}

}//end of class
