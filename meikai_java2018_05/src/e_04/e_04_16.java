package e_04;

import java.util.Scanner;

/*
 * 演習4-16：読み込んだ個数だけ*を表示するList4-11(p.114)を書きかえて、
 *           5個表示するごとに改行するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年5月15日
 */
public class e_04_16 {

    public static void main(String[] args) {

        //一行に最大個数が表示されたかの判定に使用する値。
        final int MAXIMUM_NUMBER = 0;
        //正の整数であるかの判定に使用する値。
        final int POSITIVE_INTEGER = 1;
        //一行で*を表示する最大個数。
        final int MAX_ASTERISK = 5;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int displayAsterisk;

        //入力値が*を表示する数として適当であるかを判定する。
        do {
            //タイトルを表示し、値の入力を促す。
            System.out.print("何個*を表示しますか：");
            //入力された値を取得する。
            displayAsterisk = inKeyboard.nextInt();
            //入力値が1未満の場合、
            if (displayAsterisk < POSITIVE_INTEGER) {
                //タイトルを表示し、再度値の入力を促す。
                System.out.println("1以上の整数値を入力してください：");
            }
            //入力値が1未満の場合は再度タイトルを表示する。
        } while (displayAsterisk < POSITIVE_INTEGER);

        //表示する*の数が入力値に到達するまで判定を繰り返し、以下の処理を行う。
        for (int countAsterisk = POSITIVE_INTEGER; countAsterisk <= displayAsterisk; countAsterisk++) {
            //*を表示する。
            System.out.print('*');
            //表示した*が5個目であるかを判定する。
            if (countAsterisk % MAX_ASTERISK == MAXIMUM_NUMBER) {
                //5個目を表示したら改行する。
                System.out.println();
                //5個目以外のときは何もしない。
            }
        }
    }
}
