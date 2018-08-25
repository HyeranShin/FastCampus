package com.hyeran.fileio;
import java.io.IOException;
import java.nio.file.Files;
/*
 * IO = Input Output
 * NIO = New Input Output
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UsePath {
	
	// 1. 읽기
	public String read(String filepath) {
		String result = "";
		// 1.1 Path 선언하기
		Path path = Paths.get(filepath);
		try {
			// 1.2 Path로 파일 읽어서 List에 줄 단위로 저장
			List<String> lines = Files.readAllLines(path);
			// 1.3 향상된 for문으로 한 줄씩 읽어서 result 변수에 더하기
			for(String line : lines) {
				result = result + line + "\r\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 2. 쓰기
	public void write(String filepath, String content) {
		// 2.1 Path 만들기
		Path path = Paths.get(filepath);
		// 2.2 Path로 파일 쓰기
		try {
			Files.write(path, content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
