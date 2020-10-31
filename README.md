package algorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class k_th_smallest_largest {
    public static int kth_largest(int[]arr,int k){
        PriorityQueue<Integer>minHeap=new PriorityQueue<Integer>();
        for (int i:arr){
            minHeap.add(i);
            if(minHeap.size()>k)
                minHeap.remove();
        }
        return minHeap.remove();
    }
    public static int kth_smallest(int[]arr,int k){
        PriorityQueue<Integer>maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i:arr){
            maxHeap.add(i);
            if(maxHeap.size()>k)
                maxHeap.remove();
        }
        return maxHeap.remove();
    }
    public static void main(String[] args) {
        int[]arr={3,2,1,5,6,4};
        int k=2;
        System.out.print("kth largest element : "+kth_largest(arr,k));
        System.out.println();
        System.out.print("kth smallest element : "+kth_smallest(arr,k));
    }
}
