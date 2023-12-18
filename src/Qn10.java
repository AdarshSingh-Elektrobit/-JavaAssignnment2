import java.util.Scanner;

public class Qn10 {
    //Write a Java program to check if an array of integers is without 0 and -1

    public static void main(String[] args) {
        boolean contains0 = false;
        boolean contains1 = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i:arr1)
        {
            if (i==0)
                contains0 = true;
            if (i==-1)
                contains1 = true;

        }

        if (contains0)
            System.out.println("The array contains 0's");

        if (contains1)
            System.out.println("The array contains -1's");





    }//PSVM
}//CLASS
