package CodingHomework1;

public class solution_2_2 {
	public static int ReturnKthtoLast(LinkedListNode head,int k){
		LinkedListNode current = head;
		if(current == null){
			return 0;
		}
		else{
			int index = ReturnKthtoLast(current.next,k)+1;
			if(index == k){
				System.out.println(k+"th to last node is " + head.data);
			}
			return index;
		}
	}
}
