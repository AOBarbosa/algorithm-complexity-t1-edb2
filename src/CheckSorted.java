public class CheckSorted {
    public boolean execute(int[] vec) {
        if (vec.length == 0) {
            return false;
        }

        if (vec.length == 1) {
            return true;
        }

        for (int i = 0; i < vec.length - 1; i++) {
            if (vec[i] > vec[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
