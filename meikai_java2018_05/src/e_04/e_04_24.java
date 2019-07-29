package e_04;

import java.util.Scanner;

/*
 * 演習4-24：正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。
 *           素数とは、2以上n未満のいずれの数でも割り切ることのできない整数nのことである。
 * 作成者：岐部 佳織
 * 作成日：2019年7月29日
 */

public class e_04_24 {

    public static void main(String[] args) {

        //入力値として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //素数であるかの判定で最初に代入する値。
        final int CALCULATING_TWO = 2;
        //入力値が0で割り切れるかの判定で使用する値。
        final int CALCULATING_ZERO = 0;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputSteps;
        //入力値として適切かを判定する条件式を代入する変数を用意する。
        boolean inputJudgement;

        //入力値が適切かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("整数n：");
            //入力された値を取得する。
            inputSteps = inKeyboard.nextInt();
            //入力値として適切かを判定する。
            inputJudgement = (inputSteps < THRESHOLD_VALUE);
            //入力値が2未満の場合
            if (inputJudgement) {
                //2以上の数を入力するようアナウンスする。
                System.out.println("\n2以上の整数値を入力して下さい。");
                //入力値が2以上の場合
            } else {
                //入力値が素数であるかを判定する処理に移る。
                inputJudgement = false;
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputJudgement);

        //入力値が2以上入力値未満のいずれの数でも割り切れることができなくなるまで以下の処理を行う。
        for (int primeNumberJudgement = CALCULATING_TWO; primeNumberJudgement <= inputSteps; primeNumberJudgement++) {
            //計算対象の変数に代入していた値が入力値と等しくなった場合、
            if (primeNumberJudgement == inputSteps) {
                //素数である旨を表示する。
                System.out.print("入力値は素数です。");
                //入力値が2で割り切れる場合、
            } else if (inputSteps % primeNumberJudgement == CALCULATING_ZERO) {
                //素数ではない旨を表示する。
                System.out.print("入力値は素数ではありません。");
                //処理を抜ける。
                break;
            }
        }
    }
}
