package e_03;

import java.util.Scanner;

/*
 * 演習3-5：正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます』と表示し。
 *          そうでなければ『その値は5で割り切れません』と表示するプログラムを作成せよ。
 *          ※正でない値を読み込んだ場合は、『正でない値が入力されました』と表示する。
 * 作成者：岐部 佳織
 * 作成日：2018年7月25日
 */
public class e_03_05 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数値の入力を促す。
        System.out.print("整数値:");
        //入力された値を取得する。
        int integerValue = inKeyboard.nextInt();

        //割る数を初期値で設定する。
        final int divisionNumber = 5;
        //割り切れるか否かの判断で使用する値を初期値で設定する。
        final int numberDivisible = 0;

        //正でない値を読み込んだ場合、
        if (integerValue <= 0) {
            //『正でない値が入力されました』を表示する。
            System.out.println("正でない値が入力されました");
        //整数値が5で割り切れる場合、
        } else if (integerValue % divisionNumber == numberDivisible) {
            //『その値は5で割り切れます』を表示する。
            System.out.println("その値は5で割り切れます");
        //整数値が5で割り切れない場合、
        } else if (integerValue % divisionNumber != numberDivisible) {
            //『その値は5で割り切れません』を表示する。
            System.out.println("その値は5で割り切れません");
        }
    }
}
