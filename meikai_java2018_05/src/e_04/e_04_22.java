package e_04;

import java.util.Scanner;

/*
 * 演習4-22：n段のピラミッドを表示するプログラムを作成せよ。
 *           第i行目には (i - 1) * 2 + 1個の'*'記号を表示して、最終行である
 *           第n行目には (n - 1) * 2 + 1個の'*'記号を表示すること。
 * 作成者：岐部 佳織
 * 作成日：2019年7月24日
 */

public class e_04_22 {

    public static void main(String[] args) {

        //入力値がピラミッドを表示する段数として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //ピラミッドの段数を計算するときに使用する値。
        final int CALCULATING_ONE = 1;
        //ピラミッドの部品（' 'と'*'）を表示する計算で使用する値。
        final int CALCULATING_ZERO = 0;
        //ピラミッドの部品（'*'）を表示する計算で使用する値。
        final int CALCULATING_TWO = 2;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を受け取る用意をする。
        int inputSteps;
        //入力値として適切かを判定する条件式を代入する変数を用意する。
        boolean inputJudgement;

        //入力値が適切かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("ピラミッドを表示します。\n段数：");
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
                //ピラミッドを表示する次の処理に移る。
                inputJudgement = false;
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (inputJudgement);

        //ピラミッドが入力値分の段となるまで以下の処理を行う。
        for (int creatingSteps = CALCULATING_ONE; creatingSteps <= inputSteps; creatingSteps++) {
            //入力値分の段のピラミッドの形になるよう一つの段に空白を表示する。
            for (int emptySpace = (inputSteps - creatingSteps); emptySpace > CALCULATING_ZERO; emptySpace--) {
                //空白を表示する。
                System.out.print(' ');
            }
            //入力値分の段のピラミッドの形になるよう一つの段に'*'を表示する。
            for (int displayTriangle = CALCULATING_ZERO;
                    displayTriangle < ((creatingSteps - CALCULATING_ONE) * CALCULATING_TWO + CALCULATING_ONE);
                    displayTriangle++) {
                //'*'を表示する。
                System.out.print('*');
            }
            //一つの段でピラミッドを表示するための'*'の数を満たしたので改行する。
            System.out.println();
        }
    }
}
