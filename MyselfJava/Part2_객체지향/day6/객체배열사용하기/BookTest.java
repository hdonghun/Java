package day6_객체배열사용하기;

public class BookTest {
	
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
//		for(int i=0; i<library.length; i++	) {
//			System.out.println(library[i]);
//		}
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		//객체 array를 사용할때는 그냥 new 한다고 만들어지는것이 아니라, 객체를 만들어서 넣어야 한다.
		
	}
}
