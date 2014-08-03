package oop.asg07;

public class Test {
	public static void main(String args[]){
		MyList a = new MyList();
		a.append(new NumeralItem(1));
		a.append(new NumeralItem(2));
		System.out.print(a);
		System.out.println(" length = " + a.length());
		
		
		MyList b =new MyList();
		b.append(new StringItem("a"));
		b.append(new StringItem("b"));
		System.out.print(b);
		System.out.println(" length = " + b.length());
		
		a.append(b);
		System.out.print(a);
		System.out.println(" length = " + a.length());
		
		a.appendList(b);
		System.out.print(a);
		System.out.println(" length = " + a.length());
		
		b.append(new NumeralItem(3));
		System.out.print(b);
		System.out.println(" length = " + b.length());
		System.out.print(a);
		System.out.println(" length = " + a.length());
		
		if(a.equals(b)) System.out.println("a equal b");
		else System.out.println("a not equal b");
		
		System.out.println(a.find(new StringItem("b")));
		System.out.println(b.find(new NumeralItem(3)));
		
		a.invert();
		System.out.println(a);
	}
}
