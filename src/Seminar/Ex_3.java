package Seminar;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

public class Ex_3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,1,1},{1, 1, 0, 1}, {1, 0, 0, 1}, {0, 1, 0, 1}};
        int sum = sum(arr);
        System.out.println(sum);
    }

    public static int sum(int[][] array) {
        int sum = 0;
        if (array.length != array[0].length) {
            throw new RuntimeException("Width array not equal of Height array");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1)
                    throw new RuntimeException("Elements not 0 or 1");
                sum += array[i][j];
            }
        }
        return sum;
    }
}
