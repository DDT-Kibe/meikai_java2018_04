package e_04;

import java.util.Scanner;
/*
 * 演習4-6-1：読み込んだ値が1未満であれば改行文字を出力しないように
 *            List4-7を書きかえたプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年11月5日
 */
public class e_04_06_1 {

    public static void main(String[] args) {

        //符号を判定する際に使用する値を初期値で設定する。
        final int THRESHOLD_VALUE = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //タイトルを表示させ、入力を促す。
        System.out.print("何個*を表示しますか：");
        //入力された値を取得する。
        int requestedValue = inKeyboard.nextInt();
        //繰り返し行う判定で使用する変数を設け、初期値を代入する。
        int repeatValue = THRESHOLD_VALUE;
        //変数repeatValueに代入している値よりも入力値の方が大きい場合、
        while (repeatValue < requestedValue) {
            //''の文字を表示する。
            System.out.print('*');
            //変数repeatValueに代入している値をインクリメントする。
            repeatValue++;
        }
        //入力値が初期値よりも大きい場合
        if (requestedValue > THRESHOLD_VALUE ){
        //改行文字を出力する。
        System.out.println("\n");
        }
    }
}
