public class reverse {
    public static void main(String[] args) {
        int n = 1234;
        rev(n);
        System.out.println(sum);
    }

    static int sum = 0;

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;
        rev(n);

    }
}
// public class reverse {
// public static void main(String[] args) {
// int num = 1234;
// System.out.println(rev(num));

// }
// static int sum = 0;
// public static void rev(int n) {
// if (n == 0) {
// return;
// }
// int rem = n % 10;
// sum = sum*10+rem;
// n = n / 10;
// rev(n);
// }
// }