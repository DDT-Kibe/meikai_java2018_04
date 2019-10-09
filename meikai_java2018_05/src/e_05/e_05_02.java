package e_05;

import java.util.Scanner;

/**
 * 演習5-2：float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年10月9日
 */

public class e_05_02 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //各変数についての説明を表示する。
        System.out.println("変数xはfloat型で、変数yはdouble型です。");
        //タイトルを表示しxの入力を促す。
        System.out.print("x：");
        //float型の変数に入力値を代入する。
        float x = inKeyboard.nextFloat();
        //タイトルを表示しyの入力を促す。
        System.out.print("y：");
        //double型の変数に入力値を代入する。
        double y = inKeyboard.nextDouble();

        //入力値をfloat型で表示する。
        System.out.println("x = " + x);
        //入力値をdouble型で表示する。
        System.out.println("y = " + y);
    }
}