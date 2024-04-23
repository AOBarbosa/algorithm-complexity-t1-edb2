public class Main {

    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    public static void sequentialSearch() {
        RecursiveSequentialSearch search = new RecursiveSequentialSearch();

        int[][] vecs = {
                {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5},
                {8},
                {22, 13, 34, 55, 89},
                {},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 33, 45, 57, 69, 81, 93},
                {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000},
                {102, 112, 142, 149},
                {11, 22, 33, 44, 55, 66, 77, 88, 99},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}
        };

        int[] n = {9, 7, 34, 10, 15, 45, 100, 143, 77, 25};

        System.out.println(BLUE + "Busca Sequencial executando:" + RESET);

        for (int i = 0; i < vecs.length; i++) {
            System.out.println(BLUE + "Index of de "+ n[i] +": " + search.execute(vecs[i], n[i], 0) + RESET);
        }
    }

    public static void binarySearch() {
        BinarySearch search = new BinarySearch();

        int[][] vecs = {
                {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5},
                {8},
                {22, 13, 34, 55, 89},
                {},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 33, 45, 57, 69, 81, 93},
                {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000},
                {102, 112, 142, 149},
                {11, 22, 33, 44, 55, 66, 77, 88, 99},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}
        };

        int[] n = {9, 7, 34, 10, 15, 45, 100, 143, 77, 25};

        System.out.println(GREEN + "Busca Binária Iterativa:" + RESET);
        for (int i = 0; i < vecs.length; i++) {
            int number = search.iterative(vecs[i], n[i]);
            if (number != -1) {
                System.out.println(GREEN + "The number: " + number + " is in the array!" + RESET);
            } else {
                System.out.println(GREEN + "The number isnt in the array!" + RESET);
            }
        }

        System.out.println();

        System.out.println(YELLOW + "Busca Binária Recursiva:" + RESET);
        for (int i = 0; i < vecs.length; i++) {
            int number = search.recursive(vecs[i], n[i]);
            if (number != -1) {
                System.out.println(YELLOW + "The number: " + number + " is in the array!" + RESET);
            } else {
                System.out.println(YELLOW + "The number isnt in the array!" + RESET);
            }
        }
    }

    public static void checkSorted() {
        CheckSorted check = new CheckSorted();

        int[][] vecs = {
                {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5},
                {8},
                {13, 22, 34, 55, 89},
                {},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {93, 81, 69, 57, 45, 33, 21},
                {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000},
                {149, 102, 112, 142},
                {99, 88, 77, 66, 55, 44, 33, 22, 11},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}
        };

        System.out.println(PURPLE + "Checa se esta em ordem Crescente:" + RESET);

        for (int[] vec : vecs) {
            boolean isSortedcheck = check.execute(vec);

            if (isSortedcheck) {
                System.out.println(PURPLE + "O array esta ordenado de forma crescente!" + RESET);
            } else {
                System.out.println(PURPLE + "O array nao esta ordenado de forma crescente!" + RESET);
            }
        }
    }

    public static void fibonacci() {
        Fibonacci test = new Fibonacci();

        // Teste para a função iterative
        System.out.println("Teste para a função iterative:");
        test.testIterative();

        // Teste para a função recursive
        System.out.println("\nTeste para a função recursive:");
        test.testRecursive();

        // Teste para a função dynamicRecursive
        System.out.println("\nTeste para a função dynamicRecursive:");
        test.testDynamicRecursive();
    }

    public static void main(String[] args) {
        sequentialSearch();

        System.out.println();

        binarySearch();

        System.out.println();

        checkSorted();

        fibonacci();
    }
}
