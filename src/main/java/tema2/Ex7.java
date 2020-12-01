package tema2;

import java.util.Scanner;

public class Ex7 {

    public static void CalcV2(int n1 , int n2 , String operatie , int nr){

        int i=1;
        switch (operatie) {
            case "+": {
                int sum = 0;

                while (i <= nr) {
                    sum += (n1 + n2);
                    i++;
                }
                System.out.println("Suma numerelor este" + sum);

            }
//                System.out.println("Suma numerelor este " + (n1 + n2));
            break;
            case "-":{
                int dif = 0;

                while (i <= nr) {
                    dif -= (n1 - n2);
                    i++;
                }
                System.out.println("Diferenta numerelor este" + dif);

            }
//                System.out.println("Diferenta numerelor este " + (n1 - n2));
            break;
            case "*":{
                int pro = 1;

                while (i <= nr) {
                    pro *= (n1 * n2);
                    i++;
                }
                System.out.println("Produsul numerelor este" + pro);

            }
//                System.out.println("Produsul numerelor este " + (n1 * n2));
            break;
            case "/":{
                int imp = 1;

                while (i <= nr) {
                    imp /= (n1 / n2);
                    i++;
                }
                System.out.println(n1 + " Impartit la " + n2 + " de" + nr +"ori este" + imp);

            }
//                System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
            break;
            default:
//                System.out.println("Operatie necunoscuta");
        }

    }

    public static void main(String[] args) {
        System.out.println("Change the implementation of the calculator from the previous meeting to not stop after one calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2 = sc.nextInt();
        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();
        System.out.println("De cate ori vrei sa se repete operatia?");
        int nr = sc.nextInt();
        CalcV2(n1,n2,operatie,nr);
    }
}
