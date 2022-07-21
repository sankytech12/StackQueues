package Stacks_Queue;

import java.util.*;
import java.util.Stack;

public class Next_Greater_Element_UsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int []arr=new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			NGE(arr);
		}
	}

	private static void NGE(int[] arr) {
		// TODO Auto-generated method stub
		int []nge=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty()&&arr[i]>arr[st.peek()]) {
				int ii=st.pop();
				nge[ii]=arr[i];
			}
			st.push(i);
		}
		while(!st.empty()) {
			int ii=st.pop();
			nge[ii]=-1;
		}
		for (int i = 0; i < nge.length; i++) {
			System.out.println(arr[i]+","+nge[i]);
		}
	}
	

}
