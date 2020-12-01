package tema2;

import java.util.Scanner;

public class Ex3 {
    public static int maximum(int a){

        int max = 0;
        while (a!=0){
            int c = a%10;
            if (c>max)
                max=c;
            a=a/10;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Display the max digit from a number, read the number from keyboard");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number");
        int a = sc.nextInt();

        System.out.println("The max digit of a number is " + maximum(a));
    }
}
