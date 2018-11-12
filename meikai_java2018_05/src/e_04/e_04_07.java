package e_04;

import java.util.Scanner;

/*
 * 演習4-7：読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 *          表示は*と+を交互に行うこと。
 * 作成者：岐部 佳織
 * 作成日：2018年11月12日
 */
public class e_04_07 {

    public static void main(String[] args) {
        //符号の判定で使用する閾値、及び値が2で割り切れるか否かの判定で使用する値を設定する。
        final int THRESHOLD_VALUE = 0;
        //繰り返しを行う判定で使用する変数に、最初に代入する値を設定する。
        final int BEGINNING_NUMBER = 1;
        //偶数か奇数かの判定で使用する値を設定する。
        final int EVEN_ODD = 2;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力された値を代入するための変数を設ける。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示させ、入力を促す。
            System.out.print("何個表示しますか：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が0以下の場合、
            if (requestedValue <= THRESHOLD_VALUE) {
                //再度入力を促すタイトルを表示する。
                System.out.println("記号文字を表示できません。\n1以上の値を入力してください。");
            }
            //入力値が0以下の場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //入力値の数だけ記号文字を表示するため、繰り返しの判定で使用する変数を設け1を代入する。
        int repeatValue = BEGINNING_NUMBER;
        //repeatValueに代入している値が入力値以下の場合、
        while (repeatValue <= requestedValue) {
            //repeatValueに代入している値が偶数なら「+」、奇数なら「*」を表示する。
            System.out.print(repeatValue % EVEN_ODD == THRESHOLD_VALUE ? '+' : '*');
            //変数repeatValueに代入している値をインクリメントする。
            repeatValue++;
        }
    }
}