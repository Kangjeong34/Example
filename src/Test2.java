import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	
	
	Scanner k = new Scanner(System.in);
	System.out.print("���ڸ� �Է��ϼ��� : ");
	
	while (true) {
		int x = k.nextInt();
		if(x % 2 == 1) {
			System.out.println(x);
			break;
		}else {
			System.out.print("���ڸ� �ٽ��Է��ϼ��� : ");
		}
		
	}
	
	

}
}
