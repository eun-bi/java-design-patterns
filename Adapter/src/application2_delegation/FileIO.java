package application2_delegation;

import java.io.IOException;

// Main 클래스가 필요로 하는 메소드를 선언한 추상메소드
//'필요로 하는 것'
public abstract class FileIO {
	
	public abstract void readFromFile(String filename) throws IOException;
	public abstract void writeToFile(String filename) throws IOException;
	public abstract void setValue(String key, String value);
	public abstract String getValue(String key);
	
}
