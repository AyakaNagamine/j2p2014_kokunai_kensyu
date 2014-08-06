package java_test;//0806

public class test2 {

	//ここに変数を描いたらフィールドとなる。＝グローバル変数
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="school";
		if(s1.equals("School")){
			System.out.println("等しいです。");
		}else{
			System.out.println("等しくないです");
		}
		int []a=new int[5];
		System.out.println(a);//アドレスを表示
		a=null;
		System.out.println(a);//adｄressを参照できなくなる
	
	int aa = 10;
	int bb = 13;
	int result = test2.max(aa, bb);
	System.out.println(aa);
	}
	static int max(int a,int b){
		a=100;
		return 0;
	}

	
}
	
//等しくないです　と表示されたら成功。
//i'm very sleepy!what i can do to wake up me?i wanna sleep here immediately.

/*
static int sum(final int a,final int b)
とすると変数のfinal宣言ができる。
*/


	