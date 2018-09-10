package e_03;

import java.util.Scanner;

/*
 * 演習3-14：List3-13と同様に、二つの整数値を読み込んで、小さい方の値と大きい方の値の
 *           両方を表示するプログラムを作成せよ。
 *           ただし、二つの整数値が等しい場合は、『二つの値は同じです』と表示すること。
 * 作成者：岐部 佳織
 * 作成日：2018年9月10日
 */
public class e_03_14 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数ａの入力を促す。
        System.out.print("整数ａ：");
        //入力された整数値を取得する。
        int variableIntegerA = inKeyboard.nextInt();
        //タイトルを表示させ、整数ｂの入力を促す。
        System.out.print("整数ｂ：");
        //入力された整数値を取得する。
        int variableIntegerB = inKeyboard.nextInt();

        //小さい方の値を示す変数を設ける。
        int minimumValue;
        //大きい方の値を示す変数を設ける。
        int maximumValue;
        //整数ａが整数ｂよりも小さいことを判定し、
        if (variableIntegerA < variableIntegerB) {
            //trueの場合、小さい方の値を示す変数に整数ａを代入し、
            minimumValue = variableIntegerA;
            //大きい方の値を示す変数に整数ｂを代入する。
            maximumValue = variableIntegerB;
        //falseの場合、
        }else {
            //小さい方の値を示す変数に整数ｂを代入し、
            minimumValue = variableIntegerB;
            //大きい方の値を示す変数に整数ａを代入する。
            maximumValue = variableIntegerA;
        }
        //表示をする際に整数ａと整数ｂが同じ値であるかを判定し、trueの場合、値が同じである旨を表示する。
        System.out.println((variableIntegerA == variableIntegerB) ? "二つの値は同じです"
                //falseの場合、小さい方の値を先に表示し、
                : "小さい方の値は" + minimumValue + "です"
                //次に大きい方の値を表示する。
                + "\n大きい方の値は" + maximumValue + "です");
    }
}
