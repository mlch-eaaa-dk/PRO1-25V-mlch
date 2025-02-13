package ex1;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        // a
        int[] a = new int[10];
        System.out.println("a: " + Arrays.toString(a));

        // b
        int[] b = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println("b: " + Arrays.toString(b));

        // c
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        System.out.println("c: " + Arrays.toString(c));

        // d
        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = 2 * i + 2;
        }
        System.out.println("d: " + Arrays.toString(d));

        // e
        int[] e = new int[10];
        for (int i = 0; i < 10; i++) {
            e[i] = (i + 1) * (i + 1);
        }
        System.out.println("e: " + Arrays.toString(e));

        // f
        int[] f = new int[10];
        for (int i = 0; i < 10; i++) {
            f[i] = i % 2;
        }
        System.out.println("f: " + Arrays.toString(f));

        // g
        int[] g = new int[10];
        for (int i = 0; i < 10; i++) {
            g[i] = i % 5;
        }
        System.out.println("g: " + Arrays.toString(g));

        // h
        int[] h = new int[10];
        for (int i = 0; i < 10; i++) {
            h[i] = 2 * i + i % 2;
//          if (i % 2 == 0) // lige i
//				h[i] = 2 * i;
//			else // ulige i
//				h[i] = 2 * i + 1;
        }
        System.out.println("h: " + Arrays.toString(h));

        // h1
        int[] h1 = new int[10];
        h1[0] = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                h1[i] = h1[i - 1] + 1;
            } else {
                h1[i] = h1[i - 1] + 3;
            }
        }
        System.out.println("h1: " + Arrays.toString(h));
    }
}
