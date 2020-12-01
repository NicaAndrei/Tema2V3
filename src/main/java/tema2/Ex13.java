package tema2;

import java.util.Scanner;

public class Ex13 {

    public static void Duplicate(String a , int m){
        char[] z = a.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (z[i] == z[j]) {
                    System.out.println(z[j] +" ");;
                    break;


                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Write a Java method to find the duplicate characters in a string.");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int m = a.length();
        Duplicate(a,m);
    }
}
