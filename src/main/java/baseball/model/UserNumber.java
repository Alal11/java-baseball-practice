package baseball.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNumber {

    public int inputNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("숫자를 입력해주세요 : ");
            int scNum = Integer.parseInt(br.readLine());
            return scNum;
        }catch (IllegalArgumentException e){
            System.out.println("잘못된 입력값 입니다.");
            return 0;
        }
    }







}
