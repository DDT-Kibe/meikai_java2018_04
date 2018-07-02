package e_02;

import java.util.Random;

/*
 * 演習2-9：以下に示すプログラムを作成せよ。（実数値の乱数の生成には nextDouble() を使うこと）
 * 			①0.0以上1.0未満の実数値をランダムに生成して表示。
 * 			②0.0以上10.0未満の実数値をランダムに生成して表示。
 * 			③-1.0以上1.0未満の実数値をランダムに生成して表示。
 * 作成者：岐部 佳織
 * 作成日：2018年7月2日
 */
public class e_02_09 {

	public static void main(String[] args) {

		//乱数を生成するための用意をする。
	    Random randomNumber = new Random();

	    //実数値で乱数を生成する。       …部品1
	    double componentNumberOne = randomNumber.nextDouble();
	    //整数値で0～9の乱数を生成する。 …部品2
	    int componentNumberTwo = randomNumber.nextInt(10);
	    //整数値で0～1の乱数を生成する。 …部品3
	    int componentNumberThree = randomNumber.nextInt(2);

	    //演習2-9①を実施するために部品1を表示する。
		System.out.println("① 0.0以上1.0未満の実数値…" + componentNumberOne);
		//演習2-9②を実施するために部品2と部品1を加算し表示する。
		System.out.println("② 0.0以上10.0未満の実数値…" + (componentNumberTwo + componentNumberOne));
		//演習2-9③を実施するために部品3を反転させ、反転させた部品3と部品1を加算し表示する。
		System.out.println("③ -1.0以上1.0未満の実数値…" + (-componentNumberThree + componentNumberOne));
	}
}
