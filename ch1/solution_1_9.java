package CodingHomework1;

public class solution_1_9 {
	
     // if s2(za) is a rotation of s1(az), then s2 will be a subString of zaza
	
	public static boolean IsRotation(String str1,String str2){
		
		if(str1.length() == str2.length() && str1.length()>0){
			String newStr1 = str1 +str1;
			return newStr1.contains(str2);  //according to the question, isSubstring exist in advance.
			
		}
		return false;
		
	}
	
}
