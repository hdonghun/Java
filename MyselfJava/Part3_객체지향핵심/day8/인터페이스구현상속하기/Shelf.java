package day8_인터페이스구현하기_상속;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	public Shelf() {
		shelf = new ArrayList<String>();
		
	}

	public ArrayList<String> getShelf(){
		return shelf;
		
	}
	
	public int getCount() {
		return shelf.size();
		
	}
	
	
}
