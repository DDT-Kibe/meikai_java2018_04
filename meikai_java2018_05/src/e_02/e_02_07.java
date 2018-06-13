package e_02;

import java.util.Random;

/*
 * 演習2-7：以下に示すプログラムを作成せよ。
 * 			①1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 * 			②1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
 * 			③2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 * 作成者：岐部 佳織
 * 作成日：2018年6月13日
 */
public class e_02_07 {

	public static void main(String[] args){

		//乱数を生成するための用意をする。
		Random firstProgram = new Random();
		//演習2-7の①で指定された範囲の乱数が生成されるようにする。
		int positiveInteger = firstProgram.nextInt(9) + 1;
		//演習2-7の①について、指定された値の範囲が分かりやすくなるようタイトルを表示させる。
		System.out.println("①の整数値（1以上9以下）… " + positiveInteger);

		//乱数を生成するための用意をする。
		Random secondProgram = new Random();
		//演習2-7の②で指定された範囲の乱数が生成されるようにする。
		int negativeInteger = secondProgram.nextInt(9) - 9;
		//演習2-7の②について、指定された値の範囲が分かりやすくなるようタイトルを表示させる。
		System.out.println("②の整数値（-9以上-1以下）… " + negativeInteger);

		//乱数を生成するための用意をする。
		Random thirdProgram = new Random();
		//演習2-7の③で指定された範囲の乱数が生成されるようにする。
		int doubleDigitsInteger = thirdProgram.nextInt(90) + 10;
		//演習2-7の③について、指定された値の範囲が分かりやすくなるようタイトルを表示させる。
		System.out.println("③の整数値（10以上99以下）… " + doubleDigitsInteger);
		}
}
