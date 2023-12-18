import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qn6 {
    //Write a Java program to find duplicate values in an array of string values.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the string array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] arr = new String[size];
        System.out.println("Enter the elements of the string array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each string in the array
        for (String str : arr) {
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }

        System.out.println("Duplicate strings in the array:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        scanner.close();
    }
}
