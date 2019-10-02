package e_04;

import java.util.Random;
import java.util.Scanner;

/**
 * 演習4-27：List4-3（p.98）の数当てゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。
 *           制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 * 作成者：岐部 佳織
 * 作成日：2019年10月2日
 */

public class e_04_27 {

    public static void main(String[] args) {

        //回答できる制限回数を設定する。
        final int LIMIT_TIMES = 3;
        //指定された範囲内の乱数を生成するため、元となる範囲を設定する。
        final int ORIGINAL_RANGE = 100;
        //変数を初期化する値。
        final int START_VALUE = 0;
        //乱数を生成する用意をする。
        Random randomNumber = new Random();
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //問題となる値を生成する。
        int questionNumber = randomNumber.nextInt(ORIGINAL_RANGE);
        //問題を表示する。
        System.out.println("数当てゲーム開始！！\n0～99の数を当ててください。");
        //回答できる制限回数について表示する。
        System.out.println(LIMIT_TIMES + "回以内で当てましょう。");
        //入力された値を代入するための変数を設ける。
        int inputNumber;
        //回数を判定するための変数を用意する。
        int inputTimes = START_VALUE;

        //ラベル設定する。
        Game:
        //無限ループでゲームを行う。
        while (true) {
            //入力回数が制限回数と等しくなった場合
            if (inputTimes == LIMIT_TIMES) {
                //正解を表示する。
                System.out.println("正解は" + questionNumber + "でした。\nゲームを終了します。");
                //Gameラベルを抜け処理を終了する。
                break Game;
            }
            //回答するよう促す。
            System.out.print("いくつかな：");
            //入力された値を取得する。
            inputNumber = inKeyboard.nextInt();
            //入力回数をインクリメントして数える。
            inputTimes++;
            //入力値が問題となる値より大きい場合、
            if (inputNumber > questionNumber) {
                //問題となる値は入力値よりも小さい旨のヒントを表示する。
                System.out.println("もっと小さな数だよ。");
                //入力値が問題となる値より小さい場合、
            } else if (inputNumber < questionNumber) {
                //問題となる値は入力値よりも大きい旨のヒントを表示する。
                System.out.println("もっと大きな数だよ。");
                //入力値が問題となる値と等しい場合、
            } else {
                //正解である旨を表示する。
                System.out.print("正解です。");
                //Gameラベルを抜け処理を終了する。
                break Game;
            }
        }
    }
}
