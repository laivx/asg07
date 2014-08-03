package oop.asg07;

public class NumeralItem implements Item{
	public int value;
	
	public NumeralItem(int value){
		this.value = value;
	}
	
	public NumeralItem clone(){
		return new NumeralItem(value);
	}
	
	public boolean equals(Item item){
		if(!(item instanceof NumeralItem)) return false;
		return value == ((NumeralItem)item).value;
	}
	
	public String toString(){
		return String.format("%d",value);
	}
}
