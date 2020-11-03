package algorithms;
import java.util.*;

public class zero_sum_subarray {
    public static boolean check(int[]arr){
        int sum=0;
        Set<Integer> s=new HashSet<Integer>();
        int n=arr.length;
        for (int x:arr) {
            s.add(sum);
            sum+=x;
            if (s.contains(sum)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,1,3,-4,-2};
        if (check(arr))
            System.out.println("True");
        else
            System.out.println("False");
    }
}


