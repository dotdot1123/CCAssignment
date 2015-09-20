package CodingHomework1;

public class solution_1_3 {
	public static String ReplaceSpace(String str,int length){
		String strTrue = str.trim();
		if(length == strTrue.length()){
			String str2 = strTrue.replace(" ", "%20");
			return str2;	
		}
		return "error";
	}


}
