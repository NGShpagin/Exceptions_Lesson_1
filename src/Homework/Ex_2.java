package Homework;

/*
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

public class Ex_2 {
    public static void main(String[] args) {
       String[][] array = new String[][]{
               {"2", "/", "3", "5", "6"},
               {"2", "4", "3", "5", "6"},
               {"4", "4", "3", "5", "6"},
               {"5", "4", "3", "5", "6"},
               {"6", "4", "3", "5", "6"}};
       System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                //#region Exceptions
                if (arr[0].length < 5) {
                    throw new ArrayIndexOutOfBoundsException("Our ArrayLength is less than 5");
                }
                if (arr[i][j] == null || arr[i][j].equals("")) {
                    throw new NumberFormatException("Array contains empty elements or null");
                }
                if (!arr[i][j].matches("[0-9]+")) {
                    throw new NumberFormatException("Array contains elements, which are not numbers");
                }
                //#endregion
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
