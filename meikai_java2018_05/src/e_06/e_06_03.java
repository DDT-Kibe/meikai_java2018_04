package e_06;

/**
 * 演習6-3：要素型がdouble型で要素数が5の配列の要素に対して、
 *          先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2020年1月8日
 */

public class e_06_03 {

    public static void main(String[] args) {

        //構成要素の数を設定する。
        final int TOTAL_ELEMENTS = 5;
        //for文の初期化で使用する値。
        final int START_VALUE = 0;
        //インデックス0の値1桁目を設定する。
        final int FIRST_DIGIT = 1;
        //要素の値を2桁のゾロ目にする際に使用する値。
        final int FORMULA_ELEVEN = 11;
        //要素の値を小数点以下1桁にする際に使用する値。
        final int FORMULA_TEN = 10;

        //配列を生成する。
        double[] arrayNumbers = new double[TOTAL_ELEMENTS];
        //インデックスが最大値になるまで処理を繰り返す。
        for (int gettingElement = START_VALUE; gettingElement < arrayNumbers.length; gettingElement++) {
            //要素に代入する値を作成する。
            double makingRepdigit = (double) (gettingElement + FIRST_DIGIT) * FORMULA_ELEVEN / FORMULA_TEN;
            //加工した値を要素に代入する。
            arrayNumbers[gettingElement] = makingRepdigit;
            //全要素の値を表示する。
            System.out.println("arrayNumbers[" + gettingElement + "] = " + arrayNumbers[gettingElement]);
        }
    }
}