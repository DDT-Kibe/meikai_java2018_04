package e_02;

import java.util.Scanner;

/*
 * 演習2-5：2つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月11日
 */
public class e_02_05 {

	public static void main(String[] args) {

		//演習2-5を実施するため、キーボードからの入力を受けつけられるようにする。
		Scanner inKeyboard = new Scanner(System.in);

		//タイトルを表示させ、1回目の入力を促す。
		System.out.print("最初の値：");
		//1回目の入力に対して、小数点以下の部分をもつ値を取得できるようにする。
		double firstNumber = inKeyboard.nextDouble();

		//タイトルを表示させ、2回目の入力を促す。
		System.out.print("　次の値：");
		//2回目の入力に対して、小数点以下の部分をもつ値を取得できるようにする。
		double secondNumber = inKeyboard.nextDouble();

		//演習2-5を実施するため、入力された2つの実数の合計を求める。
		System.out.println("合計は" + (firstNumber + secondNumber) + "です。");
		//演習2-5を実施するため、入力された2つの実数の平均を求める。
		System.out.println("平均は" + (firstNumber + secondNumber) / 2 + "です。");
	}
}
