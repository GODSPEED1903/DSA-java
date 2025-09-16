import java.util.*;

public class quicksort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n-1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            // Recursively sort left and right parts
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // index of smaller element

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
