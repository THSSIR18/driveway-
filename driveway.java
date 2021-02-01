//diveway with scanner
import java.util.Scanner;
public class driveway
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your Name ");
		String myName = sc.nextLine();
		System.out.print("Enter your driveway charge ");
		double drive = sc.nextDouble();
		System.out.print("Enter the number of driveways ");
		int num = sc.nextInt();
		
		double earning = num * drive;
		System.out.println("Owner: " + myName );
		System.out.println("Charge: " + drive );
		System.out.println("Num of driveways: " + num );
		System.out.println("Total: " + earning );
	}
}