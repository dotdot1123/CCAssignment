package CodingHomework1;

public class test_2_4 {
	public static void main(String[] str){
		//2.4
		
				System.out.println("result of 2.4");
				LinkedListNode head = new LinkedListNode(3);
				LinkedListNode node1 = new LinkedListNode(5);
				LinkedListNode node2 = new LinkedListNode(8);
				LinkedListNode node3 = new LinkedListNode(5);
				LinkedListNode node4 = new LinkedListNode(10);
				LinkedListNode node5 = new LinkedListNode(2);
				LinkedListNode node6 = new LinkedListNode(1);
				head.next = node1;	
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				node4.next = node5;
				node5.next = node6;
				node6.next = null;
				LinkedListNode newHead = solution_2_4.partition(head, 5);
				
				
				while(newHead != null) {
					System.out.print(newHead.data+" ");
					newHead = newHead.next;
				}
		
	}

}
