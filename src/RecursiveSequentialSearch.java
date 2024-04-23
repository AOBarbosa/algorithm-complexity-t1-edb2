public class RecursiveSequentialSearch {
    public int execute(int[] vec, int n, int index) {
        if (index >= vec.length) {
            return -1;
        }

        if (vec[index] == n) {
            return index;
        }

        return execute(vec, n, index + 1);
    }
}
