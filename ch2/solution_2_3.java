package CodingHomework1;

public class solution_2_3 {
	// assume the length of input link is odd,node is the middle one
	
	public static void DeleteMiddeleNode(LinkedListNode node){
		LinkedListNode current = node;
		
		if(current == null || current.next == null){
			System.out.println("No middle element,error");
			}
		else{
			LinkedListNode next = node.next;
			node.data = next.data;
			node.next = next.next;
		}
		
	}
}
