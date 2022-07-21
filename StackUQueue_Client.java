package Stacks_Queue;

public class StackUQueue_Client {
	public static void main(String[] args) throws Exception {
//		StackUsingQueue sq=new StackUsingQueue();
//		sq.push(10);
//		sq.push(20);
//		sq.push(30);
//		sq.push(40);
//		sq.push(50);
//		sq.push(60);
//		sq.Display();
//		System.out.println(sq.pop());
//		sq.Display();
//		sq.pop();
//		sq.Display();
//		sq.push(50);
		DynamicStack st=new DynamicStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.Display();
		st.pop();
		st.pop();
		st.Display();
		st.push(40);
		st.Display();
		System.out.println(st.peek());
		st.push(50);
		st.push(60);
		st.Display();
		st.pop();
		st.Display();
		
	}
	
}
