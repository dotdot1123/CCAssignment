package CodingHomework1;

public class test_2_2 {
	public static void main(String[] str){
		//2.2
				System.out.println("result of 2.2");
				LinkedListNode head = new LinkedListNode(2);
				LinkedListNode node1 = new LinkedListNode(2);
				LinkedListNode node2 = new LinkedListNode(3);
				LinkedListNode node3 = new LinkedListNode(4);
				LinkedListNode node4 = new LinkedListNode(5);
				head.next = node1;	
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				node4.next = null;
				LinkedListNode current = head;
				int length = 0;
				while(current != null)
				{
					length++;
					current  = current.next;
				}
				System.out.println("Linked list length is "+length);
				solution_2_2.ReturnKthtoLast(head, 2);
		
	}

}
