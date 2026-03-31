// Program 1:
// Implement Array and String operations (Reverse, Sort, Search, Average,
// Maximum) using class and objects.


import java.util.Arrays;
import java.util.Scanner;
    class Operations {
    int[] arr;
    String str;
        Operations(int[] arr, String str) {
        this.arr = arr;
        this.str = str;
        }
        void reverseArray() {
            for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                    }
        }
        void reverseString() {
            str = new StringBuilder(str).reverse().toString();
            }
        void sortArray() {
        Arrays.sort(arr);
        }
        boolean searchArray(int key) {
        for (int num : arr) {
            if (num == key) return true;
            }
    return false;
    }
            double averageArray() {
            int sum = 0;
                for (int num : arr) sum += num;
                return (double) sum / arr.length;
    }
        int maxArray() {
        int max = arr[0];
            for (int num : arr) if (num > max) max = num;
            return max;
    }
            void display() {
                System.out.println("Array: " + Arrays.toString(arr));
                System.out.println("String: " + str);
        }
    }
    public class Program1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int[] numbers = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
    numbers[i] = sc.nextInt();
    }
    System.out.print("Enter a string: ");
    sc.nextLine();
    String text = sc.nextLine();
    Operations op = new Operations(numbers, text);
    System.out.println("\nOriginal:");
    op.display();
    op.reverseArray();
    op.reverseString();
    System.out.println("\nAfter Reverse:");
    op.display();
    op.sortArray();
    System.out.println("\nAfter Sort:");
    op.display();
    System.out.print("\nEnter element to search: ");
    int key = sc.nextInt();
    System.out.println("Search Result: " + (op.searchArray(key) ? "Found" : "Not Found"));
    System.out.println("Average: " + op.averageArray());
    System.out.println("Maximum: " + op.maxArray());
    sc.close();
    }
 }