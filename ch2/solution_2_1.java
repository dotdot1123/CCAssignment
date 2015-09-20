package CodingHomework1;

public class solution_2_1 {
	public static LinkedListNode deleteDups(LinkedListNode head){
		LinkedListNode current = head;
		
		while(current != null){			
			LinkedListNode temp = current;
			while(temp.next != null){
				if(temp.next.data == current.data){
					temp.next = temp.next.next;
				}
				else{
					temp = temp.next;
				}
			}
			current = current.next;
		}
		
		return head;
		
	}

}

