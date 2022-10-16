package Seminar;

/*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    Метод должен пройтись по каждому элементу и проверить что он не равен null.
    А теперь реализуйте следующую логику:
    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

import java.util.ArrayList;
import java.util.List;

public class Ex_4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"1", "3", "2"};
        System.out.println(checkArray(arr));
    }

    public static List<Integer> checkArray(String[] arr) {
//        int[] newArr = new int[arr.length];
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) newArr.add(i);
        }
        if (newArr.isEmpty()) {
            throw new RuntimeException("Null is not found");
        };
        return newArr;
    }
}
