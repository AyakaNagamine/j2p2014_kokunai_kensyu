package java_test;

public class Sample5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++){
				System.out.print("*");
				try{
					Thread.sleep(50);//50msec休む。ThreadはJavaのクラス。
				
				}catch(InterruptedException e){
					
					;
				}//try-catch でくくらないといけない。
			
		}
		System.out.println();
	/*	int []a={1,2,3,4,5,6,7,8,9,10};
		int b;
		*/
		}
		
				
	}
//*を100個表示する,赤い部分がなければ瞬時に現れる。
