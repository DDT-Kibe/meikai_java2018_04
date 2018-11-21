package e_04;

import java.util.Scanner;

/*
 * 演習4-10：読み込んだ値が1未満であれば改行文字を出力しないように
 *           List4-11（p.114）を書きかえたプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年11月21日
 */
public class e_04_10 {

    public static void main(String[] args) {
        //変数を設け繰り返し処理で表示回数を数えるため最初に代入する値、兼1未満かの判定で使用する値を設定する。
        final int THRESHOLD_VALUE = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //タイトルを表示させ、入力を促す。
        System.out.print("何個*を表示しますか：");
        //入力された値を取得する。
        int requestedValue = inKeyboard.nextInt();
        //repeatValueにまず0を代入する。repeatValueより入力値の方が大きい間は、repeatValueの値をインクリメントし、
        for (int repeatValue = THRESHOLD_VALUE; repeatValue < requestedValue; repeatValue++)
            //「*」を表示する。
            System.out.print('*');
        //入力値が閾値よりも大きい場合、
        if (requestedValue > THRESHOLD_VALUE)
            //改行文字を表示する。
            System.out.println('\n');
    }
}