package e_03;

import java.util.Scanner;
/*
 * 演習3-8：キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するプログラムを作成せよ。
 *          判定は以下のように行うこと。
 *            0～59 → 不可 ／ 60～69 → 可 ／ 70～79 → 良 ／ 80～100 → 優
 * 作成者：岐部 佳織
 * 作成日：2018年8月■日
 */
public class e_03_08 {

    public static void main(String[] args) {

        //「不可」の範囲指定で使用する、はじまりの値を初期値で設定する。
        final int WORST_MARK = 0;
        //「不可」の範囲指定で使用する、おわりの値を初期値で設定する。
        final int USELESS_MARK = 59;

        /*変数名考え中
        //「可」の範囲指定で使用する、はじまりの値を初期値で設定する。
        final int ccc_MARK = 60;
        //「可」の範囲指定で使用する、おわりの値を初期値で設定する。
        final int ddd_MARK = 69;
        //「良」の範囲指定で使用する、はじまりの値を初期値で設定する。
        final int eee_MARK = 70;
        //「良」の範囲指定で使用する、おわりの値を初期値で設定する。
        final int fff_MARK = 79;
        //「優」の範囲指定で使用する、はじまりの値を初期値で設定する。
        final int ggg_MARK = 80;
        //「優」の範囲指定で使用する、おわりの値を初期値で設定する。
        final int hhh_MARK = 100;
        */

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、点数の入力を促す。
        System.out.print("点数:");
        //入力された値を取得する。
        int integerValue = inKeyboard.nextInt();

        //、
        if (integerValue >= WORST_MARK && integerValue <= USELESS_MARK) {
            //
            System.out.println("不可");

        /*以下、作成中
        //、
        }else if (integerValue >= ccc_MARK && integerValue <= ddd_MARK) {
            //
            System.out.println("可");
            */


        }
    }
}
