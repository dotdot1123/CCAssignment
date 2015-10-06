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

Original question analysis:

If there is no limit of buffer, so we can simply iterate throug the linked list,and use the HashSet to mark determine and remove the 
duplicate elements.


