package day15_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceoptionHandling2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("a.txt")){
			System.out.println("read");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
