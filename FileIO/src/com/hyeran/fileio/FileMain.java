package com.hyeran.fileio;

/**
 * Java File IO
 * @author hyeran
 *
 */
public class FileMain {

	public static void main(String[] args) {

		// 파일 입출력
		// IO: Input Output
		
		// 1. File 클래스 사용
		// 가. 파일의 정보를 읽는다.
		UseFile useFile = new UseFile();
		useFile.info();
		// 나. 파일 생성, 디렉토리 생성
//		useFile.makeDir();
//		useFile.makeFile();
		useFile.makeFile("/Temp/newDir/new2/file.txt");
		
		// 2. Stream 사용
		// 가. 파일을 읽고 쓴다.
		// - 일반 변수에 값을 입력하는 법
		String str = "aaa";
		// - Stream: 스트림은 일반 변수와 다르게 열고 닫는 과정을 거친다.
//		FileInputStream fis = new FileInputStream();
//		fis.open();
//		fis.write();
//		fis.close();
		
		// 3. Stream + Buffer 사용
		// Stream의 처리 속도를 향상시켜 준다. 100배 ~ 100배까지
		
		// 4. Reader와 Writer 사용
		// Stream을 쓰기 쉽게 해주는 보조 클래스
		
		// 5. Path 사용 - JDK7 이상
		// Path는 위의 3가지보다 더 간편하게 파일을 처리 할 수 있게 해준다.
		
	}

}
