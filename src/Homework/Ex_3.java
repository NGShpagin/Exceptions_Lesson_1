package Homework;

public class Ex_3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{5,4,2,3,7};
        int[] array3 = generateArr(array1, array2);
        for (int i = 0; i < array3.length; i++) {
            System.out.printf("%d ", array3[i]);
        }
    }

    public static int[] generateArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Length of arr1 and arr2 are not equal");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Elements in array2 == 0. Division by zero is impossible");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }
}
