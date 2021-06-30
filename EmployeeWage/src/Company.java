
public class Company {


	public static int wagePerHour;
	public int numberofWorkingDays;
	public int maxHoursPerMonth;
	public String companyName;
	public int totalWage;
	
	public Company(int wagePerHour, int numberofWorkingDays, int maxHoursPerMonth, String companyName) {
		super();
		Company.wagePerHour = wagePerHour;
		this.numberofWorkingDays = numberofWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.companyName = companyName;
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
}
