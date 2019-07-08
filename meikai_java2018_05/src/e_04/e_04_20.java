package e_04;

import java.util.Scanner;

/*
 * 演習4-20：n段の正方形を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年7月8日
 */
public class e_04_20 {

    public static void main(String[] args) {

        //正方形を表示する段数として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //正方形の段数・列数を計算する最初の値。
        final int START_VALUE = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputSteps;
        //入力値が適切かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("正方形の段数：");
            //入力された値を取得する。
            inputSteps = inKeyboard.nextInt();
            //入力値が2未満の場合
            if (inputSteps < THRESHOLD_VALUE) {
                //2以上の数を入力するようアナウンスする。
                System.out.println("\n2以上の整数値を入力して下さい。");
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputSteps < THRESHOLD_VALUE);

        //入力値分、正方形の段を作成する。
        for (int creatingSteps = START_VALUE; creatingSteps <= inputSteps; creatingSteps++) {
            //入力値分、正方形の列を作成する。
            for (int creatingRows = START_VALUE; creatingRows <= inputSteps; creatingRows++) {
                //正方形を描くための'＊'を表示する。
                System.out.print('＊');
                //入力値の数分'＊'を表示したかを判定する。
                if (creatingRows == inputSteps) {
                    //入力値に'＊'の数が達したので改行する。
                    System.out.println();
                }
            }
        }
    }
}