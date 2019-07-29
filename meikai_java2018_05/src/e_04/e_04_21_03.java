package e_04;

import java.util.Scanner;

/*
 * 演習4-21：List4-16は左下が直角の直角三角形を表示するプログラムであった。
 *           直角が左上側、右下側、右上側の三角形を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年7月24日
 */

//直角三角形の直角が右下側にできあがるプログラム。
public class e_04_21_03 {

    public static void main(String[] args) {

        //直角三角形を表示する段数として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //直角三角形の部品（' 'と'*'）を表示する計算で使用する値。
        final int START_VALUE = 0;
        //直角三角形の部品（' '）を表示する計算で使用する値。
        final int CALCULATING_ONE = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputSteps;
        //入力値として適切かを判定する条件式を代入する変数を用意する。
        boolean inputJudgement;

        //入力値が適切かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("直角三角形の直角を右下に表示します。\n段数：");
            //入力された値を取得する。
            inputSteps = inKeyboard.nextInt();
            //入力値として適切かを判定する。
            inputJudgement = (inputSteps < THRESHOLD_VALUE);
            //入力値が2未満の場合
            if (inputJudgement) {
                //2以上の数を入力するようアナウンスする。
                System.out.println("\n2以上の整数値を入力して下さい。");
                //入力値が2以上の場合
            } else {
                //直角三角形を表示する次の処理に移る。
                inputJudgement = false;
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputJudgement);

        //直角三角形が入力値分の段となるまで以下の処理を行う。
        for (int creatingSteps = inputSteps; creatingSteps > START_VALUE; creatingSteps--) {
            //直角三角形の直角が右下になるよう一つの段に空白を表示する。
            for (int emptySpace = creatingSteps;
                    emptySpace - CALCULATING_ONE > START_VALUE; emptySpace--) {
                //空白を表示する。
                System.out.print(' ');
            }
            //直角三角形の直角が右下になるよう一つの段に'*'を表示する。
            for (int displayTriangle = START_VALUE;
                    displayTriangle <= inputSteps - creatingSteps; displayTriangle++) {
                //'*'を表示する。
                System.out.print('*');
            }
            //一つの段で直角三角形を表示するための'*'の数を満たしたので改行する。
            System.out.println();
        }
    }
}
