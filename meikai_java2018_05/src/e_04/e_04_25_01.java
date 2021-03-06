package e_04;

import java.util.Scanner;

/**
 * 演習4-25-01：合計だけでなく平均も求めるようにList4-17（p.126）およびList4-18（p.127）のプログラムを書きかえよ。
 * 作成者：岐部 佳織
 * 作成日：2019年9月11日
 */

/**List4-17（p.126）のプログラム。*/
public class e_04_25_01 {

    public static void main(String[] args) {

        //入力値が適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //計算で使用する変数を初期化する値。
        final int START_VALUE = 0;
        //処理を抜けるかの判定で使用する値。
        final int BREAK_PROCESS = 0;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int firstInputNumber;
        //入力値として適切かを判定する条件式を代入する変数を用意する。
        boolean inputJudgement;

        //入力値が適切かを判定する。
        do {
            //入力値を加算する旨を表示する。
            System.out.println("整数を加算します。");
            //加算する個数の入力を促す。
            System.out.print("何個加算しますか：");
            //入力された値を取得する。
            firstInputNumber = inKeyboard.nextInt();
            //入力値が適切かを判定する。
            inputJudgement = (firstInputNumber < THRESHOLD_VALUE);
            //入力値が2未満の場合
            if (inputJudgement) {
                //2以上の数を入力するようアナウンスする。
                System.out.println("\n2以上の整数値を入力して下さい。");
                //入力値が2以上の場合
            } else {
                //合計値および平均値を算出する処理に移る。
                inputJudgement = false;
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputJudgement);

        //合計値用の変数を用意し初期化する。
        int sumTotal = START_VALUE;
        //合計値算出のための入力回数が、加算する個数の値に到達するまで以下の処理を行う。
        for (int inputFrequency = START_VALUE; inputFrequency < firstInputNumber; inputFrequency++) {
            //加算する数の入力を促す。
            System.out.print("整数(0で終了)：");
            //入力された値を取得する。、
            int additionNumber = inKeyboard.nextInt();
            //0が入力された場合、
            if (additionNumber == BREAK_PROCESS) {
                //処理を抜ける。
                break;
            }
            //合計値用に入力された値を加算する。
            sumTotal += additionNumber;
        }
        //合計値を、加算する個数の値で割る。
        double averageValue = ((double) sumTotal / firstInputNumber);
        //合計値および平均値を表示する。
        System.out.println("合計は" + sumTotal + "です。\n平均は" + averageValue + "です。");
    }
}
