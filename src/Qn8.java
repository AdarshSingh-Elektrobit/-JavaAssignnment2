import java.util.Scanner;

public class Qn8 {
    //Write a Java program to find the second smallest element in an array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        // 1,2,3,4,5
        int s1 = arr1[0];
        int s2 = arr1[0];
        int j=0;
        for (int num : arr1) {
            if (num < s1) {
                s2 = s1;
                s1 = num;
            } else if (num < s2 && num != s1) {
                s2 = num;
            }
        }

        System.out.println("2nd smallest element in the array is: "+s2);



    }//psvm
}//class
