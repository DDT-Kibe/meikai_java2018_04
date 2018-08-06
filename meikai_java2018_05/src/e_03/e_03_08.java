package e_03;

import java.util.Scanner;
/*
 * 演習3-8：キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するプログラムを作成せよ。
 *          判定は以下のように行うこと。
 *            0～59 → 不可 ／ 60～69 → 可 ／ 70～79 → 良 ／ 80～100 → 優
 * 作成者：岐部 佳織
 * 作成日：2018年8月6日
 */
public class e_03_08 {

    public static void main(String[] args) {

        //「不可」の範囲指定で使用する、はじまりの点数を初期値で設定する。
        final int START_WORST_MARK = 0;
        //「不可」の範囲指定で使用する、おわりの点数を初期値で設定する。
        final int END_WORST_MARK = 59;
        //「可」の範囲指定で使用する、はじまりの点数を初期値で設定する。
        final int START_USELESS_MARK = 60;
        //「可」の範囲指定で使用する、おわりの点数を初期値で設定する。
        final int END_USELESS_MARK = 69;
        //「良」の範囲指定で使用する、はじまりの点数を初期値で設定する。
        final int START_GOOD_MARK = 70;
        //「良」の範囲指定で使用する、おわりの点数を初期値で設定する。
        final int END_GOOD_MARK = 79;
        //「優」の範囲指定で使用する、はじまりの点数を初期値で設定する。
        final int START_GREAT_MARK = 80;
        //「優」の範囲指定で使用する、おわりの点数を初期値で設定する。
        final int END_GREAT_MARK = 100;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、点数の入力を促す。
        System.out.print("点数:");
        //入力された点数を取得する。
        int inputMark = inKeyboard.nextInt();

        //点数が不可の範囲内である場合、
        if (inputMark >= START_WORST_MARK && inputMark <= END_WORST_MARK) {
            //不可である旨を表示する。
            System.out.println("不可");
        //点数が可の範囲内である場合、
        }else if (inputMark >= START_USELESS_MARK && inputMark <= END_USELESS_MARK) {
            //可である旨を表示する。
            System.out.println("可");
        //点数が良の範囲内である場合、
        }else if (inputMark >= START_GOOD_MARK && inputMark <= END_GOOD_MARK) {
            //良である旨を表示する。
            System.out.println("良");
        //点数が優の範囲内である場合、
        }else if (inputMark >= START_GREAT_MARK && inputMark <= END_GREAT_MARK) {
            //優である旨を表示する。
            System.out.println("優");
        }
    }
}
