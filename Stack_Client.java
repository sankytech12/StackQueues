package Stacks_Queue;
	import java.util.*;
public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.pop();
		st.Display();
		System.out.println("****************");
		Reverse(st);
		st.Display();
	}
	public static void Reverse(Stack st) throws Exception {
		if(st.isEmpty()) {
			return;
		}
		
		int x=st.pop();
		Reverse(st);
		Insert_down(st,x);
	}
	private static void Insert_down(Stack st,int x) throws Exception {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		
		int y=st.pop();
		Insert_down(st,x);
		st.push(y);
	}

}
