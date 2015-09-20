package CodingHomework1;

import java.util.*;

public class solution_1_2 {
	public static String order(String s){
		char[] ArrayString = s.toCharArray();
	    Arrays.sort(ArrayString);  //sort and save chars into ArrayString
	    return new String(ArrayString);
		
	}
	
	
	public static boolean IsPermutation(String str1, String str2){
		// consider space and small and big characters
		if(str1.length()!=str2.length()){
			return false;
		}else{
			if(order(str1).equals(order(str2)) ){
				return true;
			}
			return false;
		}
	}
}
