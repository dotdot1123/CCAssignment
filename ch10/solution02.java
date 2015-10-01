package CC_ch10;

import java.util.Arrays;
import java.util.Comparator;

public class solution02 {
	// write a method to sort an array of strings so that all the anagrams are next to each other

	static class AnagramComparator implements Comparator<String>{
		
		public static String sortChars(String s){  // sort each String 
			char[] content = s.toCharArray();
			Arrays.sort(content);
			return new String(content);
		}
		
		public int compare(String s1, String s2){
			return sortChars(s1).compareTo(sortChars(s2));
		}
	}
	
	
	
	public static void main(String[] arg){
		String a[] = {"god","bag","dog","gba","cab","man"};
		
		/* for(int i=0; i <= a.length-1; i++){        // sort each string in the array
			 a[i] = AnagramComparator.sortChars(a[i]);
		 }
		 */
		 Arrays.sort(a, new AnagramComparator());    // sort array
		
		 for(int i=0;i<=a.length-1;i++){
			 System.out.println(a[i]);
		 }
		 
			
		}
		
		
		//nput {god, dog, abc, cab, man}
		//output {abc, cab, dog, god, man}
	}

