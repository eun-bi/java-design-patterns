package application1_inheritance;

import java.io.IOException;

// Main 클래스가 필요로 하는 메소드를 선언한 인터페이스 
//'필요로 하는 것'
public interface FileIO {
	
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value);
	public String getValue(String key);
	
}
