package Myself_Part1;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. 자료형 문자
				char ch1 = 'A';
				System.out.println(ch1);
				System.out.println((int)ch1);
				
				char ch2 = 66;
				System.out.println(ch2);
				System.out.println((char)ch2);
				
				int ch3 = 67;
				System.out.println(ch3);
				System.out.println((char)ch3);
				
				char han = '한';
				char ch = '\uD55C';
				System.out.println(han);
				System.out.println(ch);
		System.out.println("--------------------------");
				
		// 2. 자료형 - 논리형과 자료형 없이 변수 사용하기 
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
				
		//3. 상수 선언하기 (변하지 않는 수)
				final int MAX_NUM = 100;
				final int MIN_NUM;
				MIN_NUM=0;
				System.out.println(MAX_NUM);
				System.out.println(MIN_NUM);
				
			//형변환
				System.out.println("---------형변환---------");
				byte bNum = 125; //2바이트
				int iNum =bNum;	//4바이트  : 문제없음
				System.out.println(iNum);
				
				int aNum =255; //4바이트
				byte cNum = (byte)aNum; //2바이트 : 문제있음 > 형변환 > 데이터손실 발생
				System.out.println(cNum);
				
				double dNum = 3.14; //8바이트
				int inum = (int)dNum; //4바이트 강제형변환
				System.out.println(inum); //데이터손실
				
				double zNum = 1.2;
				float fNum = 0.9F;
				int yNum1 = (int)zNum + (int)fNum;
				int yNum2 = (int)(zNum+fNum);
				System.out.println(yNum1);
				System.out.println(yNum2);
				
	}
}
