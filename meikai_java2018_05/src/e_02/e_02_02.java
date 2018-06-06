package e_02;
/*
 * 演習2-2：三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月4日
 */
public class e_02_02 {
	
	public static void main(String[] args) {
		
		//int型の変数に初期値を設定する。
		int firstNumber = 10;           // firstNumberを初期化する
		int secondNumber = 20;          // secondNumberを初期化する
		int thirdNumber = 30;           // thirdNumberを初期化する
		
		//演習2-2を実施するため合計を求めるプログラムを作成する。
		System.out.println("firstNumber～thirdNumberの合計は"
							+ (firstNumber + secondNumber + thirdNumber) + "です。");
		
		//演習2-2を実施するため平均を求めるプログラムを作成する。
		System.out.println("firstNumber～thirdNumberの平均は"
							+ (firstNumber + secondNumber + thirdNumber) / 3 + "です。");		
		}
}
