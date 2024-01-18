package UsingLinkedList;

public class Stack {
	Node top;
	void push(int ele) {
		Node n=new Node();
		n.info=ele;
		n.next=null;
		
		n.next=top;
		top=n;
	}
	int pop() {
		int ele=0;
		if(top==null) {
			System.out.println("UnderFlow.");
		}
		else {
			Node temp=top;
			top=top.next;
			ele=temp.info;
			temp.next=null;
			temp=null;
		}
		return ele;
	}
	int peak() {
		if(top==null) {
			return -1;
		}
		return top.info;
	}
	void display() {
		System.out.println("The stack is:");
		System.out.println("Top= "+top);
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.info+"  "+temp.next);
			temp=temp.next;
		}
	}
}
