package e_03;

import java.util.Scanner;

/*
 * 演習3-1：整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年7月9日
 */
public class e_03_01 {

	public static void main(String[] args) {

		//キーボードからの入力を受け取る用意をする。
		Scanner inKeyboard = new Scanner(System.in);

		//タイトルを表示させ、整数値の入力を促す。
		System.out.print("整数値：");
		//入力された整数値を取得する。
		int integerValue = inKeyboard.nextInt();

		//入力された整数値が正の場合、
		if(integerValue > 0) {
			//絶対値として値をそのまま表示する。
			System.out.println("その絶対値は" + integerValue + "です。");
		}
		//入力された整数値が負、もしくは0の場合、
		else {
			//値を反転し絶対値として表示する。
			System.out.println("その絶対値は" + (-integerValue) + "です。");
		}
	}
}
