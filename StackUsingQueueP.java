package Stacks_Queue;

public class StackUsingQueueP {
private DynamicQueue data;
	
	public StackUsingQueueP() {
		this.data=new DynamicQueue();
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}
	public void push(int item) throws Exception {
		this.data.Enqueue(item);
	}
	public int pop() throws Exception {
		DynamicQueue temp=new DynamicQueue();
		while(this.data.size()>1) {
			temp.Enqueue(this.data.Dequeue());
		}
		int x=this.data.Dequeue();
		while(!temp.isEmpty()) {
			this.data.Enqueue(temp.Dequeue());
		}
		return x;
	}
	public int peek() throws Exception{
		DynamicQueue temp=new DynamicQueue();
		while(this.data.size()>1) {
			temp.Enqueue(this.data.Dequeue());
		}
		int x=this.data.Dequeue();
		while(!temp.isEmpty()) {
			this.data.Enqueue(temp.Dequeue());
		}
		this.data.Enqueue(x);
		return x;		
	}
	public void Display() {
		this.data.Display();
	}
}
