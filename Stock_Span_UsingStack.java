package Stacks_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span_UsingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int []ng=PrintSpan(arr);
		for (int i = 0; i < ng.length; i++) {
			System.out.print(ng[i]+" ");
		}
	}

	public static int[] PrintSpan(int[] arr) {
		// TODO Auto-generated method stub
		int []ans=new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.empty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
//		for (int i = 0; i < ans.length; i++) {
//			System.out.print(ans[i]+" ");
//		}
//		System.out.print("END");
//	}
		return ans;

}
}