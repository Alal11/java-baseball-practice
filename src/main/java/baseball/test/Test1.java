package main.java.baseball.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 야구 게임을 시작합니다.");

        int ran1, ran2, ran3;


        while(true){
            ran1 = (int) (Math.random() * 9);
            ran2 = (int) (Math.random() * 9);
            ran3 = (int) (Math.random() * 9);

            if(!(ran1==ran2 || ran2==ran3 || ran3==ran1)){
                break;
            }
        }

        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);

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
