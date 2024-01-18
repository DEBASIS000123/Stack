package UsingArray;

public class Stack {
	int a[];
	int top;
	int size;
	void create(int size) {
		this.size=size;
		top=-1;
		a=new int[size];
	}
	void push(int n) throws Exception {
		if(top==size-1) {
			throw new Exception("Arraylist is full.");
		}
		top++;
		a[top]=n;
	}
	void pop() throws Exception{
		if(top==-1) {
			throw new Exception("Arraylist is Empty.");
		}
		//int res=a[top];
		top--;
	}
	int peak() throws Exception{
		if(top==-1) {
			throw new Exception("Arraylist is Empty.");
		}
		return a[top];
	}
	boolean isEmpty() {
		return top==-1;
	}
}
