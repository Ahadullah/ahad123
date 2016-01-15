import java.util.InputMismatchException;
import java.util.Scanner;


public class exception {

	public static void main(String[] args) {
		int a ,b;
		try {
		
			Scanner scan=new Scanner(System.in);
			System.out.print("inter integer no");
			a=scan.nextInt();
			System.out.print("inter integer no");
			b=scan.nextInt();
			a+=b;
			System.out.print("result"+a);
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.print("input miss match excetion");
			
		}

	}

}
