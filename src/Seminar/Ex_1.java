package Seminar;

public class Ex_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int a = arr(array);
        if (a == -1) {
            System.out.println("-1");
        }
    }

    static int arr(int[] array) {
        int minSize = 3;
        if (array.length < minSize) return -1;
        else return array.length;
    }
}
