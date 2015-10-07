package ch6;

import java.util.ArrayList;

public class solution10 {
	int findPoisonedBottle(ArrayList<Bottle> bottles, ArrayList<TestStrip> strips){
		runTests(bottles, strips);
		ArrayList<Integer> positive = getPositiveOnDay(strips,7);
		return setBits(positive);
	}
	
	void runTests(ArrayList<Bottle> bottles, ArrayList<TestStrip> strips){  // add bottle contents to test strips.
		for(Bottle bottle:bottles){
			int id = bottle.getId();
			int bitIndex = 0;
			while(id > 0){
				if((id & 1) == 1){
					strips.get(bitIndex).addDropOnDay(0, bottle);
				}
				bitIndex++;
				id >>= 1;
			}
		}
	}
	
	ArrayList<Integer> getPositiveOnDay(ArrayList<TestStrip>testStrips, int day){ // get test strips that are positive on a particular day
		ArrayList<Integer> positive = new ArrayList<Integer>();
		for(TestStrip testStrip : testStrips){
			int id = testStrip.getId();
			if(testStrip.isPositiveOnDay(day)){
				positive.add(id);
			}
		}
		return positive;
	}
	
	int setBits(ArrayList<Integer> positive){  // create number by setting bits with indices specified in positive
		int id = 0;
		for(Integer bitIndex : positive){
			id |= 1 << bitIndex;
		}
		return id;
	}

}
