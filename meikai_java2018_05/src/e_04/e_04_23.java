package e_04;

import java.util.Scanner;

/*
 * 演習4-23：n段の数字ピラミッドを表示するプログラムを作成せよ。
 *           第i行目にはi%10を表示すること。
 * 作成者：岐部 佳織
 * 作成日：2019年7月29日
 */

public class e_04_23 {

    public static void main(String[] args) {

        //入力値がピラミッドを表示する段数として適切かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //ピラミッドの段数を算出するときに使用する値。
        final int CALCULATING_ONE = 1;
        //ピラミッドの部品（' 'と数字の個数）を算出するときに使用する値。
        final int CALCULATING_ZERO = 0;
        //ピラミッドの部品（数字の個数）を算出するときに使用する値。
        final int CALCULATING_TWO = 2;
        //ピラミッドで表示する数字を算出するときに使用する値。
        final int CALCULATING_TEN = 10;

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
        for (int displayPyramid = CALCULATING_ONE; displayPyramid <= inputSteps; displayPyramid++) {
            //一つの段に必要な分の空白を計算する。
            for (int emptySpace = (inputSteps - displayPyramid); emptySpace > CALCULATING_ZERO; emptySpace--) {
                //空白を表示する。
                System.out.print(' ');
            }
            //一つの段に必要な分の数字の個数を計算する。
            for (int figuringNumber = CALCULATING_ZERO;
                    figuringNumber < ((displayPyramid - CALCULATING_ONE) * CALCULATING_TWO + CALCULATING_ONE);
                    figuringNumber++) {
                //段に適した数字を表示する。
                System.out.print(displayPyramid % CALCULATING_TEN);
            }
            //一つの段でピラミッドを表示するための数字の個数を満たしたので改行する。
            System.out.println();
        }
    }
}
