package oop.asg07;

public class StringItem implements Item {
	public String value;
	
	public StringItem(String value){
		this.value = value;
	}
	public StringItem clone(){
		return new StringItem(value);
	}
	
	public boolean equals(Item item){
		if(!(item instanceof StringItem)) return false;
		return value.compareTo(((StringItem)item).value) == 0;
	}
	
	public String toString(){
		return value;
	}
}
