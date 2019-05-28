import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� user�� ����
		int com = (int)(Math.random() * 3)+1;   // 1,2,3�� �ϳ��� com�� �����
		
		
		/*
		 * ����(������ ��)�� ��� ���ؼ��� Math.random()�� ����ؾ� �ϴµ�, �� �޼���� 0.0.�� 1.0������ ������ ���ϴ� �ϳ���
		 * double���� ��ȯ�Ѵ� 0.0�� ������ ���Եǰ� 1.0�� ���Ե��� �ʴ´�. 0.0<=Math.random()<1.0
		 * 
		 * ���� 1�� 3������ ������ ���ϱ⸦ ���Ѵٸ�, ������ ���� �������� ������ ���ϴ� ���� ���� �� �ִ�
		 * 
		 * 1. �� ���� 3�� ���Ѵ�
		 * 
		 * 0.0 * 3<=Math.random()*3<1.0*3 0.0<=Math.random()*3<3.0
		 * 
		 * 2. �� ���� int������ ��ȯ�Ѵ� (int)0.0 <=(int)(Math.random()*3<(int)3.0
		 * 0<=(int)(Math.random()*3)<3
		 * 
		 * 3. ������ 1�� ���Ѵ� 0+1 <=(int)(Math.random()*3)+1<3+1
		 * 1<=(int)(Math.random()*3)+1<4
		 * 
		 * ������ 1�� 3������ ���� �� �ϳ��� ���� �� �ִ�. 1�� ���Եǰ� 4�� ���Ե��� �ʴ´�.
		 */
		
		System.out.println("�����"+user+"�Դϴ�.");
		System.out.println("����"+com+"�Դϴ�.");
		
		switch(user-com) {
		
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
			
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
			
		case 0:
			System.out.println("�����ϴ�.");
			break; //������ �����̹Ƿ� break�� ����� �ʿ䰡 ����. 
		}
		
	}
}
