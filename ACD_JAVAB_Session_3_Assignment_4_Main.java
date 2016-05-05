package session3;
import java.util.Scanner;
public class ACD_JAVAB_Session_3_Assignment_4_Main 
{
	public static void main(String[] args) 
	{
		int num1, num2;
		double result;
		String operator;
		Scanner s = new Scanner(System.in);
		System.out.println("Arithmetic Operation");
		System.out.println("--------------------");		
		System.out.print("Enter First Number : ");
		num1 = s.nextInt();
		System.out.print("Enter Second Number : ");
		num2 = s.nextInt();
		System.out.print("Operator : ");
		operator = s.next();
		result = result(num1, num2, operator); 
		s.close();
		if (operator.matches("/"))
			System.out.println(num1 + operator + num2 + " = " + result);
		else
			System.out.println(num1 + operator + num2 + " = " + (int)result);
	}
	public static double result(int a, int b, String op)
	{
		double result = 0;
		switch (op)
		{
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
		}
		return (result);
	}
}
