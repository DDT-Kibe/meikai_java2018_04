package e_03;

import java.util.Scanner;

/*
 * 演習3-12：キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年8月27日
 */
public class e_03_12 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、一つ目の入力を促す。
        System.out.print("値１：");
        //入力された整数値を取得する。
        int firstInteger = inKeyboard.nextInt();
        //タイトルを表示させ、二つ目の入力を促す。
        System.out.print("値２：");
        //入力された整数値を取得する。
        int secondInteger = inKeyboard.nextInt();
        //タイトルを表示させ、三つ目の入力を促す。
        System.out.print("値３：");
        //入力された整数値を取得する。
        int thirdInteger = inKeyboard.nextInt();

        //最小値を示す変数を設け、現在の最小値として一つ目の入力値を代入する。
        int minimumValue = firstInteger;
        //二つ目の入力値が現在の最小値より小さい場合、二つ目の入力値を最小値を示す変数に代入する。
        if(secondInteger < minimumValue) minimumValue = secondInteger;
        //三つ目の入力値が現在の最小値より小さい場合、三つ目の入力値を最小値を示す変数に代入する。
        if(thirdInteger < minimumValue) minimumValue = thirdInteger;

        //どの入力値が最小値かを表示する。
        System.out.println("最小値は" + minimumValue + "です");
    }
}
