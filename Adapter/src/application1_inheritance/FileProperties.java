package application1_inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// adapter 역할을 하는 클래스
// 필요한 메소드는 FileIO에 정의된 메소드들인데
// 기본으로 제공되는 클래스인 java.util.Properties에서 제공하므로 
// Properties 클래스의 메소드를 재활용하는 Adapter 클래스
public class FileProperties extends Properties implements FileIO{

	@Override
	public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename)); // 상속받은 Properties 클래스에서 제공하는 메소드 호출
	}

	@Override
	public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
        setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
        return getProperty(key, "");
	}

}
