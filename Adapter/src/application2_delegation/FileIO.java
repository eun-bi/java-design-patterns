package application2_delegation;

import java.io.IOException;

// Main Ŭ������ �ʿ�� �ϴ� �޼ҵ带 ������ �߻�޼ҵ�
//'�ʿ�� �ϴ� ��'
public abstract class FileIO {
	
	public abstract void readFromFile(String filename) throws IOException;
	public abstract void writeToFile(String filename) throws IOException;
	public abstract void setValue(String key, String value);
	public abstract String getValue(String key);
	
}
