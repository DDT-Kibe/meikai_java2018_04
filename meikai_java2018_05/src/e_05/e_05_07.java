package e_05;

/**
 * 演習5-7：0.0から1.0まで0.001おきに、その値と、その値の2条を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年12月18日
 */

public class e_05_07 {

    public static void main(String[] args) {

        //初期値を設定する。
        final float INITIALIZATION_POINT = 0.0F;
        //継続条件で使用する上限値を設定する。
        final float ARRIVAL_NUMBER = 1.0F;
        //加算代入で使用する値を設定する。
        final float UPDATE_FORMULA = 0.001F;
        //タイトルを表示する。
        System.out.println("  float      2乗した値");
        //罫線を表示する。
        System.out.println("------------------------");

        //課題の条件を満たす条件で処理を繰り返す。
        for (float targetPoint = INITIALIZATION_POINT;
                targetPoint <= ARRIVAL_NUMBER;
                targetPoint += UPDATE_FORMULA) {
            //小数点以下の桁数を揃えてfor文の計算結果とその値を2乗した結果を表示する。
            System.out.printf("%.7f    %.7f\n", targetPoint, (targetPoint * targetPoint));
        }
    }
}