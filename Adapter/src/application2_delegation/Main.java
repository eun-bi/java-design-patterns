package application2_delegation;

import java.io.IOException;

import application1_inheritance.FileIO;
import application1_inheritance.FileProperties;

public class Main {

	public static void main(String[] args) {

		/* ex2) ������ �̿��� Adapter ����
		 * "������Ƽ�̸�=��" ������ ������ ���� ���Ϸκ��� 
		 * ���� �о���ų� �����ϴµ� ���Ǵ� Ŭ������ java.util.Properties��
		 * �̿��� ������ �а� ���� ���α׷�
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
