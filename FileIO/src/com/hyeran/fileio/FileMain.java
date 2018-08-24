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
//		UseFile useFile = new UseFile();
//		useFile.info();
		// 나. 파일 생성, 디렉토리 생성
//		useFile.makeDir();
//		useFile.makeFile();
//		useFile.makeFile("/Temp/newDir/new2/file.txt");
		
		// 2. Stream 사용
		// 스트림은 일반 변수와 다르게 열고 닫는 과정을 거친다.
//		UseStream stream = new UseStream();
		// 가. 파일 읽기
//		String content = stream.read("/Temp/test.txt");
//		System.out.println(content);
		// 나. 파일 쓰기
		// 줄바꿈
		// Linux: \n, Window: \r\n
		//String content = "Hello Wordl!!!\r\nGood to see you";
//		stream.write("/Temp/write.txt", content);
			
		// 3. Stream + Buffer 사용
		// Stream의 처리 속도를 향상시켜 준다. 100배 ~ 1000배까지
//		UseBuffer buffer = new UseBuffer();
//		String content = buffer.read("/Temp/test.txt");
//		System.out.println(content);
		
		// 4. Reader와 Writer 사용
		// Stream을 쓰기 쉽게 해주는 보조 클래스
		// 텍스트 파일을 읽고 쓰게 해준다.
		// 버퍼를 달아서 속도 향상 가능
//		UseReaderWriter urw = new UseReaderWriter();
//		urw.write("/Temp/test001.txt", "새로운 내용입니다.");
//		String content = urw.read("/Temp/test001.txt");
//		System.out.println(content);
		
		// 5. Path 사용 - JDK7 이상
		// Path는 위의 3가지보다 더 간편하게 파일을 처리 할 수 있게 해준다.
		UsePath path = new UsePath();
//		String content = path.read("/Temp/test.txt");
//		System.out.println(content);
		path.write("/Temp/test002.txt", "New Input Output!!!");
		
	}

}
