package DAY2;
import java.util.*;
public class Hospital_admission {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if((age<=19)&&(age>=8))
				System.out.println("Meet normal doctor");
			else if((age>=20)&&(age<=25))
				System.out.println("Nurse");
			else if((age<30)&&(age>=23)) 
			System.out.println("Doctor");
			else if((age>=30)&&(age<=35))
				System.out.println("Chief Doctor");
			else
				System.out.println("Patient");

		}

	}


