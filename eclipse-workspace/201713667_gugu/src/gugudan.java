import java.util.Scanner;

class InputKey
{
    public static void main(String[] args)
    {
        
        System.out.print("���ϴ� ���� �Է��ϼ��� : ");
        Scanner sc = new Scanner(System.in); //Ű����κ��� �Է� �ޱ�  
        int n = sc.nextInt(); //Ű����κ��� ������ ���� �Է¹޾� n�� ����
        for(int i=1; i<=9; i++) // �������� a*i �����̹Ƿ� i�ǰ��� 1~9���� �ݺ����� 
        {
            System.out.println(n+"*"+i+"="+(n*i));// n=Ű����κ��� �Է¹��� ����, i=1~9
        }
    }
}