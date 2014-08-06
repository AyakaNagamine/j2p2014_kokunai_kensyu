package java_test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		String b="乱数は";//こんな宣言もできる。本来はできないがJava特別ルールに基づく。
		
		int a = rand.nextInt(10);
	//	System.out.print("乱数は　");
		//System.out.printで改行がなくなる。
		System.out.println(b+a);
	}
}
		//1行で書くなら System.out.println("乱数は　"+a);
		//自動変換でこおの書き方がまかり通る。嫌な人は数字を文字列に変換する猛者も。
	/*
		int sum=0;
		for(int i=0;i<=5;i++){
			sum+=i;
			if(sum==0){
			break;
			}
		System.out.println(sum);//あんまりよくない、iを繰り返し使うデータとして定義しているから。iはあくまでループ回数のi。
		}*/

	/*
	}
	boolean c = true;//false
	//””でくくらない。
	*/
	

