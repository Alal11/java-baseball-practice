package baseball.model;

import baseball.view.GamePrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNumber {

    public int inputNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            GamePrint.printInputNumber();
            int scNum = Integer.parseInt(br.readLine());
            return scNum;
        } catch (IllegalArgumentException e) {
            GamePrint.printInputError();
            return 0;
        }
    }


    public int[] inputList(int size, int scNum) {
        int[] scArr = new int[size];

        for (int i = 0; i < size; i++) {
            scArr[size - i - 1] = scNum % 10;
            scNum /= 10;
        }
        return scArr;
    }
}
