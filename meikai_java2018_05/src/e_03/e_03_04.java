package e_03;

import java.util.Scanner;
/*
 * 演習3-4：二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 			『aの方が大きいです』 『bの方が大きいです』 『aとbは同じ値です』
 * 作成者：岐部 佳織
 * 作成日：2018年7月23日
 */
public class e_03_04 {

	public static void main(String[] args) {

		//キーボードからの入力を受け取る用意をする。
        Scanner inKeyboard = new Scanner(System.in);

        //タイトルを表示させ、整数aの入力を促す。
        System.out.print("整数a:");
        //入力された値を取得する。
        int comparisonA = inKeyboard.nextInt();

        //タイトルを表示させ、整数bの入力を促す。
        System.out.print("整数b:");
        //入力された値を取得する。
        int comparisonB = inKeyboard.nextInt();

        //整数aが整数bよりも大きい場合、
        if (comparisonA > comparisonB){
        	//『aの方が大きいです』を表示する。
            System.out.println("aの方が大きいです");
        }
        //整数aが整数bよりも小さい場合、
        else if (comparisonA < comparisonB){
            //『bの方が大きいです』を表示する。
        	System.out.println("bの方が大きいです");
        }
        //整数aが整数bと同じ値である場合、
        else{
        	//『aとbは同じ値です』を表示する。
            System.out.println("aとbは同じ値です");
        }
	}
}
