package Myself_Part1;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. �ڷ��� ����
				char ch1 = 'A';
				System.out.println(ch1);
				System.out.println((int)ch1);
				
				char ch2 = 66;
				System.out.println(ch2);
				System.out.println((char)ch2);
				
				int ch3 = 67;
				System.out.println(ch3);
				System.out.println((char)ch3);
				
				char han = '��';
				char ch = '\uD55C';
				System.out.println(han);
				System.out.println(ch);
		System.out.println("--------------------------");
				
		// 2. �ڷ��� - ������ �ڷ��� ���� ���� ����ϱ� 
				var i = 10;
				var j = 10.0;
				var str = "hello";
				System.out.println(i);
				System.out.println(j);
				System.out.println(str);
				
				var str2 = str;
				System.out.println(str2);
				
				str = "hello";
				System.out.println(str);
				System.out.println("--------------------------");
				
		//3. ��� �����ϱ� (������ �ʴ� ��)
				final int MAX_NUM = 100;
				final int MIN_NUM;
				MIN_NUM=0;
				System.out.println(MAX_NUM);
				System.out.println(MIN_NUM);
				
			//����ȯ
				System.out.println("---------����ȯ---------");
				byte bNum = 125; //2����Ʈ
				int iNum =bNum;	//4����Ʈ  : ��������
				System.out.println(iNum);
				
				int aNum =255; //4����Ʈ
				byte cNum = (byte)aNum; //2����Ʈ : �������� > ����ȯ > �����ͼս� �߻�
				System.out.println(cNum);
				
				double dNum = 3.14; //8����Ʈ
				int inum = (int)dNum; //4����Ʈ ��������ȯ
				System.out.println(inum); //�����ͼս�
				
				double zNum = 1.2;
				float fNum = 0.9F;
				int yNum1 = (int)zNum + (int)fNum;
				int yNum2 = (int)(zNum+fNum);
				System.out.println(yNum1);
				System.out.println(yNum2);
				
	}
}
