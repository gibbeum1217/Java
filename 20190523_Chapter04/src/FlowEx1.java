
//제어문: 프로그램의 흐름을 바꾸는 역할을 하는 문장들
//제어문종류: 조건문과 반복문

//조건문: 조건에 따라 다른 문장이 수행됨
//반복문: 특정 문장들을 반복해서 수행



/*
 
  
조건문: if, switch 문
주로 if문이 많이 사용된다
처리할 경우의 수가 많을 때는 if문보다 switch문이 효율저이지만, switch문은 if문보다 제약이 많다.abstract

if(조건식) {
 	
  // 조건식이 참일때 수행될 문장들을 적는다. 

}


*/
public class FlowEx1 {

	public static void main(String[] args) {

		int x = 0;
		System.out.printf("x=%d일때, 참인 것은%n",  x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x=1;
		
		System.out.printf("x=%d일때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		
		
	}

}
