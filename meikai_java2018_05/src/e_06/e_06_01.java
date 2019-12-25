package e_06;

/**
 * 演習6-1：要素型がdouble型で要素数が5の配列を生成して、
 *          その全要素の値を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年12月25日
 */

public class e_06_01 {

    public static void main(String[] args) {

        //構成要素の数を設定する。
        final int TOTAL_ELEMENTS = 5;
        //インデックスが0の値を設定する。
        final double ELEMENT_ZERO = 0.1;
        //インデックスが1の値を設定する。
        final double ELEMENT_ONE = 0.2;
        //インデックスが2の値を設定する。
        final double ELEMENT_TWO = 0.3;
        //インデックスが3の値を設定する。
        final double ELEMENT_THREE = 0.4;
        //インデックスが4の値を設定する。
        final double ELEMENT_FOUR = 0.5;

        //配列本体を生成する。
        double[] arrayNumbers = new double[TOTAL_ELEMENTS];

        //インデックス0に値を代入する。
        arrayNumbers[0] = ELEMENT_ZERO;
        //インデックス1に値を代入する。
        arrayNumbers[1] = ELEMENT_ONE;
        //インデックス2に値を代入する。
        arrayNumbers[2] = ELEMENT_TWO;
        //インデックス3に値を代入する。
        arrayNumbers[3] = ELEMENT_THREE;
        //インデックス4に値を代入する。
        arrayNumbers[4] = ELEMENT_FOUR;

        //インデックス0の値を表示する。
        System.out.println("arrayNumbers[0] = " + arrayNumbers[0]);
        //インデックス1の値を表示する。
        System.out.println("arrayNumbers[1] = " + arrayNumbers[1]);
        //インデックス2の値を表示する。
        System.out.println("arrayNumbers[2] = " + arrayNumbers[2]);
        //インデックス3の値を表示する。
        System.out.println("arrayNumbers[3] = " + arrayNumbers[3]);
        //インデックス4の値を表示する。
        System.out.println("arrayNumbers[4] = " + arrayNumbers[4]);
    }
}