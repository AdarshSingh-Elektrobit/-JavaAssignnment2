import java.util.ArrayList;
import java.util.Scanner;

public class Qn2 {

    //Write a Java program to find the index of an array element.
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

        System.out.println("Enter the element to be searched: ");
        int x= Integer.parseInt(sc.next());
        System.out.println("The index of "+x+" is "+arrayList.indexOf(x));
    }

}
