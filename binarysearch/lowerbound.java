import java.util.*;

public class lowerbound{

    public static int lowerbound(int arr[], int x, int n){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   
        int x = sc.nextInt();
        int lowerbound = lowerbound(arr,x,n);
        System.out.println("the lowerbound of the array is: "+lowerbound);
    }
}