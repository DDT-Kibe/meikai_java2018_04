package e_05;

import java.util.Random;
import java.util.Scanner;

/**
 * 演習5-3：論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年10月9日
 */

/** 入力値が生成された乱数よりも小さい場合にtrueを表示します。 */
public class e_05_03 {

    public static void main(String[] args) {

        //乱数を生成するための範囲を設定する。
        final int ORIGINAL_RANGE = 5;
        //乱数を生成する用意をする。
        Random randomNumber = new Random();
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //乱数を生成する。
        int questionNumber = randomNumber.nextInt(ORIGINAL_RANGE);
        //プログラムの説明を表示する。
        System.out.println("入力値が生成された乱数よりも小さい場合にtrueを表示します。");
        //タイトルを表示し入力を促す。
        System.out.print("整数：");
        //入力値を取得する。
        int inputNumber = inKeyboard.nextInt();

        //入力値の判定を行いtrueかfalseを代入する。
        boolean isTruthJudgment = (inputNumber < questionNumber);
        //論理型変数に代入されている値を表示する。
        System.out.print("判定：" + isTruthJudgment);
    }
}