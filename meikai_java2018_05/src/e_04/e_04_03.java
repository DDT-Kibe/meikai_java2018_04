package e_04;

import java.util.Scanner;

/*
 * 演習4-3：二つの整数値を読み込んで、小さい方の数以上で大きい方の数以下の全整数を、
 *          小さい方から順に表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年10月15日
 */
public class e_04_03 {

    public static void main(String[] args) {
        //加算用の値を初期値で設定する。
        final int ADDING_NUMBER = 1;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //タイトルを表示させ、一つ目の整数値の入力を促す。
        System.out.print("整数①：");
        //入力された整数値を取得する。
        int firstInteger = inKeyboard.nextInt();
        //タイトルを表示させ、二つ目の整数値の入力を促す。
        System.out.print("整数②：");
        //入力された整数値を取得する。
        int secondInteger = inKeyboard.nextInt();
        //小さい値を示す変数を設け、一つ目の整数値を代入する。
        int smallInteger = firstInteger;
        //大きい値を示す変数を設け、二つ目の整数値を代入する。
        int largeInteger = secondInteger;

        //一つ目と二つ目の値を比較し一つ目の値の方が大きい場合、
        if (firstInteger > secondInteger) {
            //小さい値を示す変数に二つ目の値を代入する。
            smallInteger = secondInteger;
            //大きい値を示す変数に二つ目の値を代入する。
            largeInteger = firstInteger;
        }
        //値を表示しする際に使用する変数を設け、小さい方の値を代入する。
        int displayNumber = smallInteger;
        //do文を記述していく。
        do {
            //小さい値を表示する。
            System.out.print(displayNumber);
            //小さい値に1を加算する。
            displayNumber = displayNumber + ADDING_NUMBER;
            //値の区切りとしてスペースを表示する。
            System.out.print(" ");
            //小さい値に1加算する処理を、大きい値と等しくなるまで繰り返す。
        } while (displayNumber != largeInteger);
        //大きい方の値を表示する。
        System.out.print(largeInteger);
    }
}
