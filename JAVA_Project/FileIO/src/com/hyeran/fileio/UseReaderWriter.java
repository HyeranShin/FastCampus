package com.hyeran.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 문자 입출력 클래스 사용하기
 * @author hyeran
 *
 */
public class UseReaderWriter {

	// 1. 읽기
	public String read(String filepath) {
		String result = "";
		// 1.1 파일 생성
		File file = new File(filepath);
		// 1.2 파일이 있는지 확인
		if(file.exists()) {
			try(FileReader fr = new FileReader(file)){
				// 한글자씩 읽을 변수 선언
				int one = 0;
				while(true) {
					one = fr.read();
					if(one == -1) break;
					result = result + (char)one;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	// 2. 쓰기
	public void write(String filepath, String content) {
		// 2.1 파일 생성
		File file = new File(filepath);
		
		if(file.exists()) {
			try(FileWriter fw = new FileWriter(file, true)) {	// FileWriter의 두번째 파라미터는 append 여부를 결정: true
				fw.write(content);		// Stream과 다르게 String을 담을 수 있음
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try(FileWriter fw = new FileWriter(file)) {
				fw.write(content);
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
