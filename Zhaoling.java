package acm;

import java.util.Scanner;

public class Zhaoling {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int totalCoin = 1024 - n;
		int count = 0;
		count += (totalCoin / 64);
		totalCoin = totalCoin % 64;
		count += (totalCoin / 16);
		totalCoin = totalCoin % 16;
		count += (totalCoin / 4);
		totalCoin = totalCoin % 4;
		count += totalCoin;
		System.out.println(count);
	}

}
