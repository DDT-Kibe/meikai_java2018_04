package e_02;

import java.util.Scanner;

/*
 * 演習2-4：キーボードから読み込んだ整数値に10を加えた値と
 * 			10を減じた値を出力するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月6日
 */
public class e_02_04 {

	public static void main(String[] args) {

		//演習2-4を実施するためキーボードから読み込ませる
		Scanner stdIn = new Scanner(System.in);
		//演習2-4を実施するためint型整数値を読み込ませる。
		int additionSubtraction = stdIn.nextInt();

		//演習2-4を実施するため代入される値に10を加える。
		System.out.println("10を加えた値は" + (additionSubtraction + 10) + "です。");
		//演習2-4を実施するため代入される値に10を減じる。
		System.out.println("10を減じた値は" + (additionSubtraction - 10) + "です。");
	}
}
