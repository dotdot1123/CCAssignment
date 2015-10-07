package ch5;

/**
 * @author- Rui
 * @time - 9:26:58 AM
 * @date - Oct 7, 2015
 * CCAssignments
 */
public class solution02 {
	public String binaryToString(double num){
		if(num <= 0 || num >= 1)   // num is between 0 and 1
			return "Error";
		
		StringBuilder binary = new StringBuilder();
		binary.append("0.");

		while(num > 0){
			if(binary.length() > 32){   // limit num as 32 bits as problem required
				return "Error";
			}
			
			double b = num * 2;  // judge every bit is zero or one
			if(b > 1){
				binary.append(1);  
				num = b - 1;
			}else{
				binary.append(0);
				num = b;
			}
		}
		return binary.toString();
	}
	
	public static void main(String[] arg){
		double num = 0.72;
		solution02 a = new solution02();
		String result = a.binaryToString(num);
		System.out.println(result);
	}

}
