
/*if문의 블럭 내에 또다른 if문을 포함시키는 것이 가능한데 이것을 중첩 if문이라고 부르며 중첩의 횟수에는 거의 제한이 없다


if(조건식1) {
	조건식1의 연산결과가 true일때 수행될 문장들을 적는다
	   if(조건식2) {
		    조건식1과 조건식2가 모두 true일때 수행될 문장들
	   }else {
		   조건식1이 true이고, 조건식2가 false일때 수행되는 문장들
	   }
}else {
	조건식1이 flase일때 수행되는 문장들
}*/

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner (System.in);
		score = scanner.nextInt(); //화면을 통해 입력받을 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
		if(score >= 90) {       //score가 90점 보다 같거나 크면 A학점(grade)
			grade = 'A';
			if(score>=98) {                //90점 이상 중에서도 98점 이상은 A+
				opt = '+';                  
			}else if(score<94) {             //90점 이상 94점 미만은 A-
				opt = '-';
			}
			
			
		}else if(score>=80) {  //score가 80점 볻 같거나 크면 B학점
			grade='B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}
			
		}else { //나머지는 C학점
			grade='C';
			
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
		
		
		
	}
}



/*
 * else블럭이 생략되었는데 만일 생략되지않았다면 왼쪽과 같은 코드가 될것이다. 변수 opt를 선언할 때 이미 0으로 초기화했기 때문에 굳이
 * else블럭을 쓸 필요가 없는 것이다.
 * 
 * char opt ='0';
 * 
 * ...
 * 
 * if(score>=98) { opt = '+'; }else if(score<94) { opt='-'; }else { opt = '0'; }
 * }
 */