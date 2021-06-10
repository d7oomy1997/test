package calculator;

import java.util.*;
public class calculator1 {

	public static void main(String[] args) {
	Scanner cl=new Scanner (System.in);
	double num1 =cl.nextDouble();
	
	char Op =cl.next().charAt(0);
	
	double num2 =cl.nextDouble();
	double result=0.0;
	
	switch(Op) {
	case '+':
		result =num1 +num2;
		System.out.println(result);
	break;
	
	case '-':
		result =num1 -num2;
		System.out.println(result);
	break;
	
	case '*':
		result =num1 *num2;
		System.out.println(result);
	break;
	
	case '/':
		result =num1 / num2;
		System.out.println(result);
	break;
	
	default:
		System.out.println("invalid Op ");
		break;
		
	}
	}

}
