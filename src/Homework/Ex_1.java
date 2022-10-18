package Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex_1 {
    public static void main(String[] args) {
        double[] array1 = new double[]{1,2,3,4,3};
        double[] array2 = new double[]{5,4,2,2,1};
        double divSum = divisionSum(array1, array2);
        System.out.println(divSum);

        String[] array3 = new String[]{"h", "e", "l", "l", "o"};
        String word = createWord(array3);
        System.out.println(word);
    }

    public static double divisionSum(double[] arr1, double[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Length of arr1 and arr2 are not equal");
        }
        double res = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Elements in array2 == 0. Division by zero is impossible");
            }
            res += arr1[i] / arr2[i];
        }
        return res;
    }

    public static String createWord(String[] arr) {
        String res = "";
        for (String s : arr) {
            if (s == null || s.isEmpty()) {
                throw new RuntimeException("Element is null or empty");
            }
            res += s;
        }
        return res;
    }
}
