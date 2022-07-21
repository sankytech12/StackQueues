package Stacks_Queue;

public class StackUsingQueuePop {
	private DynamicQueue data;
	
	public StackUsingQueuePop() {
		this.data=new DynamicQueue();
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}
	public void push(int item) throws Exception {
		DynamicQueue temp=new DynamicQueue();
		while(!this.data.isEmpty()) {
			temp.Enqueue(this.data.Dequeue());
		}
		this.data.Enqueue(item);
		while(!temp.isEmpty()) {
			this.data.Enqueue(temp.Dequeue());
		}
	}
	public int pop() throws Exception {
		return this.data.Dequeue();
	}
	public int peek() throws Exception{
		return this.data.getFront();
	}
	public void Display() {
		this.data.Display();
	}
	
}
