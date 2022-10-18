package Homework;

public class Ex_3 {
    public static void main(String[] args) {
        double[] array1 = new double[]{1,2,3,4,5};
        double[] array2 = new double[]{5,4,2,3,7};
        double[] array3 = generateArr(array1, array2);
        for (double v : array3) {
            System.out.printf("%f ", v);
        }
    }

    public static double[] generateArr(double[] arr1, double[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Length of arr1 and arr2 are not equal");
        }
        double[] arr3 = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Elements in array2 == 0. Division by zero is impossible");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }
}
