
public class Main {

    public static void main(String[] args) {
        int square, cube;
        String hdg1 = "Multiplication of Number";
        String hdg2 = "________________________";
        String hdg3 = "num";
        String hdg4 = "square";
        String hdg5 = "cube";
        System.out.printf("%5s", hdg1);
        System.out.println();
        System.out.printf("%5s", hdg2);
        System.out.println();
        System.out.printf("%8s %9s %6s", hdg3, hdg4, hdg5);
        System.out.println();
            for ( int x = 1; x <= 5; x ++) {
                square = x * x;
                cube = square * x;

                System.out.printf("%7d,%7d,%7d", x, square, cube);
                System.out.println();

            }



        int product;
        String hdg6 = "Seven Times Table";
        String hdg7 = "_________________";
        String hdg8 = "7*";
        String hdg9 = "=";
        System.out.printf("%5s", hdg6);
        System.out.println();
        System.out.printf("%5s", hdg7);
        System.out.println();
        for (int y = 1; y <= 12; y++) {
            product = 7 * y;
            System.out.printf("%2s %2d %2s %2d", hdg8, y, hdg9, product);
            System.out.println();
        }
    }
}
