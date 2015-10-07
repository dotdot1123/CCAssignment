package ch6;

public class Bottle {
	private boolean poisoned = false;
	private int id;
	
	public Bottle(int id) {this.id = id;}
	public int getId() {return id;}
	public void setAsPoison() {poisoned = true;}
	public boolean isPoisoned() {return poisoned;}

}
