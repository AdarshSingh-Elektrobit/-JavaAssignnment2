import java.util.ArrayList;
import java.util.Scanner;

public class Qn1 {
    //Write a Java program to sum the values of an array and the average value of array elements.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

//    System.out.println("Enter size of array: ");
//    int x= Integer.parseInt(sc.next());
        int temp = 0;
        int sum=0;

        while (temp != -1)
        {
            System.out.println("Enter element\nEnter -1 to exit.");
            temp = Integer.parseInt(sc.next());
            sum+=temp;
            arrayList.add(temp);
        }
//
//    for (int i:arrayList)
//        System.out.println(i);
        sum++;
//        System.out.println(sum);
//    temp = Integer.parseInt(sc.next());
        System.out.println(sum);
        int n = arrayList.size()-1;
        System.out.println( sum/n  );


    }
}
