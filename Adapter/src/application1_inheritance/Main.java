package application1_inheritance;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/* ex1) 상속을 이용한 Adapter 패턴
		 * "프로퍼티이름=값" 형식의 내용을 갖는 파일로부터 
		 * 값을 읽어오거나 설정하는데 사용되는 클래스인 java.util.Properties을
		 * 이용해 파일을 읽고 쓰는 프로그램
		 */
		
        FileIO f = new FileProperties();
        
        try {
            f.readFromFile("file.txt");
            f.setValue("year2", "2019");
            f.setValue("month", "1");
            f.setValue("day", "29");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
