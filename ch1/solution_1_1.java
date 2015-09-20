package CodingHomework1;

//import java.util.*;

public class solution_1_1 {
	
	public static boolean DetermineUnique(String str){
		
		// assume the string has 128 characters
		
		if(str.length() > 128){
			return false;
		}
		
		else{
			boolean[] tamp = new boolean[128];   //record each character's boolean
			for(int i=0;i<str.length();i++){
				int val = str.charAt(i);    // return value of position i;
				if(tamp[val]){
					return false;
				}
				tamp[val] = true;
			}
			return true;	
		}	
		
	}
	
}
