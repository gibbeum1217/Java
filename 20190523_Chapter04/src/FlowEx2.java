import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ���� �߰�

/*��ȣ{}�� �ƿ��ؼ� ���� ������ �ϳ��� ������ ���� �� �ִµ�, �̰��� ��(block)�̶�� �Ѵ�
���� {�� �����ؼ� }�� �����µ� ������ ������ ���� �ǹ��ϴ� ;�� ������ �ʴ´ٴ� �Ϳ� ��������.
������ ������� ������ �鿩���⸦ �ؼ� ���ȿ� ���� �����̶�°��� �˱� ���� ���ִ°��� ����.

if(score > 60)
{
	
	System.out.println("�հ��Դϴ�.");
}
*/

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);  //System.in�� �ϱ�. ScannerŬ����Ÿ��. �ܼ�â���� ���� �Է��� �޾ƿ��� ��ü
		String tmp = scanner.nextLine();   // ȭ���� ���� �Է¹��� ������ tmp�� ����. nextLine�� ���ڿ� ���� �Է�
		input = Integer.parseInt(tmp); //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		//��: Integer�� int�� �����ִ� wrapper��ü
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			
			
		}
		
		if(input!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
		
		
		
	}	

}
