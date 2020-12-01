package tema2;

import java.util.Scanner;

public class Ex2 {
    public static int smallestNr(int[]a,int length){


        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (a[i] > a[j]) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        return a[0];
    }
    public static void main(String[] args) {
        System.out.println("Display the smallest number from an array of numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] a = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The smallest number form an array is " + smallestNr(a, length));

}
}
