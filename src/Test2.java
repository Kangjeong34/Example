import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	
	
	Scanner k = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	
	while (true) {
		int x = k.nextInt();
		if(x % 2 == 1) {
			System.out.println(x);
			break;
		}else {
			System.out.print("숫자를 다시입력하세요 : ");
		}
		
	}
	
	

}
}
