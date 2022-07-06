import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x;
		char y;
		double z;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		y = sc.next().charAt(0);
		sc.nextLine();
		z = sc.nextDouble();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Os valores digitados foram: ");
		System.out.println(x);
		System.out.println(y);
		System.out.printf ("%.2f %n", z);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}