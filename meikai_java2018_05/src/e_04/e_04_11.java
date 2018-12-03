package e_04;

import java.util.Scanner;

/*
 * 演習4-11：正の整数値を0までカウントダウンするList4-4（p.100）をfor文で実現せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年11月26日
 */
public class e_04_11 {

    public static void main(String[] args) {
        //定数を設け正の整数値であるかの判定で使用する値を設定する。
        final int THRESHOLD_VALUE = 0;
        //定数を設けどの数までカウントダウンするかの値を設定する。
        final int LAST_STOP = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //カウントダウンする旨を表示する。
        System.out.println("カウントダウンします。");
        //カウントダウンする値を代入するための変数を設ける。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示させ、正の整数値の入力を促す。
            System.out.println("正の整数値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が正の整数値でない場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //countDownにまず入力値を代入する。countDownが0以上の間は、countDownの値をデクリメントし、
        for (int countDown = requestedValue; countDown >= LAST_STOP; countDown--) {
            //カウントダウンしていく値を表示する。
            System.out.println(countDown);
        }
    }
}