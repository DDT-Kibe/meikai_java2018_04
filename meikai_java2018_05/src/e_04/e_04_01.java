package e_04;

import java.util.Scanner;

/*
 * 演習4-1：読み込んだ整数値の符号を判定するList3-5のプログラム(p.58)を、
 *          好きなだけ何度でも繰り返して入力・表示できるようにしたプログラムを作成せよ。。
 * 作成者：岐部 佳織
 * 作成日：2018年10月1日
 */
public class e_04_01 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //符号を判定する値を0で設定する。
        final int THRESHOLD_VALUE = 0;
        //繰り返しを判定する値を設定する。
        final int REPEAT_VALUE = 1;
        //繰り返し行うか質問する際に使用する変数を設ける。
        int onceAgain;

        //do文を記述していく。
        do {
            //タイトルを表示させ、整数値の入力を促す。
            System.out.print("整数値：");
            //入力された整数値を取得する。
            int integerValue = inKeyboard.nextInt();
            //入力された値が0よりも大きい場合、
            if (integerValue > THRESHOLD_VALUE) {
                //その値が正である旨を表示する。
                System.out.print("その値は正です。");
                //入力された値が0よりも小さい場合、
            } else if (integerValue < THRESHOLD_VALUE) {
                //その値が負である旨を表示する。
                System.out.print("その値は負です。");
                //入力された値が0である場合、
            } else if (integerValue == THRESHOLD_VALUE) {
                //その値が0である旨を表示する。
                System.out.println("その値は0です。");
            }
            //符号の判定を再度行うか、YESかNOで答えさせる質問文を表示する。
            System.out.println("\nもう一度実行しますか？(YES…1／NO…0) :");
            //入力された整数値を取得する。
            onceAgain = inKeyboard.nextInt();
            //YESの場合は繰り返し処理を行う。
        } while (onceAgain == REPEAT_VALUE);
    }
}