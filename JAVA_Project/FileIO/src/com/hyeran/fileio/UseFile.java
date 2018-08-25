package com.hyeran.fileio;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 파일 클래스 알아보기
 * @author hyeran
 *
 */
public class UseFile {

	// 1. 파일의 정보
	public void info() {
		
		// 1.1 파일의 경로를 File 클래스의 생성자에 넘겨준다.
		// 가. 절대 경로
		String absPath = "/Temp/test.txt";
		// 나. 상대 경로(자바가 실행되는 경로부터 시작)
		String path = "newFile.txt";
		
		File file = new File(path);
		
		System.out.println(file.getName());
		System.out.println("파일 크기="+file.length());
		
		// 숫자로 반환된 날짜 > 형식 지정하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formattedDate = sdf.format(file.lastModified());
		System.out.println("작성시간="+formattedDate);
	}
	
	// 2. 디렉토리를 생성
	public void makeDir() {
		String dirPath = "/Temp/one/two";
		File dir = new File(dirPath);
		
		// 가. mkdir - 경로 상의 가장 마지막 디렉토리만 생성
		//dir.mkdir();
		// 나. mkdirs - 경로 상의 모든 디렉토리를 생성 (V)
		dir.mkdirs();
	}
	
	// 3. 파일을 생성
	public void makeFile() {
		String filePath = "/Temp/newOne.txt";
		File file = new File(filePath);
		
		try {
			if(file.createNewFile()) {
				System.out.println("파일이 정상적으로 생성되었습니다.");
			} else {
				System.out.println("파일이 생성되지 않았습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 4. 파라미터로 경로를 받아서 파일 생성하기
	// Overload
	public void makeFile(String abspath) {
		// 1. 경로 상의 디렉토리를 검사하고 없으면 생성해준다.
		
		// 1.1 디렉토리 문자열 추출
		// /Temp/newDir/new2/file.txt
		// 0
		// 마지막 /전까지가 디렉토리
		String dirPath = abspath.substring(0, abspath.lastIndexOf("/"));
		
		// 1.2 디렉토리가 존재하는 지 검사하고 없으면 생성
		File dir = new File(dirPath);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		// 2. 파일을 생성
		File file = new File(abspath);
		try {
			if(file.createNewFile()) {
				System.out.println(file.getName()+" 파일이 정상적으로 생성되었습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
