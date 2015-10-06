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

follow up problem:

If we cannot use additional data structures, we can reduce the space by a factor of eight by using a bit vertor. The code is below:
 boolean DetermineUnique1(String str){
 	int a = 0;     // a is a checker 
 	for(int i = 0; i < str.length(); i++){
 		int val = str.charAt(i) - 'a';
 		if((a & (1 << val)) > 0){
 			return false;
 		}
 		a |= (1 << val);
 	}
 	return true;
 }
