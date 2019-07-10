package e_04;

import java.util.Scanner;

/*
 * 演習4-19：季節を求めるList4-1（p.95）の月の読み込みにおいて、1～12以外の値が
 *           入力された場合は、再入力させるように修正したプログラムを作成せよ。
 *           (do文の中にdo文が入る二重ループとなる)
 * 作成者：岐部 佳織
 * 作成日：2019年7月1日
 */

public class e_04_19 {

    public static void main(String[] args) {

        //春が始まる月（3月）。
        final int SPRING_MARCH = 3;
        //春が終わる月（5月）。
        final int SPRING_MAY = 5;
        //夏が始まる月（6月）。
        final int SUMMER_JUNE = 6;
        //夏が終わる月（8月）。
        final int SUMMER_AUGUST = 8;
        //秋が始まる月（9月）。
        final int AUTUMN_SEPTEMBER = 9;
        //秋が終わる月（11月）。
        final int AUTUMN_NOVEMBER = 11;
        //冬が始まる月（12月）。
        final int WINTER_DECEMBER = 12;
        //冬の途中である月（1月）。
        final int WINTER_JANUARY = 1;
        //冬が終わる月（2月）。
        final int WINTER_FEBRUARY = 2;
        //再度季節を求める場合の"Yes"に持たせる値。
        final int SEASON_AGAIN_QUESTION = 1;

        //キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);
        //再度季節を求めるかの回答を受け取る用意をする。
        int seasonAgainAnswer;
        //再度季節を求めるかの回答を判定する。
        do {

            //何月の季節を求めるかの値を受け取る用意をする。
            int requestedMonth;
            //入力された月の季節を判定する。
            do {
                //タイトルを表示し入力を促す。
                System.out.print("季節を求めます。\n何月ですか？");
                //入力された月の値を取得する。
                requestedMonth = inKeyboard.nextInt();
                //暦に該当しない月を入力された場合
                if (requestedMonth < WINTER_JANUARY || requestedMonth > WINTER_DECEMBER) {
                    //1～12を入力してもらうようアナウンスする。
                    System.out.println("1～12までの数字を入力してください。");
                }
                //暦に該当しない月を入力されたら再度タイトルを表示し処理を繰り返す。
            } while (requestedMonth < WINTER_JANUARY || requestedMonth > WINTER_DECEMBER);

            //3～5の月で求められた場合
            if (requestedMonth >= SPRING_MARCH && requestedMonth <= SPRING_MAY) {
                //その季節が春であることを表示する。
                System.out.println("それは春です。");
                //6～8の月で求められた場合
            } else if (requestedMonth >= SUMMER_JUNE && requestedMonth <= SUMMER_AUGUST) {
                //その季節が夏であることを表示する。
                System.out.println("それは夏です。");
                //9～11の月で求められた場合
            } else if (requestedMonth >= AUTUMN_SEPTEMBER && requestedMonth <= AUTUMN_NOVEMBER) {
                //その季節が秋であることを表示する。
                System.out.println("それは秋です。");
                //それ以外（12・1・2の月）で求められた場合
            } else {
                //その季節が冬であることを表示する。
                System.out.println("それは冬です。");
            }

            //再度季節を求めるか入力者へ問う。
            System.out.print("もう一度？  1…Yes／0…No：");
            //回答された値を取得する。
            seasonAgainAnswer = inKeyboard.nextInt();
            //回答が"Yes"の場合は処理を繰り返す。
        } while (seasonAgainAnswer == SEASON_AGAIN_QUESTION);
    }
}