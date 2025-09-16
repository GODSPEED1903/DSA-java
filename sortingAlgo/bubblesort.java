import java.util.*;


public class bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int arr[], int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}