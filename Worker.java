//Write a class Worker and derive classes DailyWorker and SalariedWorker from
//it. Every worker has a name and a salary rate. Write method ComPay (int
//hours) to compute the week pay of every worker. A DailyWorker is paid on the
//basis of the number of days he/she works. The SalariedWorker gets paid the
//wage for 40 hours a week, no matter what the actual hours are. Test this
//program to calculate the pay of workers.
package exp1;
public class Worker {
	protected String name;
	protected double salaryRate;

	public Worker(String name, double salaryRate) {
		this.name = name;
		this.salaryRate = salaryRate;
	}

	public double computePay(int hours) {
		// Default implementation for workers (hourly pay)
		return hours * salaryRate;
	}
}

class DailyWorker extends Worker {
	private int daysWorked;

	public DailyWorker(String name, double salaryRate, int daysWorked) {
		super(name, salaryRate);
		this.daysWorked = daysWorked;
	}

	@Override
	public double computePay(int hours) {
		// Daily workers are paid based on the number of days worked
		return daysWorked * salaryRate;
	}
}

class SalariedWorker extends Worker {
	public SalariedWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}

	@Override
	public double computePay(int hours) {
		// Salaried workers are paid a fixed wage for 40 hours a week
		return 40 * salaryRate;
	}
}
