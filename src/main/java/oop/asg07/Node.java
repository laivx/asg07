package oop.asg07;

class Node { 
	  Item data; 
	  Node next; //refers to the next item in the list
	  Node (Item data) {  
	      this.data = data.clone();  // deep copy  
	  } 
}
