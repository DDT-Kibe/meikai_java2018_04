package e_05;

/**
 * 演習5-6：List5-9(p.168)のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 *          List5-10(p.169)のように、int型の変数を0から1000までインクリメントした値を1000で
 *          割った値を求める様子を、横に並べて表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年12月18日
 */

public class e_05_06 {

    public static void main(String[] args) {

        //float型の初期化で使用する値を設定する。
        final float INITIALIZATION_POINT = 0.0F;
        //int型の初期化で使用する値を設定する。
        final int INITIALIZATION_INTEGER = 0;
        //継続条件で使用する上限値を設定する。
        final float ARRIVAL_NUMBER = 1.0F;
        //加算代入で使用する値を設定する。
        final float UPDATE_FORMULA = 0.001F;
        //割る数を設定する。
        final int DIVISOR_NUMBER = 1000;
        //項目を表示する。
        System.out.println("  float         int");
        //罫線を表示する。
        System.out.println("------------------------");

        //課題の条件を満たす条件で処理を繰り返す。
        for (float targetPoint = INITIALIZATION_POINT, targetInteger = INITIALIZATION_INTEGER;
                targetPoint <= ARRIVAL_NUMBER;
                targetPoint += UPDATE_FORMULA, targetInteger++) {
            //int型でインクリメントした値を課題で指定している数で割る。
            float divisionFormula = (float) targetInteger / DIVISOR_NUMBER;
            //小数点以下を7桁で揃えて表示する。
            System.out.printf("%.7f    %.7f\n", targetPoint, divisionFormula);
        }
    }
}