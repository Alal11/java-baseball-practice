package baseball.view;

public class GamePrint {

    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String GAME_END_MESSAGE = "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String GAME_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String STRIKE_PRINT = "스트라이크";
    public static final String BALL_PRINT = "볼";
    public static final String NOTHING_PRINT = "낫싱";
    private static final String ERROR_MESSAGE = "잘못된 입력값 입니다.";


    public static void printStart() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printInputNumber() {
        System.out.println(GAME_INPUT_MESSAGE);
    }

    public static void printInputError() {
        System.out.println(ERROR_MESSAGE);
    }

    public static void printReEnd() {
        System.out.println(GAME_RESTART_MESSAGE);
    }
}
