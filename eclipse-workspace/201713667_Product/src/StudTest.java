import java.util.Arrays;
public class StudTest {

   public static void main(String[] args) {
      Student[] a = {
            new Student(14069, "��**", "����",3),new Student(12051, "Ȳ**", "�濵",4),
            new Student(15220, "��**", "������",2),new Student(12481, "��**", "����",4),
            new Student(15505, "��**", "����",2),new Student(16962, "��**", "����",1),
            new Student(15376, "��**", "��ǻ��",2),new Student(16420, "��**", "����",2),
            new Student(11293, "��**", "��ǻ��",4),new Student(10184, "��**", "�濵",3),
            new Student(14758, "��**", "��ǻ��",2)
      };
      Arrays.sort(a);
      print(a,"ID");
      Arrays.sort(a, Student.WITH_DEPT);
      print(a,"�а�");
      Arrays.sort(a, Student.WITH_NAME);
      print(a,"�̸�");
      Arrays.sort(a, Student.WITH_GRADE);
      print(a,"�г�");

   }

   public static void print(Student[] std, String srt) {
      System.out.println("===================================");
      System.out.println(srt);
      for(Student s : std) {
         System.out.println(s.toString());
      }
   }
} 