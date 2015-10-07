package ch6;

import java.util.Random;

public class solution07 {
	public int[] genderOfOneFamily(){
		Random random = new Random();
		int B = 0;
		int G = 0;
		while(G == 0) // until get the first gril
			if(random.nextBoolean()){  //girl
				G += 1;
			}else{
				B += 1;
			}
	int[] genders = {G, B};
	return genders;
	}
	
	public double genderOfNFamilies(int n){
		int B = 0;
		int G = 0;
		for(int i = 0; i< n; i++){
			int[] genders = genderOfOneFamily();
			G += genders[0];
			B += genders[1];
		}
		return G / (double)(G + B);
	}
	
	public static void main(String[] arg){
		int n = 1000;    // when n is bigger enough, the result value r is very close to 0.5
		solution07 a = new solution07();
		double r = a.genderOfNFamilies(n);
		System.out.println(r);
		
	}
	
}
