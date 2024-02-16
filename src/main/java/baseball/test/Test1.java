package main.java.baseball.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 야구 게임을 시작합니다.");

        int ranNum = 237;
        int[] ranArr = new int[3];
        for (int i = 0; i < 3; i++) {
            ranArr[i] = ranNum % 10;
            ranNum /= 10;
            System.out.println(ranArr[i]);
        }

        int[] scArr = new int[3];
        System.out.print("숫자를 입력해주세요 : ");
        int scNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < 3; i++) {
            scArr[i] = scNum % 10;
            scNum /= 10;
            System.out.println(scArr[i]);
        }


    }
}
