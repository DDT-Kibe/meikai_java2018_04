package e_02;

import java.util.Scanner;


/*
 * 演習2-3：キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月6日
 */
public class e_02_03 {
	
	public static void main(String[] args) {
		
		//演習2-3を実施するためキーボードから読み込ませる。
		Scanner stdIn = new Scanner(System.in);		
		//演習2-3を実施するためint型整数値を読み込ませる。
		int repetitionInput = stdIn.nextInt();
		
		//演習2-3を実施するため変数に代入される値をそのまま表示させる。
		System.out.print(repetitionInput + "と入力しましたね。");		
	}

}
