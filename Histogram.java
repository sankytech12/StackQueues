package Stacks_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long []arr=new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(AreaH(arr));
	}

	private static long AreaH(long[] arr) {
		// TODO Auto-generated method stub
		long ans=0;
		Stack<Integer> st=new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				long r=i;
				long h=(int) arr[st.pop()];
				if(st.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					long l=st.peek();
					ans=Math.max(ans, h*(r-l-1));
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			long h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				ans=Math.max(ans, h*(r-l-1));
			}
		}
		return ans;
	}

}
