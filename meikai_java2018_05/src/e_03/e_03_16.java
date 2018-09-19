package e_03;

import java.util.Scanner;

/*
 * 演習3-16：三つの整数値を読み込んで昇順（小さい順）にソートするプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年9月12日
 */
public class e_03_16 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数ａの入力を促す。
        System.out.print("整数ａ：");
        //変数ａを設け、入力された整数値を取得する。
        int IntegerValueA = inKeyboard.nextInt();
        //タイトルを表示させ、整数ｂの入力を促す。
        System.out.print("整数ｂ：");
        //変数ｂを設け、入力された整数値を取得する。
        int IntegerValueB = inKeyboard.nextInt();
        //タイトルを表示させ、整数ｃの入力を促す。
        System.out.print("整数ｃ：");
        //変数ｃを設け、入力された整数値を取得する。
        int IntegerValueC = inKeyboard.nextInt();

        //作業用の変数を設ける。
        int temporaryVariable;

        //最初に変数ａ・ｂの値を比較し、変数ａの値の方が大きいことを判定する。
        if (IntegerValueA > IntegerValueB) {
            //変数ａが変数ｂの値よりも大きい場合、作業用の変数に変数ａの値を代入する。
            temporaryVariable = IntegerValueA;
            //変数ａに変数ｂの値を代入する。
            IntegerValueA = IntegerValueB;
            //変数ｂに作業用として保存していた値を代入する。
            IntegerValueB = temporaryVariable;
        }
        //次に変数ｂ・ｃの値を比較し、変数ｂの値の方が大きいことを判定する。
        if (IntegerValueB > IntegerValueC) {
            //変数ｂが変数ｃの値よりも大きい場合、作業用の変数に変数ｂの値を代入する。
            temporaryVariable = IntegerValueB;
            //変数ｂに変数ｃの値を代入する。
            IntegerValueB = IntegerValueC;
            //変数ｃに作業用として保存していた値を代入する。
            IntegerValueC = temporaryVariable;
        }
        //最後に変数ａ・ｂの値を再び比較し、変数ａの値の方が大きいことを判定する。
        if (IntegerValueA > IntegerValueB) {
            //変数ａが変数ｂの値よりも大きい場合、作業用の変数に変数ａの値を代入する。
            temporaryVariable = IntegerValueA;
            //変数ａに変数ｂの値を代入する。
            IntegerValueA = IntegerValueB;
            //変数ｂに作業用として保存していた値を代入する。
            IntegerValueB = temporaryVariable;
        }
        //昇順でソートした旨を表示する。
        System.out.println("\nａ≦ｂとなるようソートしました");
        //変数ａ、変数ｂ、変数ｃの順に表示する。
        System.out.println(IntegerValueA + "\n" + IntegerValueB + "\n" + IntegerValueC);
    }
}
