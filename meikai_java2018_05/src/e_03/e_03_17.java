package e_03;

import java.util.Random;

/*
 * 演習3-17：0,1,2のいずれかの値の乱数を生成し、0であれば"グー"を、1であれば"チョキ"を、
 *           2であれば"パー"を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年9月19日
 */
public class e_03_17 {

    public static void main(String[] args) {

        //乱数を生成する範囲を初期値で設定する。
        final int VALUE_RANGE = 3;
        //値の一つ目を初期値で設定する。
        final int FIRST_INTEGER = 0;
        //値の二つ目を初期値で設定する。
        final int SECOND_INTEGER = 1;
        //値の三つ目を初期値で設定する。
        final int THIRD_INTEGER = 2;

        //乱数を生成する用意をする。
        Random randomNumber = new Random();
        //0～2の乱数を生成し変数に代入する。
        int rockPaperScissors = randomNumber.nextInt(VALUE_RANGE);
        //switch文で生成した乱数の評価をしていく。

        //生成された乱数について判定していく。
        switch (rockPaperScissors) {
        //生成された値が0のとき、
        case FIRST_INTEGER:
            //「グー」を表示し、
            System.out.println("グー");
            //処理を抜ける。
            break;
        //生成された値が1のとき、
        case SECOND_INTEGER:
            //「チョキ」を表示し、
            System.out.println("チョキ");
            //処理を抜ける。
            break;
        //生成された値が2のとき、
        case THIRD_INTEGER:
            //「パー」を表示し、
            System.out.println("パー");
            //処理を抜ける。
            break;
        }
    }
}
