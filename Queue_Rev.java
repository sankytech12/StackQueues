package Stacks_Queue;



public class Queue_Rev {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue qt=new DynamicQueue();
		qt.Enqueue(10);
		qt.Enqueue(20);
		qt.Enqueue(30);
		qt.Enqueue(40);
		qt.Enqueue(50);
		qt.Enqueue(60);
		qt.Enqueue(70);
		qt.Display();
		System.out.println("*********************************");
		Reverse(qt);
		qt.Display();
		
	}

	private static void Reverse(DynamicQueue qt) throws Exception {
		// TODO Auto-generated method stub
		if(qt.isEmpty()) {
			return;
		}
		int x=qt.Dequeue();
		Reverse(qt);
		qt.Enqueue(x);
	}

}
