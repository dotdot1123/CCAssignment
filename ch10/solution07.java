package CC_ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class solution07 {
	
	long numberOfInts = ((long) Integer.MAX_VALUE) + 1;
	byte[] bitfield = new byte[(int)(numberOfInts) / 8];
	String filename;
	
	void findOpenNumber() throws FileNotFoundException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(new FileReader(filename));
		while(in.hasNext()){
			int n = in.nextInt();
			
			bitfield[n / 8] |= 1 << (n % 8);
		}
		
		for(int i = 0; i < bitfield.length; i++){
			for(int j = 0; j < 8; j++){
				if((bitfield[i] & (1 << j)) == 0){
					System.out.print(i * 8 + j);
					return;
				}
			}
		}
		
	}
		
}
