import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);  //�Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����   ��: ���ڿ��� ����� ���ڴ� '���ڿ�.charAt(index)'�� �����ü� �ִ´�
		//index�� ���ӵ� ���������� 1�̾ƴ� 0���� �����Ѵ�.
		
		switch(gender) {
		
			case '1': case '3':
				System.out.println("����� �����Դϴ�.");
				break;
			case '2': case '4':
				System.out.println("����� �����Դϴ�.");
				break;
				
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
	}
}
