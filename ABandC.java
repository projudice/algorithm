package acm;
//A+BºÍC
import java.util.Scanner;

public class ABandC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean []result = new boolean[n];
		for(int i = 0; i < n; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			if(a + b > c) {
				result[i] = true;
			}else {
				result[i] = false;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
		
		
	}

}
