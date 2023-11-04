import java.util.*;
import java.io.*;
class Student {
    int roll;
    String name;
    String address;
    @Override
    public String toString() {
        return "Roll Number : "+roll+"     Name : "+name+"    Address : "+address;
    }
}

class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2){
        return s1.roll - s2.roll;
    }
}

public class Demo3 {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int size = Integer.parseInt(br.readLine());
        Student ss[] = new Student[size];
        System.out.println("Initialize array elements.");
                for(int i = 0; i<size; i++){
                    ss[i] = new Student();
                    System.out.println("Enter the roll number");
                    ss[i].roll = Integer.parseInt(br.readLine());
                    System.out.println("Enter name");
                    ss[i].name = br.readLine();
                    System.out.println("Enter Address");
                    ss[i].address = br.readLine();
                }
        System.out.println("\nBefore sort array elements are.\n");
        for(int i = 0; i < size; i++ ){
            System.out.println(ss[i]);
        }
        System.out.println("\nSort the elements by comparing roll number.\n");
        Arrays.sort(ss,new SortByRoll());
        for(int i=0; i< size; i++){
            System.out.println(ss[i]);
        }
    }  
}
