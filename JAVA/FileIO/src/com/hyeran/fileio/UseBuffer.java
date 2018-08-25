package com.hyeran.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 버퍼 사용하기
 * @author hyeran
 *
 */
public class UseBuffer {

	// 1. 읽기
	public String read(String filepath) {
		String result = "";
		
		// 1.1 파일 생성
		File file = new File(filepath);
		
		// 1.2 파일 스트림 열기
		try (FileInputStream fis = new FileInputStream(file)) {
			
			BufferedInputStream bis = new BufferedInputStream(fis);

			// 1.4 한번에 읽어서 담아둘 그릇의 사이즈 정한다.
			byte[] basket = new byte[1024];
			while(true) {
				// 더 이상 읽을 수 없으면 -1 return
				int flag = bis.read(basket, 0, basket.length);
				// 1.5 파일의 끝일 경우 read() 함수에서 -1 return
				// 따라서 break로 while 구문 종료
				if(flag==-1) break;
				result = result + new String(basket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 2. 쓰기
	public void write(String filepath, String content) {
		File file = new File(filepath);
//		FileOutputStream에 바로 path를 전달해도 되는데 File 인스턴스를 통해서 전달하는 이유는
//		우선 파일이 존재하는지 확인하기 위한 전처리를 하기 위해서
//		if(file.exists()) {

		try (FileOutputStream fos = new FileOutputStream(file)) {
			// 버퍼를 달아준다.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(content.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
