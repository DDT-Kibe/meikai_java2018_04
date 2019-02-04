package e_04;

import java.util.Scanner;

/*
 * 演習4-15：身長と標準体重の対応表を表示するプログラムを作成せよ。
 *           表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込むこと。
 *           ※標準体重は(身長-100)×0.9によって求められる。
 * 作成者：岐部 佳織
 * 作成日：2019年2月4日
 */
public class e_04_15 {

    public static void main(String[] args) {

        //身長から減算する値。
        final int SUBTRACTING_VALUE = 100;
        //標準体重を算出するために掛ける値。
        final double NORMAL_WEIGHT = 0.9;
        //正の整数であるかを判定するた値（閾値）。
        final int THRESHOLD_VALUE = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //範囲の始まりの値を受け取る用意をする。
        int startValue;
        //範囲の終わりの値を受け取る用意をする。
        int endValue;
        //何cm毎に表示するかの値を受け取る用意をする。
        int everySeveralCentimeters;

        //身長について入力値が適当であるかを判定する。
        do {
            //タイトルを表示し、値の入力を促す。
            System.out.print("何cmから：");
            //入力された値を取得する。
            startValue = inKeyboard.nextInt();
            //タイトルを表示し、値の入力を促す。
            System.out.print("何cmまで：");
            //入力された値を取得する。
            endValue = inKeyboard.nextInt();
            //入力値が身長から減算する値よりも小さいことを判定する。
            if (startValue < SUBTRACTING_VALUE | endValue < SUBTRACTING_VALUE) {
                //入力値が身長から減算する値よりも小さい場合、ヒントとともに再度入力を促す。
                System.out.println("身長は" + SUBTRACTING_VALUE + "cm以上から入力してください。");
            }
            //入力値が身長から減算する値よりも小さいかを判定する。
        } while (startValue < SUBTRACTING_VALUE | endValue < SUBTRACTING_VALUE);

        //「何cmごと」の入力値が適当であるかを判定する。
        do {
            //タイトルを表示し、値の入力を促す。
            System.out.print("何cmごと：");
            //入力された値を取得する。
            everySeveralCentimeters = inKeyboard.nextInt();
            //入力値が閾値よりも小さいことを判定する。
            if (everySeveralCentimeters < THRESHOLD_VALUE) {
                //入力値が閾値よりも小さい場合、ヒントとともに再度入力を促す。
                System.out.println(THRESHOLD_VALUE + "cm以上から入力してください。");
            }
            //入力値が閾値よりも小さいかを判定する。
        } while (everySeveralCentimeters < THRESHOLD_VALUE);

        //始まりの値と終わりの値が昇順に表示できるようにする。
        if (startValue > endValue) {
            //昇順にするために作業用の変数を設け大きい方の値を一時退避させる。
            int temporaryEvacuation = startValue;
            //範囲の始まりを示す変数に、小さい方の値を代入する。
            startValue = endValue;
            //範囲の終わりを示す変数に、一時退避していた大きい方の値を代入する。
            endValue = temporaryEvacuation;
        }

        //対応表の見出しを表示する。
        System.out.println("身長 標準体重");
        //範囲の始まりを示す変数の値が終わりの値に到達するまで判定を繰り返し、以下の処理を行う
        for (int bodyHeight = startValue; bodyHeight <= endValue; bodyHeight += everySeveralCentimeters) {
            //演習で指定された公式で計算し、身長と標準体重の対応表を表示する。
            System.out.println(bodyHeight + "  " + (bodyHeight - SUBTRACTING_VALUE) * NORMAL_WEIGHT);
        }
    }
}