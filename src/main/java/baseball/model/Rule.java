package baseball.model;

import baseball.view.GamePrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Rule {

    public int[] gameRule(int size, List<Integer> computerList, int[] userArr) {
        int scount = 0;
        int bcount = 0;

        while (true) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (computerList.get(i) == userArr[j] && i == j) {
                        scount++;
                    } else if (computerList.get(i) == userArr[j] && i != j) {
                        bcount++;
                    }
                }
            }
            break;
        }
        int[] sbCountArr = {scount, bcount};

        return sbCountArr;
    }

    public void resultPrint(int[] sbCountArr) {
        if (sbCountArr[1] != 0) {
            System.out.print(sbCountArr[1] + GamePrint.BALL_PRINT);
        }
        if (sbCountArr[0] != 0) {
            System.out.println(sbCountArr[0] + GamePrint.STRIKE_PRINT);
            if (sbCountArr[0] == 3) {
                System.out.println(sbCountArr[0] + GamePrint.GAME_END_MESSAGE);
            }
        }
        if (sbCountArr[0] == 0 && sbCountArr[1] == 0) {
            System.out.println(GamePrint.NOTHING_PRINT);
        }
    }

    public boolean ReGmae() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        GamePrint.printReEnd();

        int endNum = Integer.parseInt(br.readLine());

        if (endNum == 1) {
            return true;

        } else if (endNum == 0) {
            return false;
        } else {
            GamePrint.printInputError();
        }
        return false;
    }

}
