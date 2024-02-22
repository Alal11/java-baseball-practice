package baseball.view;

public class GamePrint {

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void end() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void resultPrint(int[] sbCountArr) {
        if (sbCountArr[1] != 0) {
            System.out.print(sbCountArr[1] + "볼");
        }
        if (sbCountArr[0] != 0) {
            System.out.println(sbCountArr[0] + "스트라이크");
            if (sbCountArr[0] == 3) {
                System.out.println(sbCountArr[0] + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }
        if (sbCountArr[0] == 0 && sbCountArr[1] == 0) {
            System.out.println("낫싱");
        }
    }
}
