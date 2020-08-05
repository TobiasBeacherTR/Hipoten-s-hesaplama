package hipotenüs;
import java.util.Scanner;
public class hipotenüs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Dik üçgenin bir kenar uzunluðunu giriniz : ");
		double x=scanner.nextDouble();
		System.out.print("Dik üçgenin 2.kenar uzunluðunu giriniz :");
		double y=scanner.nextDouble();
		double z=(Math.pow(x,2)+Math.pow(y, 2));
		double h=Math.sqrt(z);
		System.out.println("Hipotenüs uzunluðu = " + h);
	}

}
