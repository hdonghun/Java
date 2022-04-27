package day6_객체배열사용하기;

public class ObjectCopyTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
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
		} //주소도 똑같다.
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
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
		
		
		// 두개의 library에 영향을 미친다. 얕은 복사
		// 영향을 미치지 않게 하려면, 객체를 new로 만들어서 깊은 복사
		// 즉 전혀 다른 객체를 반영하게 하여 만든다.
	}
}
