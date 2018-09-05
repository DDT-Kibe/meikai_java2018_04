package e_03;

import java.util.Scanner;

/*
 * 演習3-13：キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 *           ※たとえば、2,3,1の中央値は2で、1,2,1,の中央値は1で、3,3,3の中央値は3である。
 * 作成者：岐部 佳織
 * 作成日：2018年9月5日
 */
public class e_03_13 {

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

        //中央値を示す変数を設け、一つ目の入力値を代入する。
        int mediumValue = firstInteger;
        //一つ目の入力値が最小値である場合、
        if (mediumValue < secondInteger && mediumValue < thirdInteger) {
            //二つ目の入力値が三つ目の入力値以下であることを判定し、
            if (secondInteger <= thirdInteger) {
                //trueの場合、中央値を示す変数に二つ目の入力値を代入する。
                mediumValue = secondInteger;
                //falseの場合、
            } else {
                //中央値を示す変数に三つ目の入力値を代入する。
                mediumValue = thirdInteger;
            }
            //一つ目の入力値が最大値である場合、
        } else if (mediumValue > secondInteger && mediumValue > thirdInteger) {
            //二つ目の入力値が三つ目の入力値以上であることを判定し、
            if (secondInteger >= thirdInteger) {
                //trueの場合、中央値を示す変数に二つ目の入力値を代入する。
                mediumValue = secondInteger;
                //falseの場合、
            } else {
                //中央値を示す変数に三つ目の入力値を代入する。
                mediumValue = thirdInteger;
            }
            //二つ目と三つ目の入力値のどちらか一方でも一つ目の入力値と同じ場合、変数には何もしない。
        } else if (mediumValue == secondInteger || mediumValue == thirdInteger) {

        }
        //中央値を表示する。
        System.out.println("中央値は" + mediumValue + "です");
    }
}
