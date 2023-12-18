import java.util.ArrayList;
import java.util.Scanner;

public class Qn9 {
    // Write a Java program to find a missing number in an array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int temp = 0;
        int sum=0;

        while (temp != -1)
        {
            System.out.println("Enter element.Enter -1 to exit.");
            temp = scanner.nextInt();
            sum+=temp;
            arrayList.add(temp);
        }
//        arrayList.remove(arrayList.size()-1);
        sum++;
        int sumTilln = (arrayList.size()*(arrayList.size()+1))/2;
        System.out.println(sumTilln+"  "+sum);
        System.out.println("Missing Number :"+ (sumTilln-sum));






    }
}
