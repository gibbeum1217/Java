import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);  //입력받은 번호의 8번째 문자를 gender에 저장   별: 문자열에 저장된 문자는 '문자열.charAt(index)'로 가져올수 있는대
		//index는 연속된 정수값으로 1이아닌 0부터 시작한다.
		
		switch(gender) {
		
			case '1': case '3':
				System.out.println("당신은 남자입니다.");
				break;
			case '2': case '4':
				System.out.println("당신은 여자입니다.");
				break;
				
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		
	}
}
