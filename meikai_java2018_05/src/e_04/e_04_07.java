package e_04;

import java.util.Scanner;

/*
 * 演習4-7：読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 *          表示は*と+を交互に行うこと。
 * 作成者：岐部 佳織
 * 作成日：2018年11月■日
 */
public class e_04_07 {

    public static void main(String[] args) {

        //符号を判定する際に使用する値を初期値で設定する。
        final int THRESHOLD_VALUE = 0;
        //繰り返し判定～～～コメント考え中
        final int ooo = 1;
        //偶数奇数～～～コメント考え中
        final int ppp = 2;
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
            //入力値がTHRESHOLD_VALUEに代入している値以下の場合、
            if (requestedValue <= THRESHOLD_VALUE) {
                //再度入力させる旨のタイトルを表示する。
                System.out.println("表示できません。1以上の値を入力してください。\n");
            }
            //入力値がTHRESHOLD_VALUEに代入している値以下の場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //繰り返しを行う判定で使用する変数に～～～コメント考え中
        int repeatValue = ooo;
        //repeatValueに代入している値がrequestedValueの値以下の場合、
        while (repeatValue <= requestedValue) {
            //偶数の場合は「+」を表示し、奇数の場合は「*」を表示する。
            System.out.print(repeatValue % ppp == THRESHOLD_VALUE ? '+' : '*');
            //変数repeatValueに代入している値をインクリメントする。
            repeatValue++;
        }
    }
}