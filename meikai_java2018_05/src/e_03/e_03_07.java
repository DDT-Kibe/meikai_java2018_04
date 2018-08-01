package e_03;

import java.util.Scanner;
/*
 * 演習3-7：正の整数値を読み込んで、それを3で割った値に応じて
 *          『その値は3で割り切れます』『その値を3で割った余りは1です』『その値を3で割った余りは2です』
 *          のいずれかを表示するプログラムを作成せよ。
 *          ※正でない値を読み込んだ場合は、『正でない値が入力されました』と表示すること。
 * 作成者：岐部 佳織
 * 作成日：2018年8月1日
 */
public class e_03_07 {

    public static void main(String[] args) {

        //割る数を初期値で設定する。
        final int DIVISION_NUMBER = 3;
        //割り切れるか否かの判断で使用する値を初期値で設定する。
        final int NUMBER_DIVISIBLE = 0;
        //「余りは1」の判断で使用する値を初期値で設定する。
        final int SURPLUS_JUDGMENT_ONE = 1;
        //「余りは2」の判断で使用する値を初期値で設定する。
        final int SURPLUS_JUDGMENT_TWO = 2;
        
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数値の入力を促す。
        System.out.print("整数値:");
        //入力された値を取得する。
        int integerValue = inKeyboard.nextInt();

        //正でない値を読み込んだ場合、
        if (integerValue <= 0) {
            //『正でない値が入力されました』を表示する。
            System.out.println("正でない値が入力されました");
        //入力された値が3で割り切れる場合、
        }else if (integerValue % DIVISION_NUMBER == NUMBER_DIVISIBLE) {
            //『その値は3で割り切れます』を表示する。
            System.out.println("その値は3で割り切れます");
        //入力された値を3で割り余りが1の場合、
        }else if (integerValue % DIVISION_NUMBER == SURPLUS_JUDGMENT_ONE) {
            //『その値を3で割った余りは1です』を表示する。
            System.out.println("その値を3で割った余りは1です");
        //入力された値を3で割り余りが2の場合、
        }else if (integerValue % DIVISION_NUMBER == SURPLUS_JUDGMENT_TWO) {
            //『その値を3で割った余りは2です』を表示する。
            System.out.println("その値を3で割った余りは2です");
        }
    }
}