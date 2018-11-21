package e_04;

import java.util.Scanner;

/*
 * 演習4-9：正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年11月19日
 */
public class e_04_09 {

    public static void main(String[] args) {
        //変数を設け符号の判定で使用する閾値を設定する。
        final int THRESHOLD_VALUE = 0;
        //計算がはじまる値を設定する。
        final int BEGINNING_NUMBER = 1;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力された値を取得する。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示させ、入力を促す。
            System.out.print("nの値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が閾値以下の場合、
            if (requestedValue <= THRESHOLD_VALUE) {
                //タイトルを表示させ、再度入力を促す。
                System.out.println("正の数ではありません。\n1以上の整数値を入力してください。");
            }
            //入力値が閾値以下の場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //積を示す変数を設け1を代入する。
        int totalProduct = BEGINNING_NUMBER;
        //処理数を数えるための変数を設け1を代入する。
        int repeatValue = BEGINNING_NUMBER;
        //入力値が閾値よりも大きい場合、
        while (requestedValue > THRESHOLD_VALUE) {
            //積を示す変数にrepeatValueの値を掛ける。
            totalProduct *= repeatValue;
            //repeatValueの値が入力値と等しい場合、
            if (repeatValue == requestedValue) {
                //処理を抜ける。
                break;
            }
            //repeatValueの値をインクリメントし処理数を数えていく。
            repeatValue++;
        }
        //1から入力値までの積を表示する。
        System.out.print("1から" + requestedValue + "までの積は" + totalProduct + "です。");
    }
}