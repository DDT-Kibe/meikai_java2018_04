package e_04;

import java.util.Scanner;

/*
 * 演習4-15：身長と標準体重の対応表を表示するプログラムを作成せよ。
 *           表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込むこと。
 *           ※標準体重は(身長-100)×0.9によって求められる。
 * 作成者：岐部 佳織
 * 作成日：2018年12月■日
 */
public class e_04_15 {

    public static void main(String[] args) {

        //身長から減算する値。
        final int ooo = 100;
        //標準体重を算出するために掛ける値。
        final double uuu = 0.9;
        //正の整数であるかを判定するた値（閾値）。
        final int iii = 1;

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
            //入力値が減算する値よりも小さいことを判定する。
            if (startValue < ooo | endValue < ooo) {
                //入力値が減算する値よりも小さい場合、ヒントとともに再度入力を促す。
                System.out.println("身長は" + ooo + "cm以上から入力してください。");
            }
            //入力値が減算する値よりも小さいかを判定する。
        } while (startValue < ooo | endValue < ooo);

        //「何cmごと」の入力値が適当であるかを判定する。
        do {
            //タイトルを表示し、値の入力を促す。
            System.out.print("何cmごと：");
            //入力された値を取得する。
            everySeveralCentimeters = inKeyboard.nextInt();
            //入力値が閾値よりも小さいことを判定する。
            if (everySeveralCentimeters < iii) {
                //入力値が閾値よりも小さい場合、ヒントとともに再度入力を促す。
                System.out.println("整数で" +iii + "cm以上から入力してください。");
            }
            //入力値が閾値よりも小さいかを判定する。
        } while (everySeveralCentimeters < iii);

        //はじめの入力値と次の入力値を昇順にする。
        if (startValue > endValue) {
            //～～～コメント考え中
            int ttt = startValue;
            //～～～コメント考え中
            startValue = endValue;
            //～～～コメント考え中
            endValue = ttt;
        }
        //～～～コメント考え中
        System.out.println();

        //入力値が初期値で設定した値以上の場合、
        System.out.println("身長  標準体重");
        //～～～コメント考え中
        for (int aaa = startValue; aaa <= endValue; aaa += everySeveralCentimeters) {
            //～～～コメント考え中
            System.out.println(aaa + "  " + (aaa - ooo) * uuu);
        }
    }
}