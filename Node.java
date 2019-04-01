package acm;

public class Node {

	public Object data;
	public Node next;
	public Node(Object data) {
		this.data = data;
	}
	public void addNext(Node node) {
		this.next = node;
	}
	public Node removeNext() {
		this.next = this.next.next;
		return this.next;
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node("2");
		Node node3 = new Node(args);
		node1.addNext(node2);
		node2.addNext(node3);
		node3.addNext(node1);
		
		Node temp = node1;
		Node nodeArray[] = new Node[10];
		boolean hasCircle = false;
		int count = 0;
		while (!(temp.next == null)) {
			nodeArray[count] = temp;
			for (int i = 0; i < count+1; i++) {
				if (temp.next == nodeArray[i]) {
					hasCircle = true;
					System.out.println("有环");
					return;
				}
			}
			count++;
			temp = temp.next;
		}
		System.out.println("无环");
		
//		System.out.println(node1);
//		System.out.println(node2);
//		System.out.println(node3);
//		System.out.println(node1.next);
//		System.out.println(node2.next);
//		System.out.println(node3.next);
	}
}
