package baekjun;

import java.util.Scanner;

public class Pr2819 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String[] channel = new String[num];

		for (int i = 0; i < num; i++) {

			channel[i] = sc.next();
		}
		for (int i = 0; i < num; i++) {

			if (channel[i].equals("KBS1")) {
				String temp = "";

				for (int j = i; j > 0; j--) {
					temp = channel[j - 1];
					channel[j - 1] = channel[j];
					channel[j] = temp;
					System.out.print(4);
				}
				break;

			} else
				System.out.print(1);
		}

		if (channel[1].equals("KBS2"))
			System.exit(0);

		for (int i = 0; i < num; i++) {
			if (channel[i].equals("KBS2")) {
				String temp = "";
				for (int j = i; j > 1; j--) {
					temp = channel[j - 1];
					channel[j - 1] = channel[j];
					channel[j] = temp;
					System.out.print(4);
				}
				break;

			} else
				System.out.print(1);
		}

	}
}
