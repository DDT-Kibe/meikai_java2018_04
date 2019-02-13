package e_04;

import java.util.Scanner;

/*
 * 演習4-16：読み込んだ個数だけ*を表示するList4-11(p.114)を書きかえて、
 *           5個表示するごとに改行するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年2月■日
 */
public class e_04_16 {

    public static void main(String[] args) {

        //一行での最大個数を表示しているか判定する値。
        final int ZZ = 0;
        //正の整数であるかを判定する値（閾値）。
        final int THRESHOLD_VALUE = 1;
        //*を表示する一行での最大個数。
        final int gg = 5;
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
            //入力値が閾値以下の場合、
            if (displayAsterisk < THRESHOLD_VALUE) {
                //タイトルを表示し、再度値の入力を促す。
                System.out.println("1以上の整数値を入力してください：");
            }
            //入力値が閾値以下であるかを判定する。
        } while (displayAsterisk < THRESHOLD_VALUE);

        //表示する*の数が入力値に到達するまで判定を繰り返し、以下の処理を行う。
        for (int ooo = THRESHOLD_VALUE; ooo <= displayAsterisk; ooo++) {
            //*を表示する。
            System.out.print('*');
            //一行で表示している*が5個であるかを判定する。
            if (ooo % gg == ZZ) {
                //5個表示したので改行する。
                System.out.println();
                //5個未満のときは何もしない。
            } else {
            }
        }
    }
}
