package tema2;

public class Ex12 {

    public static void Fibonacci(){
        int a=0,b=1,f=0;
        System.out.print( a + " " );
        System.out.print(b + " ");
        for (int i=2 ; i<=24 ; i++){
            f= a+b;
            a=b;
            b=f;
            System.out.print(f + " ");


        }
    }

    public static void main(String[] args) {
        System.out.println("Write a Java method to print the first 25 terms of the Fibonacci series");
        Fibonacci();
    }
}
