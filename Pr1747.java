package baekjun;

import java.util.Scanner;

public class Pr1747 {

	public static void main(String[] args) {

		int N;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int i = N; i < 1000000; i++) {
			if (isPrime(i) == 1 && checkPalindrome(i) == true) {

				System.out.println(i);
				break;
			}
		}
	}

	public static boolean checkPalindrome(int n) {
		String s = Integer.toString(n);
		char[] a = new char[10];

		a = s.toCharArray();

		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - i - 1])
				return false;
		}
		return true;
	}

	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;
	}

}
