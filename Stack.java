package Stacks_Queue;

public class Stack {
	protected int []data;
	protected int top;
	
	public Stack(){
		this.data=new int[5];
	}
	public Stack(int n){
		this.data=new int[n];
	}
	public boolean isFull() {
		return this.top==this.data.length;
	}
	public boolean isEmpty() {
		return this.top==0;
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("The Stack is full no element can be added anymore");
		}
		this.data[this.top]=item;
		this.top++;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("The stack is empty");
		}
		this.top--;
		return this.data[top];
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return this.data[this.top-1];
	}
	public int size() {
		return this.top;
	}
	public void Display() {
		for (int i = 0; i < this.top; i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
		java.util.Stack<E>
	}
}
