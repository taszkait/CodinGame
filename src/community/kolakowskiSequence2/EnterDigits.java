package community.kolakowskiSequence2;

import java.io.IOException;
import java.util.Scanner;


public class EnterDigits {
    static Scanner sc = new Scanner(System.in);
    static int A, B, N;

    public static int getDigitsOutputFromConsole () throws IOException {
        N=getDigitFromConsole("Enter the digits to output (N=[1,...,1000]): ");
        while (N<=1 || 1000<=N){
            N=getDigitFromConsole("Enter other number: ");
        }
        return N;
    }

    public static int getDigitsAFromConsole () throws IOException {
        A = getDigitFromConsole("Enter first digits (A=[1,...,9]): ");
        while (A<=1 || 9<=A){
            A=getDigitFromConsole("Enter other number: ");;
        }
        return A;
    }

    public static int getDigitsBFromConsole () throws IOException {
        B = getDigitFromConsole("Enter second digits (B=[1,...,9] and B != A): ");
        while (B<=1 || 9<=B || B==A){
            B=getDigitFromConsole("Enter other number: ");
        }
        return B;
    }

    public static int getDigitFromConsole(String prompt) throws IOException {
        for (; ; ) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException nfe) {
                System.out.println("Your input was invalid. Try again :)");
            }
        }
    }
}
