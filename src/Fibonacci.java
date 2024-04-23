public class Fibonacci {
    public int iterative(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }

        return fib;
    }

    public int recursive(int n) {
        if(n<=1) return n;

        return recursive(n-1) + recursive(n-2);
    }

    public int dynamicRecursive(int n) {
        if(n<=1) return n;

        int[] fib = new int[n + 1];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n-1];
    }
}
