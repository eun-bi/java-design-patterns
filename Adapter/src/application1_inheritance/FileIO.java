package application1_inheritance;

import java.io.IOException;

// Main Ŭ������ �ʿ�� �ϴ� �޼ҵ带 ������ �������̽� 
//'�ʿ�� �ϴ� ��'
public interface FileIO {
	
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value);
	public String getValue(String key);
	
}
