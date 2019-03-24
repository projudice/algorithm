package acm;

import java.util.Scanner;

public class Openlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String lockState = scan.next();
		String screte = scan.next();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int temp = Math.abs(lockState.charAt(i) - screte.charAt(i));
			if(temp > 5) {
				result += (10 - temp);
			}else {
				result += temp;
			}
		}
		System.out.println(result);
	}

}
