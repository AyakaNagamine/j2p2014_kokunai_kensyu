package java_test;//0806

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[10];
		/*
		 * int []a={1,2,3,...}�Ƃ��Ă��悢�B
		 */
		
		/*���ǂ���
		 * int len=10;
		 * int sum;
		 * int []b=new int[len];
		 * for(int i=0;i<b.length;i++){�@int�@i�̕ϐ�i�͂���for���̂Ȃ��ł̂ݎg����B�Ȃ�ׂ����[�J���ϐ����g�����Ƃ��]�܂����B
		 * 	b[i]=i+1;
		 * 	sum+=b[i]; �Ɩ��v���O�����Ȃ番���ď����̂𐄏�
		 * }
		 * 
		 */
		
		int b=0;
		
		for(int i=0;i<10;i++){//i,j�̒�`��Y�ꂸ�ɁI�I
			a[i]=i+1;
		}
		
		for(int j=0;j<10;j++){//i,j�̒�`��Y�ꂸ�ɁI�I
			b+=a[j];
		}
		System.out.println(b);
		
		int []d={1,2,3,4,5,6,7,8,9,10};
		int []c;
		c=d;
		System.out.println(c[0]);//1���o�Ă����B
		d[0]=11;
		System.out.println(c[0]);//11���o�Ă���B�|�C���^�Ɠ����d�g�݁Bc��d�������ꏊ�������悤�ɕύX����Ă���
		
		}
	}


