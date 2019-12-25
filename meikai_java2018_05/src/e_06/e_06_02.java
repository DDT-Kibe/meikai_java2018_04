package e_06;

/**
 * 演習6-2：要素型がint型で要素数が5の配列の要素に対して、
 *          先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2019年12月25日
 */

public class e_06_02 {

    public static void main(String[] args) {

        //構成要素の数を設定する。
        final int TOTAL_ELEMENTS = 5;
        //初期化で使用する値。
        final int START_VALUE = 0;
        //配列を生成する。
        int[] arrayNumbers = new int[TOTAL_ELEMENTS];

        //要素の先頭（インデックス0）が5から降順に並ぶよう処理を繰り返す。
        for (int gettingElement = START_VALUE; gettingElement < arrayNumbers.length; gettingElement++) {
            //インデックス0が最大値となるよう減算する。
            arrayNumbers[gettingElement] = TOTAL_ELEMENTS - gettingElement;
            //全要素の値を表示する。
            System.out.println("arrayNumbers[" + gettingElement + "] = " + arrayNumbers[gettingElement]);
        }
    }
}