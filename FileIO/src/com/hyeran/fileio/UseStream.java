package com.hyeran.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Stream 사용해서 파일 읽고 쓰기
 * @author hyeran
 *
 */
public class UseStream {

	// 1. 파일 읽기
	public String read(String filepath) {
		String result = "";
		
		File file = new File(filepath);
		try(FileInputStream fis = new FileInputStream(file)) {
			
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			
			// 파일 인풋 스트림은 한번에 한글자씩 읽는다 -> 한글자를 숫자 값으로 읽어들인다.
			int oneChar = 0;
			// 반복문을 통해 한글자씩 글자가 없을 때 까지 읽어들인다.
			// 파일의 모든 글자를 다 읽으면 fis.read()가 -1을 return 
			while((oneChar=isr.read()) != -1) {
				result = result + (char)oneChar;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return result;	
	}
	
	// 2. 파일 쓰기
	public void write(String filepath, String content) {
		
		File file = new File(filepath);
		FileOutputStream fos = null;
		// finally 블럭에서 fos를 사용하기 위해서 try 블럭 밖에 선언 
		try {
			fos = new FileOutputStream(file);
			// write에는 byte배열을 넘겨줘야 함
			fos.write(content.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*
		 * try - with 문법
		 * try영역 안에서 오류가 나든 나지 않든 마지막에 fos.close()를 호출해줘서
		 * finally절이 필요 없어진다. => 코드 간편
		 */
		try (FileOutputStream fos2 = new FileOutputStream(file);
			FileInputStream fis = new FileInputStream(file) ) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
