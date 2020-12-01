package tema2;

public class Ex9 {

    public static void DuplicateRemove(int []a,int m){


        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (a[i] == a[j]) {
                    for (int l = j; l < m; l++) {

                        a[l - 1] = a[l];
                    }
                    m--;
                    j--;
                }
            }
        }
        for (int l = 0; l < m; l++)
            System.out.print(a[l] + " ");
    }

    public static void main(String[] args) {
        System.out.println("Write a Java program to remove the duplicate elements of a given array and return the new length of the array");
        int[] a = {20, 20, 30, 40, 50, 50, 50};
        int m = a.length;
        for (int i = 0; i < m; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        DuplicateRemove(a,m);

    }
}
