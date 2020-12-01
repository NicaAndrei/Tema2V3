package tema2;

import java.util.Scanner;

public class Ex11 {

    public static void NrOfDays(int month, int year){

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){

            System.out.println("Number of days is 31");
        }
        else if( (month == 2) && ((year % 400 ==0) || (year % 4 ==0 && year %100 !=0))){

            System.out.println("Number of days is 29");
        }
        else if (month == 2){

            System.out.println("number of days is 28");
        }
        else {

            System.out.println("number of days is 30");
        }
    }

    public static void main(String[] args) {
        System.out.println("Print the number of days specific to each month in year");
        Scanner sc = new Scanner(System.in);
        System.out.println("type a month number");
        int month = sc.nextInt();
        System.out.println("Input a year");
        int year = sc.nextInt();
        NrOfDays(month,year);

    }
}
