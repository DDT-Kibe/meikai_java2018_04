package e_04;

import java.util.Scanner;

/*
 * 演習4-21：List4-16は左下が直角の直角三角形を表示するプログラムであった。
 *           直角が左上側、右下側、右上側の三角形を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年7月22日
 */

//直角三角形の直角が左上側にできあがるプログラム。
public class e_04_21_02 {

    public static void main(String[] args) {

        //直角三角形を表示する段数として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //直角三角形の段数・列数を計算する最初の値。
        final int START_VALUE = 0;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputSteps;
        //入力値について判定する条件式用の変数を用意する。
        boolean inputJudgement;

        //入力値が適切かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("直角三角形の直角を右上に表示します。\n段数：");
            //入力された値を取得する。
            inputSteps = inKeyboard.nextInt();
            //適切な入力値を判定する。
            inputJudgement = (inputSteps < THRESHOLD_VALUE);
            //入力値が2未満の場合
            if (inputJudgement) {
                //2以上の数を入力するようアナウンスする。
                System.out.println("\n2以上の整数値を入力して下さい。");
            } else {
                inputJudgement = false;
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputJudgement);

        //直角三角形の角が右側になるよう入力値分の段を作成する。
        for (int creatingSteps = inputSteps; creatingSteps > START_VALUE; creatingSteps--) {
            //直角三角形の角が右側になるよう入力値分の列を作成する。
            for (int creatingRows = START_VALUE; creatingRows < inputSteps - creatingSteps; creatingRows++) {
                //直角三角形の直角が右上になるように空白を表示する。
                System.out.print("  ");
            }
            //直角三角形の直角が右側になるよう一つの段に'＊'を表示する。
            for (int displayTriangle = creatingSteps; displayTriangle > START_VALUE; displayTriangle--) {
                //直角三角形を描くための'＊'を表示する。
                System.out.print('＊');
            }
            //一つの段で直角三角形を表示するための'＊'の数を満たしたので改行する。
            System.out.println();
        }
    }
}