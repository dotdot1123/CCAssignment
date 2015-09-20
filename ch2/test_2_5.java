package CodingHomework1;

public class test_2_5 {
	public static void main(String[] str){
		// 2.5
		
				System.out.println("result of 2.5");
				LinkedListNode head = new LinkedListNode(7);
				LinkedListNode node1 = new LinkedListNode(1);
				LinkedListNode node2 = new LinkedListNode(6);
				head.next = node1;	
				node1.next = node2;
				node2.next = null;
				
				
				LinkedListNode head1 = new LinkedListNode(5);
				LinkedListNode node1_1 = new LinkedListNode(9);
				LinkedListNode node1_2 = new LinkedListNode(2);
				head1.next = node1_1;	
				node1_1.next = node1_2;
				node1_2.next = null;
				
				LinkedListNode newHead = solution_2_5.addLists(head, head1, 0);
				
				//System.out.println("test link is 2 2 3 4 5, delete the node 3");
				
				while(newHead != null) {
					System.out.print(newHead.data+" ");
					newHead = newHead.next;
				}
		
	}

}
