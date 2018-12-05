package e_04;

import java.util.Scanner;

/*
 * 演習4-13：1からnまでの和を求めるList4-10（p.112）をfor文で実現せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年12月5日
 */
public class e_04_13 {

    public static void main(String[] args) {

        //定数を設け加算処理をする際に最初に足される値を設定する。
        final int SPECIFIC_NUMBER = 0;
        //定数を設け和を求める範囲の始まりの値（閾値）を設定する。
        final int THRESHOLD_VALUE = 1;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //nまでの和を求める旨を表示する。
        System.out.println("1からnまでの和を求めます。");
        //入力値を代入する変数を設ける。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示し、入力を促す。
            System.out.print("nの値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が閾値よりも小さい場合は処理を繰り返す。
        } while (requestedValue < THRESHOLD_VALUE);
        //閾値から入力値までの和を表示する変数を設け、最初に足される値を代入する。
        int totalValue = SPECIFIC_NUMBER;
        //1から入力値に到達するまで繰り返し加算処理を行うために作業用の変数additionProcessingを設け、
        //additionProcessingが入力値以下の間は下記の処理を行う。
        for (int additionProcessing = THRESHOLD_VALUE; additionProcessing <= requestedValue; additionProcessing++) {
            //加算処理を行う。
            totalValue += additionProcessing;
        }
        //1から入力値までの和を表示する。
        System.out.println("1から" + requestedValue + "までの和は" + totalValue + "です。");
    }
}