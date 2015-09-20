package CodingHomework1;

public class solution_2_8 {
	public static LinkedListNode FindBenning(LinkedListNode head){
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		while(fast != null && fast != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
		
	}

}
