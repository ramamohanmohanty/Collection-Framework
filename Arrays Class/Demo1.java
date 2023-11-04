import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        int arr[] = {33,76,12,99,86,69,45};
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("\nAfter sort  array elements are : \n");
        Arrays.sort(arr);
        for( int x : arr) {
            System.out.println(x+"\t");
        }
        System.out.println("\nEnter the elements whom u search.");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("Position of element is : "+(Arrays.binarySearch(arr,data)+1));
    }
}