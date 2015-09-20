package CodingHomework1;

public class test_2_3 {
	public static void main(String[] str){
		//2.3
				
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
				solution_2_3.DeleteMiddeleNode(node2);
				
				System.out.println("test link is 2 2 3 4 5, delete the node 3");
				System.out.println("result of 2.3");
				
				while(head != null) {
					System.out.print(head.data+" ");
					head = head.next;
				}
		
	}

}
