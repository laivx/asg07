package oop.asg07;

public class MyList implements Item{
	private Node start;
	private Node end;
	private int leng;
	
	public MyList(){
		this.start = null;
		this.end = null;
		this.leng = 0;
	}
	public int length(){
		return leng;
	}
	
	public MyList clone(){
		MyList copy = new MyList();
		Node cur = start;
		while(cur!=null){
			copy.append(cur.data);
			cur=cur.next;
		}
		return copy;
	}
	
	public void append(Item data){
		Node tmp = new Node(data);
		if(start==null) {
			start = end = tmp;
			leng++;
		}
		else{
			end.next=tmp;
			end=tmp;
			leng++;
		}
	}
	
	public void appendList(MyList a){
		Node cur = a.clone().start;
		while(cur!=null){
			this.append(cur.data);
			cur=cur.next;
		}
	}
	
	public boolean equals(Item item){
		if(item instanceof NumeralItem || item instanceof StringItem) return false;
		MyList a = (MyList)item;
		if(length()!=a.length()) return false;
		else{
			Node check1 = start;
			Node check2 = a.start;
			while(check1!=null){
				if(!(check1.data.equals(check2.data))) return false;
				check1=check1.next;
				check2=check2.next;
			}
			return true;
		}
		
	}
	
	public Item find(Item item){
		Node cur=start;
		while(cur!=null){
			if(cur.data.equals(item)) return cur.data;
			cur=cur.next;
		}
		return null;
	}
	
	public Item getItem(int index){
		Node cur = start;
		for(int i=1; i<=index; i++){
			if(i==index) return cur.data;
			cur=cur.next;
		}
		return null;
	}
	
	public void invert(){
		MyList copy = this.clone();
		start = end = null;
		for(int i=copy.leng; i>=1; i--){
			this.append(copy.getItem(i));
		}
	}
	
	public String toString(){
		String result = "(" ;
		Node cur = start;
		while(cur!=null){
			if(cur.next == null)result = result + cur.data;
			else result = result + cur.data + ", " ;
			cur=cur.next;
		}
		result = result+ ")" ;
		return result;
	}
	
}
