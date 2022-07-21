package Stacks_Queue;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> s;
	private int min=0;
	public MinStack() {
		// TODO Auto-generated constructor stub
		this.s=new Stack<Integer>();
	}
	public boolean isEmpty() {
		return this.s.isEmpty();
	}
	public int size() {
		return this.s.size();
	}
	public void push(int item) {
		if(s.isEmpty()||item>this.min) {
			if(s.isEmpty()) {
				this.s.push(item);
				this.min=item;
			}
			else {
				this.s.push(item);
			}
		}
		else {
			int val=2*item-this.min;
			this.s.push(val);
			this.min=item;
		}
	}
	public int pop() throws Exception {
		if(this.s.isEmpty()) {
			throw new Exception("Stack is EMPTY");
		}
		if(this.s.peek()<this.min) {
			int rv=this.s.pop();
			int rd=this.min;
			this.min=2*this.min-rv;
			return rd;
		}
		else {
			return this.s.pop();
		}
	}
	public int peek() throws Exception {
		if(this.s.isEmpty()) {
			throw new Exception("Stack is EMPTY");
		}
		if(this.s.peek()<this.min) {
			return this.min;
		}
		else {
			return this.s.peek();
		}
	}
	public void Display() {
		System.out.print(this.s+" ");
		System.out.println();
	}
	public int min() {
		return this.min;
	}
}
