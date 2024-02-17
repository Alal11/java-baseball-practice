package main.java.baseball.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int SIZE = 3;

        System.out.println("숫자 야구 게임을 시작합니다.");

        int ran1, ran2, ran3;


        while (true) {
            ran1 = (int) (Math.random() * 9);
            ran2 = (int) (Math.random() * 9);
            ran3 = (int) (Math.random() * 9);

            if (!(ran1 == ran2 || ran2 == ran3 || ran3 == ran1 || ran1 == 0)) {
                break;
            }
        }
        int[] ranArr = new int[SIZE];
        ranArr[0] = ran1;
        ranArr[1] = ran2;
        ranArr[2] = ran3;

        for (int i : ranArr) {
            System.out.println(i);
        }

        while(true){
            int[] scArr = new int[SIZE];
            System.out.print("숫자를 입력해주세요 : ");
            int scNum = Integer.parseInt(br.readLine());

            for (int i = 0; i < SIZE; i++) {
                scArr[SIZE - i - 1] = scNum % 10;
                scNum /= 10;
            }

            for (int i : scArr) {
                System.out.println(i);
            }

            int scount = 0;
            int bcount = 0;

            while (true) {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (ranArr[i] == scArr[j] && i==j) {
                            scount++;
                        } else if (ranArr[i] == scArr[j] && i!=j) {
                            bcount++;
                        }
                    }
                }
                break;
            }

            if (bcount != 0) {
                System.out.print(bcount + "볼");
            }
            if (scount != 0) {
                System.out.println(scount + "스트라이크");
                if(scount==3){
                    System.out.println(scount+"개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    break;
                }
            }
            if (bcount == 0 && scount == 0) {
                System.out.println("낫싱");
            }
        }
    }
}
