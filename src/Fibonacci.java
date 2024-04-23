public class Fibonacci {
    public int iterative(int n) {
        if(n==0)
            return 0;

        int n1 = 0;
        int n2 = 1;
        int fib = 1;


        for(int i = 1; i < n; i++)
        {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
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

    public void testIterative() {
        System.out.println("Fibonacci(0): " + iterative(0)); // Deve retornar 1
        System.out.println("Fibonacci(1): " + iterative(1)); // Deve retornar 1
        System.out.println("Fibonacci(2): " + iterative(2)); // Deve retornar 2
        System.out.println("Fibonacci(3): " + iterative(3)); // Deve retornar 3
        System.out.println("Fibonacci(4): " + iterative(4)); // Deve retornar 5
        System.out.println("Fibonacci(5): " + iterative(5)); // Deve retornar 8
    }

    public void testRecursive() {
        System.out.println("Fibonacci(0): " + recursive(0)); // Deve retornar 0
        System.out.println("Fibonacci(1): " + recursive(1)); // Deve retornar 1
        System.out.println("Fibonacci(2): " + recursive(2)); // Deve retornar 1
        System.out.println("Fibonacci(3): " + recursive(3)); // Deve retornar 2
        System.out.println("Fibonacci(4): " + recursive(4)); // Deve retornar 3
        System.out.println("Fibonacci(5): " + recursive(5)); // Deve retornar 5
    }

    public void testDynamicRecursive() {
        System.out.println("Fibonacci(0): " + dynamicRecursive(0)); // Deve retornar 0
        System.out.println("Fibonacci(1): " + dynamicRecursive(1)); // Deve retornar 1
        System.out.println("Fibonacci(2): " + dynamicRecursive(2)); // Deve retornar 1
        System.out.println("Fibonacci(3): " + dynamicRecursive(3)); // Deve retornar 2
        System.out.println("Fibonacci(4): " + dynamicRecursive(4)); // Deve retornar 3
        System.out.println("Fibonacci(5): " + dynamicRecursive(5)); // Deve retornar 5
    }
}
