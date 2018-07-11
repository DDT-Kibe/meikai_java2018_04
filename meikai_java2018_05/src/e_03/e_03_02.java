package e_03;

import java.util.Scanner;

/*
 * 演習3-2：二つの正の整数値を読み込んで、後者が前者の約数であれば『ＢはＡの約数です。』と表示し、
 *          そうでなければ『ＢはＡの約数ではありません。』と表示するプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年7月11日
 */
public class e_03_02 {

	public static void main(String[] args) {

		//キーボードからの入力を受け取る用意をする。
		Scanner inKeyboard = new Scanner(System.in);

		//タイトルを表示させ、整数Ａの入力を促す。
		System.out.print("整数Ａ：");
		//入力された整数値を取得する。
		int formerInteger = inKeyboard.nextInt();

		//タイトルを表示させ、整数Ｂの入力を促す。
		System.out.print("整数Ｂ：");
		//入力された整数値を取得する。
		int latterInteger = inKeyboard.nextInt();

		//ＢがＡの約数である場合、
		if(formerInteger % latterInteger == 0){
		//『ＢはＡの約数です。』と表示する。
		System.out.println("ＢはＡの約数です。");
		}

		//ＢがＡの約数ではない場合、
		else{
		//『ＢはＡの約数ではありません。』と表示する。
		System.out.println("ＢはＡの約数ではありません。");
		}
	}
}
