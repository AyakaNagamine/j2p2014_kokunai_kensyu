package java_test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		String b="������";//����Ȑ錾���ł���B�{���͂ł��Ȃ���Java���ʃ��[���Ɋ�Â��B
		
		int a = rand.nextInt(10);
	//	System.out.print("�����́@");
		//System.out.print�ŉ��s���Ȃ��Ȃ�B
		System.out.println(b+a);
	}
}
		//1�s�ŏ����Ȃ� System.out.println("�����́@"+a);
		//�����ϊ��ł����̏��������܂���ʂ�B���Ȑl�͐����𕶎���ɕϊ�����Ҏ҂��B
	/*
		int sum=0;
		for(int i=0;i<=5;i++){
			sum+=i;
			if(sum==0){
			break;
			}
		System.out.println(sum);//����܂�悭�Ȃ��Ai���J��Ԃ��g���f�[�^�Ƃ��Ē�`���Ă��邩��Bi�͂����܂Ń��[�v�񐔂�i�B
		}*/

	/*
	}
	boolean c = true;//false
	//�h�h�ł�����Ȃ��B
	*/
	

