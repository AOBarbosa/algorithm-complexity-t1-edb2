import java.util.Arrays;

public class BinarySearch {
    public int iterative(int[] vec, int n) {
        Arrays.sort(vec);

        if (vec.length == 0) {
            return -1;
        }

        int low = 0;
        int high = vec.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = vec[mid];

            if (guess == n) {
                return mid;
            }

            if (guess > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int recursive(int[] vec, int n) {
        return binarySearchRecursive(vec, n, 0, vec.length - 1);
    }

    private int binarySearchRecursive(int[] vec, int n, int low, int high) {
        if (low > high) {
            return -1; // Elemento não encontrado
        }

        int mid = low + (high - low) / 2;

        if (vec[mid] == n) {
            return mid; // Elemento encontrado
        } else if (vec[mid] < n) {
            return binarySearchRecursive(vec, n, mid + 1, high); // Busca na metade direita
        } else {
            return binarySearchRecursive(vec, n, low, mid - 1); // Busca na metade esquerda
        }
    }
}
