package e_02;
/*
 * 演習2-2：三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月4日
 */
public class e_02_02 {
	
	public static void main(String[] args) {
		
		//演習2-2を実施するためint型の変数を三つ用意する。
		int hensu_1;           // hensu_1はint型の変数
		int hensu_2;           // hensu_2はint型の変数
		int hensu_3;           // hensu_3はint型の変数

		//演習2-2を実施するためint型の変数に整数を代入する。
		hensu_1 = 10;           // hensu_1に10を代入する
		hensu_2 = 20;           // hensu_2に20を代入する
		hensu_3 = 30;           // hensu_3に30を代入する

		//演習2-2を実施するため合計を求めるプログラムを作成する。
		System.out.println("hensu_1～hensu_3の合計は" +( hensu_1 + hensu_2 + hensu_3 ) + "です。");
		//演習2-2を実施するため平均を求めるプログラムを作成する。
		System.out.println("hensu_1～hensu_3の平均は"  + ( hensu_1 + hensu_2 + hensu_3 ) / 3 + "です。");		
		}
}
