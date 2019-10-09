package e_05;

import java.util.Scanner;

/**
 * 演習5-1：10進数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年10月9日
 */

public class e_05_01 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //タイトルを表示し整数の入力を促す。
        System.out.print("整数：");
        //入力された値を取得する。
        int integerLiteral = inKeyboard.nextInt();

        //8進数を表示する。
        System.out.printf("8進数は%oです。\n", integerLiteral);
        //16進数を表示する。
        System.out.printf("16進数は%xです。\n", integerLiteral);

    }
}