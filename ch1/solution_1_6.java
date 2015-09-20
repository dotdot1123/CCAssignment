package CodingHomework1;

public class solution_1_6 {


	public static String StringCompression(String str) {
		
		// suppose only lower case letters
		int[] a = new int[26];
		for(int i=0;i<str.length()-1;i++){
			char c = str.charAt(i);  //pick value of position i 
			int index = c - 'a';   //get the index of each letter
			a[index] = a[index] +1;
		}
		/*
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		*/
		
		char[] b = new char[52];
		int j = 0;
		int m = 0;
		StringBuffer buf = new StringBuffer() ;
		while(j<a.length-1)
		{
			if(a[j] != 0){
				b[m] = (char) ('a'+j);
				
				buf.append(b[m]);
				buf.append(a[j]);
				
				m=m+1;
			}
			j++;
		}		
		
		String b1 = new String(buf);
		
		
		if(b1.length()<str.length())
			
	    	return b1;
		else
			return str;
	}

}
