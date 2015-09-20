package CodingHomework1;

public class test_2_8 {
	public static void main(String[] str){
		// 2.8
		
				System.out.println("result of 2.8");
				LinkedListNode head = new LinkedListNode(1);
				LinkedListNode node1 = new LinkedListNode(2);
				LinkedListNode node2 = new LinkedListNode(3);
				LinkedListNode node3 = new LinkedListNode(4);
				LinkedListNode node4 = new LinkedListNode(5);
				
				head.next = node1;	
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				node4.next = node2;
			
				
				LinkedListNode result2_8 = solution_2_8.FindBenning(head);
				System.out.println(result2_8.data);
		
	}

}
