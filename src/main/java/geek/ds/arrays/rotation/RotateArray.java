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


}
