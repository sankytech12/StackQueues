package Stacks_Queue;

public class MinStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MinStack s=new MinStack();
		s.push(5);
		s.push(7);
		s.push(2);
		s.push(9);
		s.push(4);
		s.push(3);
		s.push(8);
		s.push(1);
		s.push(17);
		s.pop();
		s.Display();
		System.out.println(s.peek());
		System.out.println(s.min());
		s.pop();
		System.out.println(s.min());
	}

}
