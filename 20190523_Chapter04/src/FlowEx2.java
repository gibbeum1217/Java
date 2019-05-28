import java.util.Scanner; // Scanner 클래스를 사용하기 위해 추가

/*괄호{}를 아용해서 여러 문장을 하나의 단위로 묶을 수 있는데, 이것을 블럭(block)이라고 한다
블럭은 {로 시작해서 }로 끝나는데 다음에 문장의 끝을 의미하는 ;을 붙이지 않는다는 것에 주의하자.
블럭내의 문장들은 탭으로 들여쓰기를 해서 블럭안에 속한 문장이라는것을 알기 쉽게 해주는것이 좋다.

if(score > 60)
{
	
	System.out.println("합격입니다.");
}
*/

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);  //System.in은 암기. Scanner클래스타입. 콘솔창에서 뭔가 입력을 받아오는 객체
		String tmp = scanner.nextLine();   // 화면을 통해 입력받은 내용을 tmp에 저장. nextLine은 문자열 한줄 입력
		input = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
		
		//별: Integer는 int를 감싸주는 wrapper객체
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
			
			
		}
		
		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		
		
		
	}	

}
