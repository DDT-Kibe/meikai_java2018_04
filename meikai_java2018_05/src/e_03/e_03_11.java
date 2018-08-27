package e_03;

import java.util.Scanner;
/*
 * 演習3-11：二つの整数値を読み込んで、それらの値の差が10以下であれば、『それらの差は10以下です』と表示し、
 *           そうでなければ『それらの差は11以上です』と表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年8月22日
 */
public class e_03_11 {
    public static void main(String[] args) {

        //閾値を初期値で設定する。
        final int THRESHOLD_VALUE = 10;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数値Ａの入力を促す。
        System.out.print("値Ａ：");
        //入力された整数値を取得する。
        int formerInteger = inKeyboard.nextInt();
        //タイトルを表示させ、整数値Ｂの入力を促す。
        System.out.print("値Ｂ：");
        //入力された整数値を取得する。
        int latterInteger = inKeyboard.nextInt();

        //整数値Ａの方が大きい場合の差を算出する。
        int formerSubtraction = formerInteger - latterInteger;
        //整数値Ｂの方が大きい場合の差を算出する。
        int latterSubtraction = latterInteger - formerInteger;
        //整数値Ａと整数値Ｂの差を絶対値として算出し閾値と比較できるようにする。
        int calculationResult = (formerInteger > latterInteger ? (formerSubtraction) : (latterSubtraction));

        //整数値Ａと整数値Ｂの差が、閾値以下であることを判定し、
        if(calculationResult <= THRESHOLD_VALUE){
            //整数値Ａと整数値Ｂの差が閾値以下である旨を表示する。
            System.out.println("それらの差は10以下です");
        //整数値Ａと整数値Ｂの差が閾値以下ではない場合、
        }else{
            //整数値Ａと整数値Ｂの差が閾値よりも大きい旨を表示する。
            System.out.println("それらの差は11以上です");
        //
        }
    }
}
