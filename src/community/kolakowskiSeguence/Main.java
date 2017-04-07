package community.kolakowskiSeguence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException {

        int N = getDigitFromConsole("Enter the digits to output (N=[1,...,1000]): ");

        while (N <= 1 || 1000 <= N) {
            System.out.println("Enter other number.");
            N = getDigitFromConsole("Enter the digits to output (N=[1,...,1000]): ");
        }
        System.out.println("N = " + N);

        int[] tab = new int[N];

        int A = getDigitFromConsole("Enter first digits (A=[1,...,9]): ");
        while (A <= 1 || 9 <= A) {
            System.out.println("Enter other number.");
            A = getDigitFromConsole("Enter the digits to output (N=[1,...,1000]): ");;
        }
        System.out.println("A = " + A);

        int B = getDigitFromConsole("Enter second digits (B=[1,...,9] and B != A): ");
        while (B <= 1 || 9 <= B || B == A) {
            System.out.println("Enter other number.");
            B = getDigitFromConsole("Enter the digits to output (N=[1,...,1000]): ");;
        }
        System.out.println("B = " + B);

        tab[0] = A;
        tab[1] = B;
        tab[2] = B;

        for (int i = 2; i < N; i++) {
            if (i % 2 != 0 && tab[i] == A) {
                for (int j = 0; j < N; j++) {
                    if (tab[j] == 0) {
                        tab[j] = B;
                        break;
                    }
                }
            }
            if (i % 2 == 0 && tab[i] == A) {
                for (int j = 0; j < N; j++) {
                    if (tab[j] == 0) {
                        tab[j] = A;
                        break;
                    }
                }
            }
            if (i % 2 != 0 && tab[i] == B) {
                for (int j = 0; j < N; j++) {
                    if (tab[j] == 0) {
                        tab[j] = B;
                        if (j + 1 < tab.length) {
                            tab[j + 1] = B;
                        }
                        ;
                        break;
                    }
                }
            }
            if (i % 2 == 0 && tab[i] == B) {
                for (int j = 0; j < N; j++) {
                    if (tab[j] == 0) {
                        tab[j] = A;
                        if (j + 1 < tab.length) {
                            tab[j + 1] = A;
                        }
                        ;
                        break;
                    }
                }
            }
        }


        for (int element : tab) {
            System.out.print(element);
        }
    }

    public static int getDigitFromConsole(String prompt) throws IOException {
        for (; ; ) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException nfe) {
                System.out.println("Your input "+prompt+" was invalid. Try again :)");
            }
        }
    }
}
