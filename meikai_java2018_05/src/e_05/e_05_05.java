package e_05;

import java.util.Scanner;

/**
 * 演習5-5：三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 *          平均はキャスト演算子を利用して求め、実数として表示すること。
 * 作成者：岐部 佳織
 * 作成日：2019年12月11日
 */

public class e_05_05 {

    public static void main(String[] args) {

        //平均値を出すための母数を設定する。
        final int INPUT_TIMES = 3;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //プログラムの説明を表示する。
        System.out.println("三つの整数値を読み込んで、その合計と平均を表示します。");
        //タイトルを表示し入力を促す。
        System.out.print("整数①：");
        //1つ目の入力値を取得する。
        int firstNumber = inKeyboard.nextInt();
        //タイトルを表示し入力を促す。
        System.out.print("整数②：");
        //2つ目の入力値を取得する。
        int secondNumber = inKeyboard.nextInt();
        //タイトルを表示し入力を促す。
        System.out.print("整数③：");
        //3つ目の入力値を取得する。
        int thirdNumber = inKeyboard.nextInt();

        //合計値を算出する。
        int sumTotal = (firstNumber + secondNumber + thirdNumber);
        //平均値を算出する。
        double averageValue = (double) sumTotal / INPUT_TIMES;
        //合計値と平均値を表示する。
        System.out.print("合計は" + sumTotal + "で、平均は" + averageValue + "です。");
    }
}