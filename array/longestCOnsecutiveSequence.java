import java.util.*;

public class longestCOnsecutiveSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   
        int longestConsecutiveSequence = longestConsecutiveSequence(arr,n);
        System.out.println("the longest consecutive sequence is: "+longestConsecutiveSequence);
    }
    public static int longestConsecutiveSequence(int arr[], int n){
        if(n==0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        for(int it: set){
            //if it is starting number of the sequence
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}