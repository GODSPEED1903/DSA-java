import java.util.*;


public class selectionsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sixe of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}