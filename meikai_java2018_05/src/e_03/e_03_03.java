package e_03;

import java.util.Scanner;
/*
 * 演習3-3：List3-5の最後の else を、else if(n == 0) に変更したらどうなるかを検討せよ。
 * 作成者：岐部 佳織
 * 作成日：2018年7月23日
 */
public class e_03_03 {

    public static void main(String[] args) {

    //キーボードからの入力を受け取る用意をする。
    Scanner inKeyboard = new Scanner(System.in);

    //タイトルを表示させ、整数値の入力を促す。
    System.out.print("整数値：");
    //入力された整数値を取得する。
    int integerValue = inKeyboard.nextInt();

    //入力された値が0よりも大きい場合、
    if(integerValue > 0){
      //その値が正である旨を表示する。
      System.out.print("その値は正です。");

    //入力された値が0よりも小さい場合、
    }else if(integerValue < 0){
      //その値が負である旨を表示する。
      System.out.print("その値は負です。");

    //入力された値が0である場合、
    }else if(integerValue == 0){
      //その値が0である旨を表示する。
      System.out.print("その値は0です。");
    }
    //検討結果
    //「else」のときと処理結果は同じだが、工程が異なる。
    //「else if(integerValue == 0)」だと条件が3つ。
    //「else」でも条件は3つだが、「 > 0」の場合、「 < 0」の場合、そして「それ以外」となる。
  }
}