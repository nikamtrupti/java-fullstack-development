
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class EmployeeAgePlan {
	public static LocalDate RetirementDate(LocalDate join) {
        int retire = 58;
        return join.plusYears(retire);
    }
    public static boolean	EligibleToJoin(LocalDate birthDate, LocalDate join) {
        int minimumAge = 18;
        Period age = Period.between(birthDate, join);
        return age.getYears() >= minimumAge;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 System.out.println("Enter Employee's Birth Date (dd-MM-yyyy): ");
		 String birthDateInput = sc.nextLine();
		 LocalDate birthDate = LocalDate.parse(birthDateInput, dateFormatter);
		 
		 System.out.println("Enter Employee's Date of Joining (dd-MM-yyyy): ");
		 String joiningDateInput = sc.nextLine();
		 LocalDate join = LocalDate.parse(joiningDateInput, dateFormatter);

		     if (EligibleToJoin(birthDate, join)) {
		     LocalDate retirementDate = RetirementDate(join);
		     System.out.println("Employee retirement date: " + retirementDate.format(dateFormatter));
		     } else {
		     System.out.println("EmployeE not eligible to join. Minimum joining age is 18 years");
		        }
		    	}
			}

