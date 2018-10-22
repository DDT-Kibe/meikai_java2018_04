package e_04;

import java.util.Random;
import java.util.Scanner;

/*
 * 演習4-2：2桁の整数値（10～99）を当てさせる数当てゲームを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年10月10日
 */
public class e_04_02 {

    public static void main(String[] args) {

        //乱数を生成する用意をする。
        Random randomNumber = new Random();
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //指定された範囲内の乱数を生成するため、元となる範囲を設定する。
        final int ORIGINAL_RANGE = 90;
        //元となる範囲にプラスする値を設定する。
        final int SHIFTED_RANGE = 10;
        //問題となる値を生成する。
        int questionNumber = randomNumber.nextInt(ORIGINAL_RANGE) + SHIFTED_RANGE;

        //問題を表示する。
        System.out.print("数当てゲーム！\n0～99の数を当ててください。");
        //入力された値を代入するための変数を設ける。
        int answeredNumber;

        //do文を記述していく。
        do {
            //タイトルを表示させ、回答を促す。
            System.out.print("\nいくつでしょう？");
            //入力された値を取得する。
            answeredNumber = inKeyboard.nextInt();
            //入力値が問題となる値より大きい場合、
            if (answeredNumber > questionNumber) {
                //問題となる値は入力値よりも小さい旨のヒントを表示する。
                System.out.print("もっと小さいよ");
                //入力値が問題となる値より小さい場合、
            } else if (answeredNumber < questionNumber) {
                //問題となる値は入力値よりも大きい旨のヒントを表示する。
                System.out.print("もっと大きいよ");
            }
            //入力値が問題となる値と異なる場合は繰り返し処理を行う。
        } while (answeredNumber != questionNumber);

        //正解の場合はその旨を表示する。
        System.out.print("正解！");
    }
}
