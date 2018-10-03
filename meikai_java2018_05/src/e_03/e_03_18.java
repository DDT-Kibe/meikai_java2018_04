package e_03;

import java.util.Scanner;

/*
 * 演習3-18：月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年9月19日
 */
public class e_03_18 {

    public static void main(String[] args) {

        //1月を示す変数を設け初期値を設定する。
        final int JANUARY_SEASON = 1;
        //2月を示す変数を設け初期値を設定する。
        final int FEBRUARY_SEASON = 2;
        //3月を示す変数を設け初期値を設定する。
        final int MARCH_SEASON = 3;
        //4月を示す変数を設け初期値を設定する。
        final int APRIL_SEASON = 4;
        //5月を示す変数を設け初期値を設定する。
        final int MAY_SEASON = 5;
        //6月を示す変数を設け初期値を設定する。
        final int JUNE_SEASON = 6;
        //7月を示す変数を設け初期値を設定する。
        final int JULY_SEASON = 7;
        //8月を示す変数を設け初期値を設定する。
        final int AUGUST_SEASON = 8;
        //9月を示す変数を設け初期値を設定する。
        final int SEPTEMBER_SEASON = 9;
        //10月を示す変数を設け初期値を設定する。
        final int OCTOBER_SEASON = 10;
        //11月を示す変数を設け初期値を設定する。
        final int NOVEMBER_SEASON = 11;
        //12月を示す変数を設け初期値を設定する。
        final int DECEMBER_SEASON = 12;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、月の入力を促す。
        System.out.print("月：");
        //入力された値を取得する。
        int seasonMonth = inKeyboard.nextInt();

        //入力され値を評価していく。
        switch (seasonMonth) {
        //値が3のとき、
        case MARCH_SEASON:
            //値が4のとき、
        case APRIL_SEASON:
            //値が5のとき、
        case MAY_SEASON:
            //季節は春である旨を表示する。
            System.out.println("季節は春です");
            //処理を抜ける。
            break;
        //値が6のとき、
        case JUNE_SEASON:
            //値が7のとき、
        case JULY_SEASON:
            //値が8のとき、
        case AUGUST_SEASON:
            //季節は夏である旨を表示する。
            System.out.println("季節は夏です");
            //処理を抜ける。
            break;
        //値が9のとき、
        case SEPTEMBER_SEASON:
            //値が10のとき、
        case OCTOBER_SEASON:
            //値が11のとき、
        case NOVEMBER_SEASON:
            //季節は秋である旨を表示する。
            System.out.println("季節は秋です");
            //処理を抜ける。
            break;
        //値が12のとき、
        case DECEMBER_SEASON:
            //値が1のとき、
        case JANUARY_SEASON:
            //値が2のとき、
        case FEBRUARY_SEASON:
            //季節は冬である旨を表示する。
            System.out.println("季節は冬です");
            //処理を抜ける。
            break;
        //指定された値に当てはまらないとき、
        default:
            //月に該当しない旨を表示する。
            System.out.println("その月はありません。");
            //処理を抜ける。
            break;
        }
    }
}
