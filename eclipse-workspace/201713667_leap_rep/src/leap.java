import java.util.Scanner;
public class leap {
	public static void main(String[] args) {

		
		while(true) {
			
			System.out.println("������ �Է��Ͻÿ�.");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			if(year<0) {
				System.out.println("0���� ���� ���ڰ��ԷµǾ� �ý����� �����մϴ�.");
				break;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "���� ����");
			} else {
				System.out.println(year + "���� ���");
			}
		}
	}
}