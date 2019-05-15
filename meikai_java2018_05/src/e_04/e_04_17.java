package e_04;

import java.util.Scanner;

/*
 * 演習4-17：読み込んだ整数値のすべての約数を表示するList4-13（p.118）を書きかえて、
 *           約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年5月■日
 */
public class e_04_17 {

    public static void main(String[] args) {

        //正の整数であるかの判定に使用する値。
        //final int POSITIVE_INTEGER  = 1;
        //カウントの数字
        final int DISPLAY_DIVISOR = 1;
        //最初の数字
        final int zzz = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputDivisor;
        //タイトルを表示し、値の入力を促す。
        System.out.print("整数値：");
        //入力値を受け取る。
        inputDivisor = inKeyboard.nextInt();


        //約数をカウントする為の変数を準備する。
        int countttttt = zzz;
        //約数の表示が入力値に到達するまで判定を繰り返し、以下の処理を行う。
        for (int www = DISPLAY_DIVISOR; www <= inputDivisor; www++) {
            // 割り切れたら約数を表示する。
            if (inputDivisor % www == zzz) {
                //約数を表示する。
                System.out.println(www);
                //割り切れた場合、約数となるため、カウントを+1する。
                countttttt++;
            }
        }
        //約数の個数を表示するメッセージを表示する。
        System.out.println("約数は" + countttttt + "個です。");
    }
}