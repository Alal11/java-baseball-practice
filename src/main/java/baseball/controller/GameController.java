package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.Rule;
import baseball.model.UserNumber;
import baseball.view.GamePrint;

import java.io.IOException;
import java.util.List;

public class GameController {
    private final int NUM_SIZE = 3;


    public void gameStart() throws IOException {
        GamePrint.printStart();

        ComputerNumber computerNumber = new ComputerNumber();
        List<Integer> computerList = computerNumber.randomNumber(NUM_SIZE);

        UserNumber userNumber = new UserNumber();
        int inputNum = userNumber.inputNumber();

        int[] userInputNumber = userNumber.inputList(NUM_SIZE, inputNum);

        Rule rule = new Rule();
        int[] sbCountList = rule.gameRule(NUM_SIZE, computerList, userInputNumber);

        rule.resultPrint(sbCountList);
    }


}
