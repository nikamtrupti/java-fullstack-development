import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter Formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter your date of birth(yyyy-MM-dd):");
		String dobInput=sc.next();
		try {
			LocalDate dateOfBirth=LocalDate.parse(dobInput, Formatter);
			LocalDate currentDate=LocalDate.now();
			Period age=Period.between(dateOfBirth, currentDate);
			System.out.println("Your current age is :"+age.getYears()+"years,"+age.getMonths()+"months,"+age.getDays()+"days");
			
		}catch(DateTimeParseException e) {
			System.out.println("Invalid date format.Please use yyyy-MM-dd.");
		}

	}

}
