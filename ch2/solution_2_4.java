package CodingHomework1;

public class solution_2_4 {
	public static LinkedListNode partition(LinkedListNode node, int x){
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while(node != null){
			LinkedListNode next = node.next;   //save node.next value
			if(node.data < x){
				node.next = head;
				head = node;
			}else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next =null;
		return head;
		
	}

}
