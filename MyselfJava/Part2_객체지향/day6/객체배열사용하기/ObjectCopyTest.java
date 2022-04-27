package day6_��ü�迭����ϱ�;

public class ObjectCopyTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println();
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		} //�ּҵ� �Ȱ���.
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		System.out.println();
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println();
		System.out.println();
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		
		// �ΰ��� library�� ������ ��ģ��. ���� ����
		// ������ ��ġ�� �ʰ� �Ϸ���, ��ü�� new�� ���� ���� ����
		// �� ���� �ٸ� ��ü�� �ݿ��ϰ� �Ͽ� �����.
	}
}
