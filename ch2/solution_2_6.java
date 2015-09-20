package CodingHomework1;

import java.util.Stack;

public class solution_2_6 {
	
	// input odd values
	
	public static boolean isPalindrome(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null){     // skip the middle one
			slow = slow.next;
		}
		
		while(slow != null){
			int top = stack.pop().intValue();
			
			if(top != slow.data){
				return false;
			}
			else
				slow = slow.next;
		}
		return true;
		
	}

	
}
