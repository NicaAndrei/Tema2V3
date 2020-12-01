package tema2;

import java.util.Scanner;

public class Ex5 {

    public static void PrimNr(int a) {
        for (int i = 2; i < a; i++) {

            int nr = 0;

            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0)
                    nr++;

            if (nr == 0)
                System.out.println(i+ " ");

        }

    }
    public static void main(String[] args) {
        System.out.println("Display all the prime numbers lower than a given number, read the number from keyboard");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number ");
        int a = sc.nextInt();
        PrimNr(a);

    }
}
