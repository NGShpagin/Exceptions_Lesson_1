package Lection;

import java.io.File;

public class Program {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("123")));
        System.out.println(divides(10, 0));
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
//        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divides(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permit");
        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
