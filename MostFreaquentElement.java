import java.util.*;

public class Source {

 public static int mostFrequentElement(int[] arr) {

   // Write code here
   int n=arr.length;
    int maxcount = 0;
    int element_max_freq = 0;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
 
      if (count > maxcount) {
        maxcount = count;
        element_max_freq = arr[i];
      }
    }
 
    return element_max_freq;
  }

 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
 }
}
    

