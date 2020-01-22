package e_06;

import java.util.Random;
import java.util.Scanner;

/**
 * 演習6-4：List6-5を書きかえて、縦向きの棒グラフで表示するプログラムを作成せよ。
 *          最下段には、インデックスを10で割った剰余を表示すること。
 * 作成者：岐部 佳織
 * 作成日：2020年1月15日
 */

public class e_06_04 {

    public static void main(String[] args) {

        //棒グラフを表示するのに妥当な入力値かを判定する値。
        final int THRESHOLD_VALUE = 2;
        //乱数の最小値を設定する。
        final int MINIMUM_VALUE = 1;
        //乱数の最大値を設定する。
        final int MAX_VALUE = 10;
        //for文の初期化で使用する値。（要素数用）
        final int ELEMENT_START_VALUE = 0;
        //for文の初期化で使用する値。（グラフの横ライン用）
        final int LINE_START_VALUE = 1;
        //計算式で使用する値。
        final int FORMULA_ONE = 1;
        //最下段に剰余を表示する際の計算で使用する値。
        final int INDEX_DIVISION_VALUE = 10;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力値を代入する変数を用意をする。
        int totalElements;

        //入力値が妥当かを判定する。
        do {
            //タイトルを表示し入力を促す。
            System.out.print("要素数：");
            //入力された値を取得する。
            totalElements = inKeyboard.nextInt();
            //入力値が2未満の場合
            if (totalElements < THRESHOLD_VALUE) {
                //2以上の値を入力するようアナウンスする。
                System.out.println("2以上の整数値を入力して下さい。");
            }
            //入力値が2未満の場合は再度タイトルを表示する。
        } while (totalElements < THRESHOLD_VALUE);

        //配列を生成する。
        int[] arrayNumbers = new int[totalElements];

        //乱数を生成する用意をする。
        Random makingNumber = new Random();
        //要素数分の乱数を生成する。
        for (int countElement = ELEMENT_START_VALUE; countElement < totalElements; countElement++) {
            //生成した乱数を要素に代入する。
            arrayNumbers[countElement] = MINIMUM_VALUE + makingNumber.nextInt(MAX_VALUE);
        }

        //棒グラフを作成する。
        for (int countBar = ELEMENT_START_VALUE; countBar < MAX_VALUE; countBar++) {
            //一段ずつ棒グラフ部分を作成する。
            for (int displayBar = ELEMENT_START_VALUE; displayBar < totalElements; displayBar++) {
                //棒グラフの実数（「*」）と余白の出し分けを行う。
                if ((MAX_VALUE - countBar) <= arrayNumbers[displayBar]) {
                    //「*」を表示する。
                    System.out.print('*');
                    //計算結果が要素の値以上の場合
                } else {
                    //余白を表示する。
                    System.out.print(' ');
                }
                //棒グラフ間に隙間を表現する。
                if (displayBar + FORMULA_ONE < totalElements) {
                    //隙間として空白を表示する。
                    System.out.print(' ');
                }
            }
            //一段分、棒グラフを表示したので改行する。
            System.out.println();
        }

        //棒グラフの幅分、グラフの横ライン（値0の横線）を表示する。
        for (int countLine = LINE_START_VALUE; countLine <= totalElements; countLine++) {
            //線を表示する。
            System.out.print((countLine == totalElements) ? "-" : "--");
        }
        //棒グラフの幅分、グラフの横ラインを表示したので改行する。
        System.out.println();

        //最下段に10で割った剰余を作成する。
        for (int countDivision = ELEMENT_START_VALUE; countDivision < totalElements; countDivision++) {
            //10で割った剰余を求める。
            int bottomNumber = countDivision % INDEX_DIVISION_VALUE;
            //剰余を表示する。
            System.out.print((countDivision == totalElements) ? bottomNumber : bottomNumber + " ");
        }
    }
}