
public class EmployeeWageBuilder {


	public static final int isFullTime =1;
	public static final int isPartTime =2;
	
	
	private int numOfCompany =0;
	private Company[] companyEmpWageArray;
	
	public EmployeeWageBuilder() {
		companyEmpWageArray = new Company[5];
	}
	
	private void addCompany(int wagePerHour, int numberofWorkingDays, int maxHoursPerMonth, String companyName) {
		companyEmpWageArray[numOfCompany]=new Company(wagePerHour, numberofWorkingDays, maxHoursPerMonth, companyName);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i<numOfCompany; i++) {
			companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	
	private int computeEmpWage(Company companyWageArray) {
		int empHours=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		while(totalEmpHours<=companyWageArray.maxHoursPerMonth && totalWorkingDays< companyWageArray.numberofWorkingDays) {
			totalWorkingDays++;
			int option=(int)Math.floor(Math.random()*10%3);
			switch(option) {
			case isFullTime:
				empHours =8;
				break;
			case isPartTime:
				empHours =4;
				break;
				default:
					empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day#: "+totalWorkingDays+"Emp Hours: "+empHours);
		}
		return totalEmpHours*Company.wagePerHour;
		
	}
	public static void main(String[] args) {
		
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompany(20, 25, 100, "Reliance");
		empWageBuilder.addCompany(15, 28, 110, "BSNL");
		empWageBuilder.computeEmpWage();
		
		
	}

}
