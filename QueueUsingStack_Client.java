package Stacks_Queue;

public class QueueUsingStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingStackP qt=new QueueUsingStackP();
		qt.Enqueue(10);
		qt.Enqueue(20);
		qt.Enqueue(30);
		qt.Enqueue(40);
		qt.Enqueue(50);
		qt.Display();
		qt.Dequeue();
		qt.Display();
		System.out.println(qt.getFront());
	}

}
