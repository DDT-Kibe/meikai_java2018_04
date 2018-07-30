package e_03;

import java.util.Scanner;

/*
 * 演習3-6：正の整数値を読み込んで、それが10の倍数であれば『その値は10の倍数です』と表示し、
 *          そうでなければ『その値は10の倍数ではありません』と表示するプログラムを作成せよ。
 *          ※正でない値を読み込んだ場合は、『正でない値が入力されました』と表示すること。
 * 作成者：岐部 佳織
 * 作成日：2018年7月30日
 */
public class e_03_06 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数値の入力を促す。
        System.out.print("整数値:");
        //入力された値を取得する。
        int integerValue = inKeyboard.nextInt();

        //割る数を初期値で設定する。
        final int divisionNumber = 10;
        //割り切れるか否かの判断で使用する値を初期値で設定する。
        final int numberDivisible = 0;

        //正でない値を読み込んだ場合、
        if (integerValue <= 0) {
            //『正でない値が入力されました』を表示する。
            System.out.println("正でない値が入力されました");
        //入力された値が10の倍数である場合（10で割りれる＝10の倍数であると判断）、
        }else if (integerValue % divisionNumber == numberDivisible) {
            //『その値は10の倍数です』を表示する。
            System.out.println("その値は10の倍数です");
        //入力された値が10の倍数ではない場合（10で割り切れない＝10の倍数ではないと判断）、
        }else if (integerValue % divisionNumber !=numberDivisible ) {
            //『その値は10の倍数ではありません』を表示する。
            System.out.println("その値は10の倍数ではありません");
        }
    }
}
