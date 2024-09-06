public class invertedTriangle {
    public static void main(String[] args) {
        Triangle(4, 0);
    }

    public static void inTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("*");
            inTriangle(r, c + 1);
        } else {
            System.out.println();
            inTriangle(r - 1, 0);
        }

    }

    public static void Triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r < c) {
            Triangle(r, c + 1);
            System.out.println("*");
        } else {
            Triangle(r - 1, 0);
            System.out.println();
        }
    }
}
