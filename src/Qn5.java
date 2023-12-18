import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Qn5 {
    //Write a Java program to find the maximum and minimum value of an array.

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int sum=0;

        while (temp != -1)
        {
            System.out.println("Enter element.Enter -1 to exit.");
            temp = Integer.parseInt(sc.next());
            sum+=temp;
            arrayList.add(temp);
        }
        arrayList.remove(arrayList.size()-1);

        System.out.println("The max element in the array is:"+ Collections.min(arrayList));
        System.out.println("The max element in the array is:"+ Collections.max(arrayList));

    }

}

