package java_test;//0806

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[10];
		/*
		 * int []a={1,2,3,...}としてもよい。
		 */
		
		/*より良い例
		 * int len=10;
		 * int sum;
		 * int []b=new int[len];
		 * for(int i=0;i<b.length;i++){　int　iの変数iはこのfor文のなかでのみ使える。なるべくローカル変数を使うことが望ましい。
		 * 	b[i]=i+1;
		 * 	sum+=b[i]; 業務プログラムなら分けて書くのを推奨
		 * }
		 * 
		 */
		
		int b=0;
		
		for(int i=0;i<10;i++){//i,jの定義を忘れずに！！
			a[i]=i+1;
		}
		
		for(int j=0;j<10;j++){//i,jの定義を忘れずに！！
			b+=a[j];
		}
		System.out.println(b);
		
		int []d={1,2,3,4,5,6,7,8,9,10};
		int []c;
		c=d;
		System.out.println(c[0]);//1が出てくるよ。
		d[0]=11;
		System.out.println(c[0]);//11が出てくる。ポインタと同じ仕組み。cとdが同じ場所を示すように変更されている
		
		}
	}


