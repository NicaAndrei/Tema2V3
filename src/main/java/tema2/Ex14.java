package tema2;

import java.util.Scanner;

public class Ex14 {

    public static void Pairs ( int [] a, int n){
        for (int i = 0; i < a.length - 1; i++) {

            if( a[i] + a[i+1] == n){
                System.out.println(a[i] + "," + a[i+1]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Write a Java method to find all pairs of elements in an array whose sum is equal to a given number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number");
        int n = sc.nextInt();
        int[] a = {1, 4, 8, 2, 15, 32, 6, 6};
        Pairs(a,n);
    }
}
