package e_04;

import java.util.Scanner;

/*
 * 演習4-17：読み込んだ整数値のすべての約数を表示するList4-13（p.118）を書きかえて
 *           約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年6月10日
 */
public class e_04_17 {

    public static void main(String[] args) {

        //正の整数であるかの判定で使用する値。
        final int THRESHOLD_VALUE = 1;
        //割り切れる数かの判定で使用する値。
        final int DIVISIBLE_VALUATION = 0;
        //計算する最初の値。
        final int START_VALUE = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputDivisor;
        //入力値が正の整数であるかを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("整数値：");
            //入力された値を取得する。
            inputDivisor = inKeyboard.nextInt();
            //入力値が1未満の場合
            if (inputDivisor < THRESHOLD_VALUE) {
                //正の整数を入力するようアナウンスする。
                System.out.println("1以上の整数値を入力して下さい。");
            }
            //入力値が1未満の場合は再度タイトルを表示する。
        } while (inputDivisor < THRESHOLD_VALUE);

        //入力値の約数の計算を始める準備をする。
        int countDivisor = DIVISIBLE_VALUATION;
        //約数を求め、約数が入力値に到達するまで判定を繰り返し以下の処理を行う。
        for (int computationValue = START_VALUE; computationValue <= inputDivisor; computationValue++) {
            //約数であるかを確認する。
            if (inputDivisor % computationValue == DIVISIBLE_VALUATION) {
                //約数の場合は表示する。
                System.out.println(computationValue);
                //入力値に到達するまでは計算する数に+1する。
                countDivisor++;
            }
        }
        //約数が全部で何個かを表示する。
        System.out.println("約数は" + countDivisor + "個です。");
    }
}