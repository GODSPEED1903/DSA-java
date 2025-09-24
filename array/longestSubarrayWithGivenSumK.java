import java.util.*;

public class longestSubarrayWithGivenSumK{

    public static int longestSubarrayWithGivenSumK(int arr[], int k){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = i+1;
            }
            int rem = sum -k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }   
        return maxLen;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target sum");
        int k = sc.nextInt();
        int longestSubarray = longestSubarrayWithGivenSumK(arr,k);
        System.out.println("the longest subarray with the given sum is: "+longestSubarray);
    }
}