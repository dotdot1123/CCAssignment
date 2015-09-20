package CodingHomework1;

public class test_2_6 {
	public static void main(String[] str){
		
		//2.6
				System.out.println("result of 2.6");
				LinkedListNode head = new LinkedListNode(1);
				LinkedListNode node1 = new LinkedListNode(2);
				LinkedListNode node2 = new LinkedListNode(3);
				LinkedListNode node3 = new LinkedListNode(4);
				LinkedListNode node4 = new LinkedListNode(3);
				LinkedListNode node5 = new LinkedListNode(2);
				LinkedListNode node6 = new LinkedListNode(1);
				head.next = node1;	
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				node4.next = node5;
				node5.next = node6;
				node6.next = null;
				boolean result2_6 =  solution_2_6.isPalindrome(head);
				System.out.println(result2_6);
		
	}

}
