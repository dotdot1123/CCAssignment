package CodingHomework1;

public class test_2_1 {
	public static void main(String[] str){
		
		//2.1
				System.out.println("result of 2.1");
				LinkedListNode head = new LinkedListNode(2);
				LinkedListNode node1 = new LinkedListNode(2);
				LinkedListNode node2 = new LinkedListNode(3);
				LinkedListNode node3 = new LinkedListNode(4);
				LinkedListNode node4 = new LinkedListNode(5);
				head.next = node1;	
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				LinkedListNode newHead =  solution_2_1.deleteDups(head);
				LinkedListNode curr = newHead;
				while(curr != null) {
					System.out.print(curr.data+" ");
					curr = curr.next;
				}
	}

}
