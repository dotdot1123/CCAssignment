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

follow up question analysis:
Because we only have 10 MB memory, so 
10 MB memory = 10 * 10^6 * 8 bits = 80 million bits

Solution: For all possible 16-bit prefixes, there are 2^16 number of integers = 65536, we need 2^16 * 4 * 8 = 2 million bits.
We need build 65536 buckets. For each bucket, we need 4 bytes holding all possibilities because the worst case is all the 4 
billion integers belong to the same bucket.
The procedures are below:
Step 1: Build the counter of each bucket through the first pass through the file.
Step 2: Scan the buckets, find the first one who has less than 65536 hit.
Step 3: Build new buckets whose high 16-bit prefixes are we found in step2
through second pass of the file
Step 4: Scan the buckets built in step3, find the first bucket which doesnt
have a hit.
