package algorithms;

import java.util.Scanner;
import java.util.*;

public class subarray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,9,8,4,5,2,3,7,5};
        int n=arr.length;
        int s=26;
        int sum=0;
        int i=0;
        int j=0;
        int st=-1,en=-1;
        while(j<n&&sum+arr[j]<=s){
            sum+=arr[j];
            j++;
        }
        if (sum==s)
            System.out.println(i+1+" "+j);
        else {
            while (j<n){
                sum+=arr[j];
                while (sum>s){
                    sum-=arr[i];
                    i++;
                }
                if (sum==s){
                    st=i+1;
                    en=j+1;
                    break;
                }
                j++;
            }
            System.out.println(st+" "+en);
        }

    }
}