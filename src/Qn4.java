import java.util.ArrayList;
import java.util.Scanner;

public class Qn4 {

    //Write a Java program to insert an element (specific position) into an array.
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

        System.out.println("Enter the element to be removed: ");
        int x= Integer.parseInt(sc.next());
        System.out.println("Enter the index to be removed: ");
        int y= Integer.parseInt(sc.next());
        arrayList.add(y,x);
        arrayList.remove(arrayList.size()-1);

        System.out.println(x+" has been added at index "+y+" The updated array is:\n ");
        for(int i:arrayList)
            System.out.println(i);
    }
}
