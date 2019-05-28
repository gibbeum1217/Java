import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt(); //화면을 통해 입력받은 숫자를 user에 저장
		int com = (int)(Math.random() * 3)+1;   // 1,2,3중 하나가 com에 저장됨
		
		
		/*
		 * 난수(임의의 수)를 얻기 위해서는 Math.random()을 사용해야 하는데, 이 메서드는 0.0.과 1.0사이의 범위에 속하는 하나의
		 * double값을 반환한다 0.0은 범위에 포함되고 1.0은 포함되지 않는다. 0.0<=Math.random()<1.0
		 * 
		 * 만일 1과 3사이의 정수를 구하기를 원한다면, 다음과 같은 과정으로 난수를 구하는 식을 얻을 수 있다
		 * 
		 * 1. 각 변에 3을 곱한다
		 * 
		 * 0.0 * 3<=Math.random()*3<1.0*3 0.0<=Math.random()*3<3.0
		 * 
		 * 2. 각 변을 int형으로 변환한다 (int)0.0 <=(int)(Math.random()*3<(int)3.0
		 * 0<=(int)(Math.random()*3)<3
		 * 
		 * 3. 각변에 1을 더한다 0+1 <=(int)(Math.random()*3)+1<3+1
		 * 1<=(int)(Math.random()*3)+1<4
		 * 
		 * 이제는 1과 3사이의 정수 중 하나를 얻을 수 있다. 1은 포함되고 4는 포함되지 않는다.
		 */
		
		System.out.println("당신은"+user+"입니다.");
		System.out.println("컴은"+com+"입니다.");
		
		switch(user-com) {
		
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
			
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
			
		case 0:
			System.out.println("비겼습니다.");
			break; //마지막 문장이므로 break를 사용할 필요가 없다. 
		}
		
	}
}
