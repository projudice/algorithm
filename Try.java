package acm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Try {

	public int[] test(int a[]) {
		int len = a.length;
		int[] temp = new int[len];
		for(int i = 0; i < len; i++) {
			temp[i] = a[i];
		}
		return temp;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Try t = new Try();
		Scanner scan = new Scanner(System.in);
		byte[] n = new byte[10];
		int c;
		String str;
		ArrayList<String> arr = new ArrayList<String>();
//		c = scan.nextInt();
//		str = scan.next();
//		System.out.println(c+str);
//		c = System.in.read();
//		if(c == '1') System.out.println(1);
//		int arr[] = {4,2,3};
//		Arrays.sort(arr);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(t.test(arr)[i]);
//		}
		c=0;
		str = String.valueOf(c);
		arr.add("1");
		arr.add(" ");
		System.out.println(arr.size());
	}

}
