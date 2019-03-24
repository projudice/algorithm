package acm;

import java.util.Scanner;

public class Jiuzheng {

	public static int sameNum(int index, String str) {
		int count = 1;
		char ch = str.charAt(index);
		for(int i = index+1; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}else {
				return count;
			}
		}
		return count;
	}
	public static String deleteChars(int index, int count, String str) {	
		str = str.substring(0, index) + str.substring(index+count, str.length());
		return str;
	}
	public static String deal(String str) {
		for(int i = 0; i < str.length(); i++) {
			int count = sameNum(i, str);
			if(count >= 3) {
				str = deleteChars(i+2, count-2, str);
			}
		}
		for(int i = 0; i < str.length()-3; i++) {
			int count = sameNum(i, str);
			if(count == 2) {
				if(sameNum(i+2, str) == 2) {
					str = deleteChars(i+2, 1, str);
				}
			}
		}
		return str;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str[] = new String[n+1];
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		for(int i = 0; i < n; i++) {
			System.out.println(deal(str[i]));
		}
	}

}
