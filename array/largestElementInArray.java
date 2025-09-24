import java.util.*;

public class largestElementInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = largestElementInArray(arr,n);
        System.out.println("the largest element in the array is: "+largest);
    }
    public static int largestElementInArray(int arr[], int n){
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    
}