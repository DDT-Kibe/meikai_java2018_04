package e_04;

import java.util.Scanner;

/*
 * 演習4-13：1からnまでの和を求めるList4-10（p.112）をfor文で実現せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年12月5日
 */
public class e_04_13 {

    public static void main(String[] args) {

        //加算処理を開始する前に初期化する値。
        final int SPECIFIC_NUMBER = 0;
        //和を求める範囲の始まりの値（閾値）。
        final int THRESHOLD_VALUE = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //nまでの和を求める旨を表示する。
        System.out.println("1からnまでの和を求めます。");

        //入力値を受け取る用意をする。
        int requestedValue;
        //入力値が適当であるかを判定する。
        do {
            //タイトルを表示し、入力を促す。
            System.out.print("nの値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が閾値よりも小さいかを判定する。
        } while (requestedValue < THRESHOLD_VALUE);

        //加算処理を開始する前に足される値を初期化する。
        int totalValue = SPECIFIC_NUMBER;
        //足される値が入力値以上になるまで判定を繰り返し以下の処理を行う。
        for (int additionProcessing = THRESHOLD_VALUE; additionProcessing <= requestedValue; additionProcessing++) {
            //加算処理を行う。
            totalValue += additionProcessing;
        }
        //加算処理した結果を表示する。
        System.out.println("1から" + requestedValue + "までの和は" + totalValue + "です。");
    }
}