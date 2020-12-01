package tema2;

public class Ex10 {
    private static boolean isSquare(int a[][]) {
        int nr = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a.length != a[row].length) {
                    nr++;
                }
            }
        }
        if (nr == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println("Write a method that checks if the array is square");
        int[][] a = {
                {1, 2},
                {4, 5, 6},
                {7},
        };
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");

            }
            System.out.println();
        }
        boolean result = isSquare(a);
        if (result == true)
            System.out.println("matrice este patratica");
        else
            System.out.println("matricea nu e patratica");

    }
}
