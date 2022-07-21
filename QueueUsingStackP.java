package Stacks_Queue;

public class QueueUsingStackP {
	private DynamicStack data;
	public QueueUsingStackP() {
		// TODO Auto-generated constructor stub
		this.data=new DynamicStack();
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}
	public void Enqueue(int item) throws Exception {
		this.data.push(item);
	}
	public void Display() {
		this.data.Display();
	}
	public int Dequeue() throws Exception {
		DynamicStack temp=new DynamicStack();
		while(this.data.size()>1) {
			temp.push(this.data.pop());
		}
		int x=this.data.pop();
		while(!temp.isEmpty()) {
			this.data.push(temp.pop());
		}
		return x;
	}
	public int getFront() throws Exception {
		DynamicStack temp=new DynamicStack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x=this.data.peek();
		while(!temp.isEmpty()) {
			this.data.push(temp.pop());
		}
		return x;
	}
}
