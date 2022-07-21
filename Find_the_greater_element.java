package Stacks_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Find_the_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		FGE(arr);
	}

	private static void FGE(int[] arr) {
		// TODO Auto-generated method stub
		int []ge=new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.empty() &&arr[i]>arr[st.peek()]) {
				int ii=st.pop();
				ge[ii]=arr[i];
			}
			st.push(i);
		}
		while(!st.empty()) {
			for (int i = 0; i < arr.length; i++) {
				while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
					int ii=st.pop();
					ge[ii]=arr[i];
				}
			}
			ge[st.pop()]=-1;
			
		}
		for (int i = 0; i < ge.length; i++) {
			System.out.print(ge[i]+" ");
		}
	}

}
