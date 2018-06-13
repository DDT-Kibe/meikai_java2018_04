package e_02;

import java.util.Scanner;

/*
 * 演習2-6：三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年6月13日
 */
public class e_02_06 {
	
	public static void main(String[] args) {
		
		//演習2-6を実施するため、キーボードからの入力を受けつけられるようにする。
		Scanner inKeyboard = new Scanner(System.in);
		
		//タイトルを表示させ、三角形の底辺の長さの入力を促す。
		System.out.print("底辺：");
		//小数点以下の部分をもつ値を取得できるようにする。
		double baseValue = inKeyboard.nextDouble();
		
		//タイトルを表示させ、三角形の高さの入力を促す。
		System.out.print("高さ：");
		//小数点以下の部分をもつ値を取得できるようにする。
		double heightValue = inKeyboard.nextDouble();
		
		//演習2-6を実施するため、入力された値から三角形の面積を求める。
		System.out.println("三角形の面積は" + (baseValue * heightValue) / 2 + "です。");
	}
}