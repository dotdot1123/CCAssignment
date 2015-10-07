package ch6;

import java.util.ArrayList;

public class TestStrip {
	public static int DAYS_FOR_RESULT = 7;
	private ArrayList<ArrayList<Bottle>> dropsByDay = new ArrayList<ArrayList<Bottle>>();
	private int id;
	
	public TestStrip(int id){this.id = id;}
	public int getId() {return id;}
	
	private void sizeDropsForDay(int day){    //resize list of days/drops to be large enough
		while(dropsByDay.size() <= day){
			dropsByDay.add(new ArrayList<Bottle>());
		}
	}
	
	public void addDropOnDay(int day, Bottle bottle){  // add drop from bottle on specific day
		sizeDropsForDay(day);
		ArrayList<Bottle> drops = dropsByDay.get(day);
		drops.add(bottle);
	}
	
	private boolean hasPoison(ArrayList<Bottle> bottles){ // checks if any of the bottles in the set are poisoned
		for(Bottle b : bottles){
			if(b.isPoisoned()){
				return true;
			}
		}
		return false;
	}
	
	public boolean isPositiveOnDay(int day){  //checks for poisoned bottles
		int testDay = day - DAYS_FOR_RESULT;
		if(testDay < 0 || testDay >= dropsByDay.size()){
			return false;
		}
		for(int d = 0; d <= testDay; d++){
			ArrayList<Bottle> bottles = dropsByDay.get(d);
			if(hasPoison(bottles)){
				return true;
			}
		}
		return false;
	}

}
