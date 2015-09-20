package CodingHomework1;

public class test_2_7 {
	public static void main(String[] str){
		//2.7

				System.out.println("result of 2.7");
				LinkedListNode head = new LinkedListNode(3);
				LinkedListNode node1 = new LinkedListNode(1);
				LinkedListNode node2 = new LinkedListNode(5);
				LinkedListNode node3 = new LinkedListNode(9);
				LinkedListNode node4 = new LinkedListNode(7);
				LinkedListNode node5 = new LinkedListNode(2);
				LinkedListNode node6 = new LinkedListNode(1);

				head.next = node1;	
				node1.next = node2;
				node2.next = node3;	
				node3.next = node4;
				node4.next = node5;	
				node5.next = node6;
				node6.next = null;
				
				LinkedListNode cur1 = head;
				while(head != null) {
					System.out.print(head.data+" ");
					head = head.next;
				}
				
				System.out.println();
				System.out.println("list2 is blow");
				
				LinkedListNode head1 = new LinkedListNode(4);
				LinkedListNode node1_1 = new LinkedListNode(6);
				LinkedListNode node1_2 = new LinkedListNode(5);
				head1.next = node1_1;	
				node1_1.next = node1_2;
				node1_2.next = node5;
				
				LinkedListNode cur2 = head1;
				while(head1 != null) {
					System.out.print(head1.data+" ");
					head1 = head1.next;
				}
				System.out.println();
				
				LinkedListNode result = solution_2_7.findIntersection(cur1,cur2);
				
				
				System.out.println("the intersection node is");
				System.out.print(result.data+" ");
		
	}

}
