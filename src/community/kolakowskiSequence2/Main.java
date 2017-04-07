package community.kolakowskiSequence2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void main(String[] args) throws IOException {
        int N = EnterDigits.getDigitsOutputFromConsole();
        int A = EnterDigits.getDigitsAFromConsole();
        int B = EnterDigits.getDigitsBFromConsole();

        SetSequence.setDigital(N, A, B);

        ShowSequence.showSequence(N);

    }
}

