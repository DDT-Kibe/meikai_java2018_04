package e_03;

import java.util.Scanner;
/*
 * 演習3-15：二つの整数値を読み込んで降順（大きい順）にソートするプロフラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年9月■日
 */
public class e_03_15 {

    public static void main(String[] args) {

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数ａの入力を促す。
        System.out.print("整数ａ：");
        //入力された整数値を取得する。
        int IntegerValueA = inKeyboard.nextInt();
        //タイトルを表示させ、整数ｂの入力を促す。
        System.out.print("整数ｂ：");
        //入力された整数値を取得する。
        int IntegerValueB = inKeyboard.nextInt();

        //コメントを考え中。
        //
        if (IntegerValueA < IntegerValueB) {
            //
            int tt = IntegerValueA;
            //
            IntegerValueA = IntegerValueB;
            //
            IntegerValueB = tt;
        }
        //
        System.out.println("\n整数を降順にソートしました");
        //
        System.out.println(IntegerValueA);
        //
        System.out.println(IntegerValueB);

    }
}
