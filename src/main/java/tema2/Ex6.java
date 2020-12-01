package tema2;

import java.util.Scanner;

public class Ex6 {

    public static void Calc(int n1 , int n2 , String operatie){

        if (operatie.equals("+")) {
            System.out.println("Suma numerelor este " + (n1 + n2));
        } else if (operatie.equals("-")) {
            System.out.println("Diferenta numerelor este " + (n1 - n2));
        } else if (operatie.equals("*")) {
            System.out.println("Produsul numerelor este " + (n1 * n2));
        } else if (operatie.equals("/")) {
            System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
        } else {
            System.out.println("Operatie necunoscuta");
        }
    }

    public static void main(String[] args) {
        System.out.println("Change the implementation of the calculator from the previous meeting to use only if-else instead of switch");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2 = sc.nextInt();
        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();

        Calc(n1,n2,operatie);


    }
}
