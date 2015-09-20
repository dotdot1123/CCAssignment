package CodingHomework1;

public class solution_1_5 {
	public static boolean IsEdit(String str1,String str2){
		
		//is equal? insert a character? remove a character? replace a character?
		
		//solution idea
		//1. two string equals return true
		//2. do not the same, length>2 return false, otherwise exchange these two strings, let str1 represent short one and str2 represent long one
		//3. if only one different character,return true,otherwise false

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		int count =0;

		
		if(str1.equals(str2))
			return true;
		
		else{
		
			if(str1.length() == str2.length()){
				
				for(int k=0;k<str1.length()-1;k++){
					if(a[k]!=b[k]){
						count+=1;
					}
				}
				
					if(count > 1)
						return false;
					else
						return true;
				
			}
			else 
				if(str1.length()-str2.length()>1 || str1.length()-str2.length()<-1)
					return false;
				else
			{
				char[] temp=a;
				a = b;
				b = temp;
			
			
					int i=0;
					int j=0;
					

					while(i<a.length-1 && j< b.length-1){
						if(a[i]!=b[j])
							return false;
						else{
							i++;
							j++;
							}
						}
					return true;
				
						
				}
			
			
		}
		
	} 

}
