package e_02;

import java.util.Random;
import java.util.Scanner;
/*
 * 演習2-8：キーボードから読み込んだ整数値プラスマイナス5の範囲の
 * 			整数値をランダムに生成して表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月27日
 */
public class e_02_08 {

	public static void main(String[] args) {

		//乱数を生成する用意をする。
		Random randomNumber = new Random();
		//0～10の範囲の乱数を生成する。
		int numberArea = randomNumber.nextInt(11);
		//生成した値に5を減算し、プラスマイナス5の値を設定する。
		numberArea = numberArea - 5;

		//キーボードからの入力を受け取る用意をする。
		Scanner inKeyboard = new Scanner(System.in);
		//タイトルを表示させ、整数値の入力を促す。
		System.out.print("整数値…");
		//入力された整数値を取得する。
		int positiveInteger = inKeyboard.nextInt();

		//取得した値に、設定したプラスマイナス5の値を加算する。
		positiveInteger = positiveInteger + numberArea;
		//加算した結果を表示する。
		System.out.println("入力した値の±5の乱数…" + positiveInteger );
	}
}
