package com.yedam.exceptions;
//p.440

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResourceExample {
	public static void main(String[] args) {
//		FileInputStream fis = null;
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try(FileInputStream fis = new FileInputStream(paths)) {
			int readByte;
			while((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽을 수 없습니다");
		}
//		try {
//			fis.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	} //end of main()
}
