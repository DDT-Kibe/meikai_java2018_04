package e_03;

import java.util.Scanner;

/*
 * 演習3-14：List3-13と同様に、二つの整数値を読み込んで、小さい方の値と大きい方の値の
 *           両方を表示するプログラムを作成せよ。
 *           ただし、二つの整数値が等しい場合は、『二つの値は同じです』と表示すること。
 * 作成者：岐部 佳織
 * 作成日：2018年9月■日
 */
public class e_03_14 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、変数ａの入力を促す。
        System.out.print("変数ａ：");
        //入力された整数値を取得する。
        int variableIntegerA = inKeyboard.nextInt();
        //タイトルを表示させ、変数ｂの入力を促す。
        System.out.print("変数ｂ：");
        //入力された整数値を取得する。
        int variableIntegerB = inKeyboard.nextInt();

        //※※以下、List3-13のプログラムを写しただけ。※※
        //
        if (variableIntegerA > variableIntegerB) {
            //
            int tt = variableIntegerA;
            //
            variableIntegerA = variableIntegerB;
            //
            variableIntegerB = tt;
        }
        //
        System.out.println("a≦bになるようにソートしました");
        //
        System.out.println("変数aは" + variableIntegerA + "です");
        //
        System.out.println("変数bは" + variableIntegerB + "です");
    }
}
