
/*if���� �� ���� �Ǵٸ� if���� ���Խ�Ű�� ���� �����ѵ� �̰��� ��ø if���̶�� �θ��� ��ø�� Ƚ������ ���� ������ ����


if(���ǽ�1) {
	���ǽ�1�� �������� true�϶� ����� ������� ���´�
	   if(���ǽ�2) {
		    ���ǽ�1�� ���ǽ�2�� ��� true�϶� ����� �����
	   }else {
		   ���ǽ�1�� true�̰�, ���ǽ�2�� false�϶� ����Ǵ� �����
	   }
}else {
	���ǽ�1�� flase�϶� ����Ǵ� �����
}*/

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("������ �Է����ּ���.>");
		
		Scanner scanner = new Scanner (System.in);
		score = scanner.nextInt(); //ȭ���� ���� �Է¹��� ������ score�� ����
		
		System.out.printf("����� ������ %d�Դϴ�. %n", score);
		
		if(score >= 90) {       //score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade = 'A';
			if(score>=98) {                //90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';                  
			}else if(score<94) {             //90�� �̻� 94�� �̸��� A-
				opt = '-';
			}
			
			
		}else if(score>=80) {  //score�� 80�� �� ���ų� ũ�� B����
			grade='B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}
			
		}else { //�������� C����
			grade='C';
			
		}
		
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
		
		
		
		
	}
}



/*
 * else���� �����Ǿ��µ� ���� ���������ʾҴٸ� ���ʰ� ���� �ڵ尡 �ɰ��̴�. ���� opt�� ������ �� �̹� 0���� �ʱ�ȭ�߱� ������ ����
 * else���� �� �ʿ䰡 ���� ���̴�.
 * 
 * char opt ='0';
 * 
 * ...
 * 
 * if(score>=98) { opt = '+'; }else if(score<94) { opt='-'; }else { opt = '0'; }
 * }
 */