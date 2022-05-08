package day15_����ó��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceoptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
