package tema2;

import java.util.Scanner;

public class Ex4 {

    public static void Palindrom(int a){

        int r=a,inv = 0;
        while (r!=0){
            int c = r%10;
            inv = inv * 10 +c;
            r/=10;

        }
        if (a==inv)
            System.out.println("The number is palindrom");
        else
            System.out.println("The number is not palindrom");
    }

    public static void main(String[] args) {
        System.out.println("Check if a number is palindrom");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number ");
        int a = sc.nextInt();
        Palindrom(a);
    }
}
