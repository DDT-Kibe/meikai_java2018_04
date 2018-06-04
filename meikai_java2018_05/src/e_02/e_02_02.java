package e_02;
/*
 * 演習2-2：三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月4日
 */
public class e_02_02 {
	
	public static void main(String[] args) {
		
		//演習2-2を実施するためint型の変数を三つ用意する。
		int firstNumber;           // firstNumberはint型の変数
		int secondNumber;          // secondNumberはint型の変数
		int thirdNumber;           // thirdNumberはint型の変数

		//演習2-2を実施するためint型の変数に整数を代入する。
		firstNumber = 10;            // firstNumberに10を代入する
		secondNumber = 20;           // secondNumberに20を代入する
		thirdNumber = 30;            // thirdNumberに30を代入する

		//演習2-2を実施するため合計を求めるプログラムを作成する。
		System.out.println("firstNumber～thirdNumberの合計は"
							+ (firstNumber + secondNumber + thirdNumber) + "です。");
		
		//演習2-2を実施するため平均を求めるプログラムを作成する。
		System.out.println("firstNumber～thirdNumberの平均は"
							+ (firstNumber + secondNumber + thirdNumber) / 3 + "です。");		
		}
}
