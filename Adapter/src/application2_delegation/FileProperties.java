package application2_delegation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//adapter ������ �ϴ� Ŭ����
//FileIO�� �߻� Ŭ������ �����Ͽ��� ������,
//FileIO Ŭ������ Properties Ŭ������ �� �� ��ӹ��� �� ���� (�ڹٴ� ���߻���� ���� x)
//���� ������ ���
public class FileProperties extends FileIO{

	private Properties properties; 	// Properties �� �ν��Ͻ�

	//��ü ������ ���� ������
	public FileProperties(){
		this.properties = new Properties();
	}
	
	@Override
	public void readFromFile(String filename) throws IOException {
		// Properties Ŭ�������� �����ϴ� �޼ҵ� ȣ��
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
