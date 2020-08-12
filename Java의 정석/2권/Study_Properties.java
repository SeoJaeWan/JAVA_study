package hi2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Study_Properties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
	
	// 	Iterator 의 구버전 Enumeration
		Enumeration e = prop.propertyNames();	// 목록의 모든 key가 담긴 Enumeration을 반환
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + " = " + prop.getProperty(element));
		}
		
		System.out.println();
		
		prop.setProperty("size", "20");
		System.out.println("size = " + prop.getProperty("size"));
		System.out.println("capacity = " + prop.getProperty("capacity","20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor","0.75"));
		
		System.out.println(prop);
		
		prop.list(System.out);
		
	//	외부 파일 읽어오기
		
		Properties propIn = new Properties();
		String inputFile = "받아올 파일 이름";
		
		try {
			propIn.load(new FileInputStream(inputFile));     // 받아온 파일을 proper에 입력
		}catch (Exception ex){
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		String name = propIn.getProperty("name");
		
		try {
			name = new String(name.getBytes("8859_1"),"EUC-KR");	// 입력받은 name이 한글일 경우 꺠질 수 있기 떄문에
		}catch (Exception ex) {                                     // 읽어온 데이터의 인코딩을 라틴문자집합(8859_1)에서
			 														// 한글 완성형(EUC-KR)으로 변환해주는 과정
		}
		
	//	파일 외부에 저장하기
		
		Properties propOut = new Properties();
		
		propOut.setProperty("timeout", "30");
		propOut.setProperty("language", "한글");
		propOut.setProperty("capacity", "10");
		propOut.setProperty("size", "10");
		
		try {
			propOut.store(new FileOutputStream("output.txt"),"Properties Example");       // 텍스트 파일로 저장
		
			propOut.storeToXML(new FileOutputStream("output.xml"), "Properties Example"); // XML 파일로 저장
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
}
