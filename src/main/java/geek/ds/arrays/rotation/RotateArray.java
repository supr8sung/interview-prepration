package geek.ds.arrays.rotation;

public class RotateArray {

    // Program for array rotation
    // Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

    static int[] rotateLeft(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array size can not be empty");
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    static int[] rotateRight(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array size can not be empty");
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    // This method has a complexity of O(n~2) in worst case
    static int[] rotateLeftByNumber(int[] arr, int rotateBy) {
        for (int i = 0; i < rotateBy; i++) {
            rotateLeft(arr);
        }
        return arr;
    }

    // Juggling algorithm has a complexity of O(n)

    static int[] rotateLeftByJuggle(int[] arr, int rotateBy) {
        int length = arr.length;
        int gcd = findGCD(length, rotateBy);
        int j, k;

        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            j = i;
            while (true) {
                k = j + rotateBy;
                if (k >= length)
                    k = k - length;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;

            }
            arr[j] = temp;
        }
        return arr;
    }

    private static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGCD(b, a % b);
    }


}
