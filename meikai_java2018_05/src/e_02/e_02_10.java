package e_02;

import java.util.Scanner;

/*
 * 演習2-10：名前の姓と名とを個別にキーボードで読み込んで、挨拶を行うプログラムを作成せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年7月4日
 */
public class e_02_10 {

	public static void main(String[] args) {

		//キーボードからの入力を受け取る用意をする。
		Scanner inKeyboard = new Scanner(System.in);

		//タイトルを表示させ、姓の入力を促す。
		System.out.println("姓：");
		//入力された文字列を取得する。
		String familyName = inKeyboard.next();

		//タイトルを表示させ、名の入力を促す。
		System.out.println("名：");
		//入力された文字列を取得する。
		String firstName = inKeyboard.next();

		//演習2-10を実施するため挨拶を表示し、姓と名をつなげて表示する。
		System.out.println("こんにちは、" + familyName + firstName + "さん。");
	}
}