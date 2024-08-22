import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // Insertion sort algorithm
        for (int i = 1; i < n; i++) {
            int c = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > c) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = c;  
        }

        System.out.println("The sorted elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
