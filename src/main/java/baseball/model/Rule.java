package baseball.model;

import java.util.List;

public class Rule {

    private final static int NUM_SIZE = 3;

    public int[] gameRule(List<Integer> computerList, int[] userArr) {
        int scount = 0;
        int bcount = 0;

        while (true) {
            for (int i = 0; i < NUM_SIZE; i++) {
                for (int j = 0; j < NUM_SIZE; j++) {
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

}
