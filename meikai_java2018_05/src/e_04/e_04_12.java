package e_04;

import java.util.Scanner;

/*
 * 演習4-12：前問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年12月3日
 */
public class e_04_12 {

    public static void main(String[] args) {
        //定数を設け正の整数値であるかの判定で使用する値を設定する。
        final int THRESHOLD_VALUE = 0;
        //定数を設けカウントアップするはじめの値を設定する。
        final int START_NUMBER = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //カウントアップする旨を表示する。
        System.out.println("カウントアップします。");
        //入力値を代入する変数を設ける。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示し、入力を促す。
            System.out.println("正の整数値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が正の整数値でない場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //countUpにまずカウントアップするはじめの値を代入する。countUpが入力値以下の間は、countUpの値をインクリメントし、
        for (int countUp = START_NUMBER; countUp <= requestedValue; countUp++) {
            //countUpの値を表示する。
            System.out.println(countUp);
        }
    }
}