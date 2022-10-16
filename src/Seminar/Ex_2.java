package Seminar;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый,
обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */


import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        view(arr);
    }

    public static void view(int[] arr) {
        Scanner IScanner = new Scanner(System.in);
        System.out.println("Input search number");
        int num = IScanner.nextInt();
        int result = searchIndex(arr, num);
        switch (result) {
            case -1:
                System.out.println("Array length < minSize");
                break;
            case -2:
                System.out.println("Number not found in array");
                break;
            case -3:
                System.out.println("Array is null");
                break;
            case -4:
                System.out.println("Array is empty");
                break;
            default:
                System.out.println("Index element is " + result);

        }
    }

    public static int searchIndex(int[] arr, int num) {
        int minSize = 3;
        if (arr == null) return -3;
        if (arr.length == 0) return -4;
        if (arr.length < minSize) return -1;
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                return index;
            }
        }
        return -2;
    }
}

