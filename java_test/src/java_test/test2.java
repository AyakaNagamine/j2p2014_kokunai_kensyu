package java_test;//0806

public class test2 {

	//�����ɕϐ���`������t�B�[���h�ƂȂ�B���O���[�o���ϐ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="school";
		if(s1.equals("School")){
			System.out.println("�������ł��B");
		}else{
			System.out.println("�������Ȃ��ł�");
		}
		int []a=new int[5];
		System.out.println(a);//�A�h���X��\��
		a=null;
		System.out.println(a);//ad��ress���Q�Ƃł��Ȃ��Ȃ�
	
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
	
//�������Ȃ��ł��@�ƕ\�����ꂽ�琬���B
//i'm very sleepy!what i can do to wake up me?i wanna sleep here immediately.

/*
static int sum(final int a,final int b)
�Ƃ���ƕϐ���final�錾���ł���B
*/


	