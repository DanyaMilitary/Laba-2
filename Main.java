public class Main {
    public static void main(String[] args) {
        double x = 1.0;
        int n = 10;

        double sum = 0;
        for (int i = 0; i <= n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, i) / factorial(i);
            sum += term;
        }
        System.out.println("e^" + x + " = " + sum);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
