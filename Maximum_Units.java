package Stacks_Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Maximum_Units {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]boxes={{1,3},{2,2},{3,1}};
        int truckSize=4;
        System.out.println(maxUnit(boxes,truckSize));
	}

	private static int maxUnit(int[][] boxes, int truckSize) {
		// TODO Auto-generated method stub
		Arrays.sort(boxes,(a,b) -> -Integer.compare(a[1],b[1]));
		int units=0;
		for(int []box:boxes) {
			if(truckSize<box[0]) {
				return units+truckSize*box[1];
			}
		units+=box[0]*box[1];
		truckSize-=box[0];
		}
		return units;
	}

}
