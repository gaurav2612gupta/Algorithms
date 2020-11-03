package algorithms;

import java.util.Scanner;

public class rod_cutting {
    public static int max_of(int [] arr,int n){
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int max_profit(int n,int [] arr){
        int [] ans=new int[n];
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            for (int i = 0; i < n; i++) {
                ans[i]=arr[i]+max_profit(n-i-1,arr);
            }
            return max_of(ans,n);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter price array : ");
        for (int i = 0; i <n; i++) {
            System.out.print(i+1+" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum profit is : "+max_profit(n,arr));
    }
}
