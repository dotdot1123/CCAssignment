package CodingHomework1;

public class solution_1_4 {
	public static boolean PermutationOfPalindrome(String str){
		// assume the string ignore the space just care about the characters,ignore the upper or lower case of characters
		//only input letters and space,no other character
		// solution idea:
		// 1.ignore upper case letter and space
		// 2.record each character's appearance times into an array
		// 3.judge how many odd numbers in the array, when odd number more than 1,it is false,otherwise it is true
		
		String str1 =  str.toLowerCase();   //ignore upper case
		str1 = str1.replace(" ", "");       // remove space
		
		// 2.count each letter appearance time into an array 
		int[] a = new int[26];
		for(int i=0;i<=str1.length()-1;i++){
			char c = str1.charAt(i);  //pick value of position i 
			int index = c - 'a';   //get the index of each letter
			a[index] = a[index] +1;
		}
		
		//3. judge each value in a[26]
		int count = 0;
		
		for(int j=0;j<=a.length-1;j++){
			
			if( a[j] % 2 == 1){
				count=count+1;	
			}
				
		}
		if(count>1){
			
			return false;
		}
			return true;
	}
}
