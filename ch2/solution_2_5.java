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


