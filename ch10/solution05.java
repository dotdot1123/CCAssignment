package CC_ch10;

public class solution05 {
	// given a sorted array of strings that is interspersed with empty strings, 
	// write a method  to fine the location of a given string.
	
	static int search(String[] strings, String str, int first, int last){
		if(first > last) return -1;
		
		int mid = (last + first)/2;
		
		if(strings[mid].isEmpty()){ // is empty to find string
			int left = mid - 1;
			int right = mid + 1;
			
			while(true){
				if(left < first && right >last){
					return -1;
				}
				else if(right <= last && !strings[right].isEmpty()){
					mid = right;
					break;
				}else if(left >= first && !strings[first].isEmpty()){
					mid = left;
					break;
				}
				right++;
				left--;
			}	
		} 
		
		if(str.equals(strings[mid])){   // not empty, compare with the given string
			return mid;   // return the given string position
		}else if(strings[mid].compareTo(str) < 0 ){
			return search(strings, str, mid + 1, last);  //recursive the right side
		}else{
			return search(strings, str, first, mid - 1);  // recursive the left side
		}
	}
		
		static int search(String[] strings, String str){
			if(strings == null || str == null || str == ""){
			return -1;
		}
		return search(strings, str, 0, strings.length - 1);		
	}
		
		public static void main(String[] arg){
			String[] str = {"at", "", "", "", "ball", "", "", "cat", "", "", "dad", "", ""};
			int pos = search(str, "ball");
			System.out.print(pos);
		}
	
}
	


