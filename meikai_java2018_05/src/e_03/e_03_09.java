package e_03;

import java.util.Scanner;
/*
 * 演習3-9：二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年8月20日
 */
public class e_03_09 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、はじめの実数値の入力を促す。
        System.out.print("値その１：");
        //入力された実数値を取得する。
        double formerInteger = inKeyboard.nextDouble();

        //タイトルを表示させ、つぎの実数値の入力を促す。
        System.out.print("値その２：");
        //入力された実数値を取得する。
        double latterInteger = inKeyboard.nextDouble();

        //二つの実数値を比べた結果、どちらの実数値の方が大きいかを示す。
        System.out.println((formerInteger > latterInteger ? formerInteger : latterInteger) + "の方が大きい");
    }
}
