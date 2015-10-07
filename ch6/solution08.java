package ch6;

public class solution08 {
	int breakingPoint = 5;
	int countDrops = 0;
	
	boolean drop(int floors){
		countDrops++;
		return floors >= breakingPoint;
	}
	int findBreakPoint(int floors){
		int interval = 14;     // calculate the value of floors.
		int previousFloor = 0;
		int egg1 = interval;
		while(!drop(egg1) && egg1 <= floors){  //drop egg1 at decreasing intervals
			interval -= 1;
			previousFloor = egg1;
			egg1 += interval;
		}
		int egg2 = previousFloor + 1;
		while(egg2 < egg1 && egg2 <= floors && !drop(egg2)){  // drop egg2 at 1 unit increments.
			egg2 += 1;
		}
		
		return egg2 > floors ? -1 : egg2;
	}

}
