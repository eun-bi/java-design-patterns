package application2_delegation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//adapter 역할을 하는 클래스
//FileIO를 추상 클래스로 선언하였기 때문에,
//FileIO 클래스와 Properties 클래스를 둘 다 상속받을 수 없음 (자바는 다중상속을 지원 x)
//따라서 위임을 사용
public class FileProperties extends FileIO{

	private Properties properties; 	// Properties 의 인스턴스

	//객체 생성을 위한 생성자
	public FileProperties(){
		this.properties = new Properties();
	}
	
	@Override
	public void readFromFile(String filename) throws IOException {
		// Properties 클래스에서 제공하는 메소드 호출
		properties.load(new FileInputStream(filename)); 
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		properties.store(new FileOutputStream(filename), "written by FileProperties");	
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value); 
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key, "");
	}

}
