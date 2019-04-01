package acm;

import java.util.LinkedList;

public class ListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("e");
		list.push("str");
		System.out.println(list.getFirst());
		for(String str:list) {
			System.out.println(str);
		}
	}

}
