package acm;

import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k, m, index;
		n = scan.nextInt();
		k = scan.nextInt();
		m = scan.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 1; i <= n; i++) {
			arr.add(String.valueOf(i));
		}
		index = k - 1;
		index = (index + m - 1) % n;
		System.out.print(arr.get(index));
		arr.remove(index);
		for(int i = 0; i < n-1; i++) {
			index = (index + m - 1) % arr.size();
			System.out.print(" ");
			System.out.print(arr.get(index));
			arr.remove(index);
		}
	}

}
