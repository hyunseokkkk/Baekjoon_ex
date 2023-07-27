package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pr8979 {

	static int n, k;
	static ArrayList<Node> arr = new ArrayList<>();
	static int end_point = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] t = br.readLine().split(" ");
		n = Integer.parseInt(t[0]);
		k = Integer.parseInt(t[1]);

		for (int i = 0; i < n; i++) {
			String[] t2 = br.readLine().split(" ");
			int num = Integer.parseInt(t2[0]);
			int gold = Integer.parseInt(t2[1]);
			int silver = Integer.parseInt(t2[2]);
			int bronze = Integer.parseInt(t2[3]);
			arr.add(new Node(num, gold, silver, bronze, 0));

		}

		Collections.sort(arr);

		arr.get(0).rank = 1;

		for (int i = 1; i < arr.size(); i++) {
			int tem_gold = arr.get(i - 1).gold;
			int tem_silver = arr.get(i - 1).silver;
			int tem_bronze = arr.get(i - 1).bronze;
			Node now = arr.get(i);
			if (arr.get(i).num == k) {
				end_point = i;
			}  if (now.gold == tem_gold && now.silver == tem_silver && now.bronze == tem_bronze) {
				arr.get(i).rank = arr.get(i - 1).rank;
			} else {
				arr.get(i).rank = i + 1;
			}

		}

		System.out.println(arr.get(end_point).rank);

	}

}

class Node implements Comparable<Node> {

	int rank, gold, silver, bronze, num;

	public Node(int num, int gold, int silver, int bronze, int rank) {
		
		this.num = num;
		this.rank = rank;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if (o.gold == this.gold) {
			if (o.silver == this.silver) {

				return o.bronze - this.bronze;

			} else
				return o.silver - this.silver;

		}

		else {

			return o.gold - this.gold;

		}
	}
}
