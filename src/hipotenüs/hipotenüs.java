package hipoten�s;
import java.util.Scanner;
public class hipoten�s {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Dik ��genin bir kenar uzunlu�unu giriniz : ");
		double x=scanner.nextDouble();
		System.out.print("Dik ��genin 2.kenar uzunlu�unu giriniz :");
		double y=scanner.nextDouble();
		double z=(Math.pow(x,2)+Math.pow(y, 2));
		double h=Math.sqrt(z);
		System.out.println("Hipoten�s uzunlu�u = " + h);
	}

}
