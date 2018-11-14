package e_04;

import java.util.Scanner;

/*
 * 演習4-8：正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年11月14日
 */
public class e_04_08 {

    public static void main(String[] args) {
        //変数を設け符号の判定で使用する閾値を設定する。
        final int THRESHOLD_VALUE = 0;
        //変数を設け桁数を算出するために使用する割る数を設定する。
        final int DIVISOR_COMPUTATION = 10;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //入力された値を取得するために変数を設ける。
        int requestedValue;
        //do文を記述していく。
        do {
            //タイトルを表示させ、入力を促す。
            System.out.print("整数値：");
            //入力された値を取得する。
            requestedValue = inKeyboard.nextInt();
            //入力値が閾値以下の場合、
            if (requestedValue <= THRESHOLD_VALUE) {
                //タイトルを表示させ、再度入力を促す。
                System.out.println("正の数ではありません。\n1以上の整数値を入力してください。");
            }
            //入力値が閾値以下の場合は処理を繰り返す。
        } while (requestedValue <= THRESHOLD_VALUE);
        //処理を繰り返すかの判定で使用する変数を設け入力値を代入する。
        int repeatValue = requestedValue;
        //何桁かを示す変数を設け閾値を代入する。
        int digitsNumber = THRESHOLD_VALUE;
        //do文を記述していく。
        do {
            //repeatValueに代入されている値を10で割り1桁ずつ減らしていく。
            repeatValue /= DIVISOR_COMPUTATION;
            //digitsNumberに代入されている値をインクリメントし桁数を数えていく。
            digitsNumber++;
            //repeatValueに代入されている値が0より大きい間は処理を繰り返す。
        } while (repeatValue > THRESHOLD_VALUE);
        //入力値の桁数を表示する。
        System.out.print("その値は" + digitsNumber + "桁です。");
    }
}