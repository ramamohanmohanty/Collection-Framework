import java.util.*;
public class Demo2 {
    public static void main(String args[]){
        int arr1[] = {45,78,12,99,55,22};
        System.out.println("\nSee the daatof original array.\n");
        for(int x : arr1){
            System.out.println(x+"\t");
        }
        int arr2[] = Arrays.copyOf(arr1, 10);
        for(int y : arr2) {
            System.out.println(arr2+"\t");
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(Arrays.copyOf(arr1,0)));
    }
}