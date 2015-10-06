package CodingHomework1;

public class solution_2_5 {
	public static LinkedListNode addLists(LinkedListNode list1,LinkedListNode list2, int carry){
		if(list1 == null && list2 == null && carry ==0){
			return null;
		}
		
		LinkedListNode sum = new LinkedListNode();
		
		/*
		
		int carry = 0;
		while(list1 != null && list2 != null){
			sum.data = carry + (list1.data + list2.data) % 10;
			System.out.println(sum);
			carry = (list1.data + list2.data) / 10;
			list1 = list1.next;
			list2 = list2.next;
			sum   = sum.next;
		}
		System.out.println(sum);
		*/
		
		int val = carry;
		
		if(list1 != null) {
			val += list1.data;
		}
		if(list2 != null){
			val += list2.data;
		}
		
		sum.data = val % 10;
		
		if(list1 !=null || list2 != null){
			LinkedListNode more = addLists(list1 == null ? null : list1.next, list2 == null ? null : list2.next, val >= 10 ? 1 : 0);
			 sum.next = more;
		}
		return sum;
			 
			 
			 
		}
		
	}
	

Follow up question analysis:

Suppose the digits  are sorted in forward order, then  we can do the same recurse as the original problem, but we should consider some additional complications:
(1) when the two list are not the same length,  we cannot add the element directly, we need to match each element with the same position. For example, when we add 6 ->1 -> 7 -> 8 and 2 ->9 ->5, we need to  match 2 with 1, not 6, so we should first compare the lengths of the lists in the beginning and add zeros in front of the shorter list.
(2) in the original problem, successive results were added to the tail, which meant that the recursive call would be passed the carry, and would return the result. In this problem, results are added to the head, the recursive call must return the result, as before, as well as the carry. This is not terribly challenging to implement, but it is more cumbersome, we can solve this problem by creating a wrapper class called Partial Sum.

