import java.util.Scanner;
public class leap {
	public static void main(String[] args) {

		
		while(true) {
			
			System.out.println("연도를 입력하시오.");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			if(year<0) {
				System.out.println("0보다 작은 숫자가입력되어 시스템을 종료합니다.");
				break;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "년은 윤년");
			} else {
				System.out.println(year + "년은 평년");
			}
		}
	}
}