package e_04;

import java.util.Scanner;

/**
 * 演習4-26：合計だけでなく平均も求めるようにList4-19（p.129）のプログラムを書きかえよ。
 *           なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 * 作成者：岐部 佳織
 * 作成日：2019年10月2日
 */

public class e_04_26 {

    public static void main(String[] args) {

        //入力値が適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //計算で使用する変数を初期化する値。
        final int START_VALUE = 0;
        //負の数が入力されたかの判定で使用する値。
        final int JUDGEMENT_NEGATIVE_VALUE = 0;

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
            //質問を表示し加算する個数の入力を促す。
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
            //入力値が2未満の場合は再度質問を表示する。
        } while (inputJudgement);

        //合計値用の変数を用意し初期化する。
        int sumTotal = START_VALUE;
        //平均値用の変数を用意し初期化する。
        int averageValue = START_VALUE;
        //入力回数が、加算する個数の値に到達するまで以下の処理を行う。
        for (int inputTimes = START_VALUE; inputTimes < firstInputNumber; inputTimes++) {
            //加算する数の入力を促す。
            System.out.print("整数：");
            //入力された値を取得する。、
            int additionNumber = inKeyboard.nextInt();
            //負の数が入力されたかの判定を行う。
            if (additionNumber < JUDGEMENT_NEGATIVE_VALUE) {
                //入力値が負の数の場合は計算から外す旨を表示する。
                System.out.println(" 負の数は加算しません。\n また、平均を求める際の母数から除外します。");
                //後続の加算処理をせずに入力回数の判定へと処理を続ける。
                continue;
            }
            //合計値用に入力された値を加算する。
            sumTotal += additionNumber;
            //平均値を求める際の母数をインクリメントする。
            averageValue++;
        }
        //平均値を求める。
        double displayAverage = ((double) sumTotal / averageValue);
        //合計値および平均値を表示する。
        System.out.println("合計は" + sumTotal + "です。\n平均は" + displayAverage + "です。");
    }
}
