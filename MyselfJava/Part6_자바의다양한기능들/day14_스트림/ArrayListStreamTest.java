package day14_��Ʈ��;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("�赿��");
		sList.add("�ѵ���11");
		sList.add("�̹μ�");
		//��Ʈ���������
		Stream<String> stream = sList.stream();
		//��Ʈ���� ��� �̿��Ҳ���
		stream.forEach(s->System.out.println(s));
		System.out.println();
		//
		sList.stream().sorted().forEach(s->System.out.print(s+"\t"));
		//
		System.out.println();
		//���ڼ�
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+"\t"));
		//���� ������ �ϴ����� ������ �ڷ��� sList�� ������ �ʴ´�.
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		
		//�ڷ��� ���� ������� ������ ������ ����
		//�迭, �÷����� ������� ������ ���� ��
		//�ϰ��� �ִ� �������� �ڷ��� ó���� ���� �����ϰ� ��
		//�ڷ� ó���� ���� �߻�ȭ�� �����Ǿ��ٰ� ��
	}
}
