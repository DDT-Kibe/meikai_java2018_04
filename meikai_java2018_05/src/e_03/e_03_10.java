package e_03;

import java.util.Scanner;
/*
 * 演習3-10：二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年8月■日
 */
public class e_03_10 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数値Ａの入力を促す。
        System.out.print("値Ａ：");
        //入力された整数値を取得する。
        int formerInteger = inKeyboard.nextInt();

        //タイトルを表示させ、整数値Ｂの入力を促す。
        System.out.print("値Ｂ：");
        //入力された整数値を取得する。
        int latterInteger = inKeyboard.nextInt();

        //整数値Ａの方が大きい場合の差を計算する。
        int ddd = formerInteger - latterInteger;
        //整数値Ｂの方が大きい場合の差を計算する。
        int eee = latterInteger - formerInteger;
        //整数値Ａと整数値Ｂを比較し、差を計算する。、
        int fff = (formerInteger > latterInteger ? (ddd) : (eee));

        //整数値Ａと整数値Ｂの差を示す。
        System.out.println("値Ａと値Ｂの差は " + fff + " です");
    }
}