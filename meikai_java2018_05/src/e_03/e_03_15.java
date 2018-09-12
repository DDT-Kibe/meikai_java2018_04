package e_03;

import java.util.Scanner;

/*
 * 演習3-15：二つの整数値を読み込んで降順（大きい順）にソートするプロフラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年9月12日
 */
public class e_03_15 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数ａの入力を促す。
        System.out.print("整数ａ：");
        //入力された整数値を取得する。
        int variableIntegerA = inKeyboard.nextInt();
        //タイトルを表示させ、整数ｂの入力を促す。
        System.out.print("整数ｂ：");
        //入力された整数値を取得する。
        int variableIntegerB = inKeyboard.nextInt();

        //整数ａが整数ｂよりも小さい値であることを判定する。
        if (variableIntegerA < variableIntegerB) {
            //整数ａが整数ｂよりも小さい値の場合、作業用の変数を設け整数ａの値を代入する。
            int temporaryVariable = variableIntegerA;
            //整数ａの変数に整数ｂの値を代入する。
            variableIntegerA = variableIntegerB;
            //整数ｂの変数に作業用として保存していた値を代入する。
            variableIntegerB = temporaryVariable;
        }
        //降順でソートした旨を表示する。
        System.out.println("\nａ≧ｂとなるようソートしました");
        //大きい方の値を表示する。
        System.out.println("変数ａ：" + variableIntegerA);
        //小さい方の値を表示する。
        System.out.println("変数ｂ：" + variableIntegerB);
    }
}
