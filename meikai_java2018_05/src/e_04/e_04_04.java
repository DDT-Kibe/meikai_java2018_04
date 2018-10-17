package e_04;

import java.util.Scanner;

/*
 * 演習4-4：List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年10月17日
 */
public class e_04_04 {

    public static void main(String[] args) {
        //どの数字までカウントダウンするかを初期値で設定する。
        final int SPECIFIC_NUMBER = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //カウントダウンする旨を表示する。
        System.out.println("カウントダウンします");
        //カウントダウンしていく値を代入するための変数を設ける。
        int countDown;
        //do文を記述していく。
        do {
            //タイトルを表示させ、整数値の入力を促す。
            System.out.println("正の整数値：");
            //入力された値を取得する。
            countDown = inKeyboard.nextInt();
            //入力値が正の整数でない場合は処理を繰り返す。
        } while (countDown <= SPECIFIC_NUMBER);
        //入力値が初期値で設定した数字以上の場合、
        while (countDown >= SPECIFIC_NUMBER) {
            //カウントダウンしていく値を表示する。
            System.out.println(countDown);
            //入力値をデクリメントする。
            countDown--;
        }
        //変数countDownが-1になることを表示する。
        System.out.println("現在のcountDownは" + countDown + "です");
    }
}
