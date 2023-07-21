package baekjun;

import java.util.Scanner;

public class Pr1100 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = num1;
		int n = 0;
		
		while(true) {
		num2 = (num2%10)*10 + (num2/10 + num2%10)%10;
		
		n++;
		if(num1 == num2) {
		break;	
		}
		
		}
		System.out.println(n);
	}
	
	
}
