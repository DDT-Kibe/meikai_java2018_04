package e_04;

import java.util.Scanner;

/*
 * 演習4-5：List4-5（p.102）のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年10月29日
 */
public class e_04_05 {

    public static void main(String[] args) {

        //どの数字までカウントダウンするかを初期値で設定する。
        final int SPECIFIC_NUMBER = 0;
        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //カウントダウンする旨を表示する。
        System.out.println("カウントダウンします");
        //整数値を代入する変数を設ける。
        int x;
        //do文を記述していく。
        do {
            //タイトルを表示し、整数値の入力を促す。
            System.out.print("正の整数値：");
            //入力された値を取得する。
            x = inKeyboard.nextInt();
            //入力値が初期値で設定した値以下の場合は処理を繰り返す。
        } while (x <= SPECIFIC_NUMBER);
        //入力値が初期値で設定した値以上の場合、
        while (x >= SPECIFIC_NUMBER)
            //xの値を表示する前にデクリメントする処理を繰り返す。
            System.out.println(--x);
    }
}
/*検討結果
 *  x--で生成するのはデクリメント前の値で、値を生成した後にその値から一つ減少させるが、
 *  --xで生成するのはデクリメント後の値である。
 *  List4-5のプログラムでxを表示する際--xと記述すると、
 *  カウントダウンで-1まで表示してしまい、
 *  List4-5のプログラムの趣旨（正の整数値を0までカウントダウン）から外れてしまう。
 *
 */
