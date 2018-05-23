package e_02;
/*
 * 演習2-1：int型に小数部をもつ実数値をxとyに代入し、その結果を考察せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年5月23日
 */
public class e_02_01 {

	public static void main(String[] args) {
		//考察するためxとyの変数を用意する。
		int x;           // xはint型の変数
		int y;           // yはint型の変数

		//考察するため整数型のintに小数を代入する。
		x = 601;           // xに60.1を代入する
		y = 102;           // xに10.2を代入する

		//考察するためxとyで処理を行う。
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		}
		//考察：int型が扱えるのは整数のみのため、
		//      小数を変数に代入すると処理結果はエラーとなる。
}
