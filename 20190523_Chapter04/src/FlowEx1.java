
//���: ���α׷��� �帧�� �ٲٴ� ������ �ϴ� �����
//�������: ���ǹ��� �ݺ���

//���ǹ�: ���ǿ� ���� �ٸ� ������ �����
//�ݺ���: Ư�� ������� �ݺ��ؼ� ����



/*
 
  
���ǹ�: if, switch ��
�ַ� if���� ���� ���ȴ�
ó���� ����� ���� ���� ���� if������ switch���� ȿ����������, switch���� if������ ������ ����.abstract

if(���ǽ�) {
 	
  // ���ǽ��� ���϶� ����� ������� ���´�. 

}


*/
public class FlowEx1 {

	public static void main(String[] args) {

		int x = 0;
		System.out.printf("x=%d�϶�, ���� ����%n",  x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x=1;
		
		System.out.printf("x=%d�϶�, ���� ����%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		
		
	}

}
