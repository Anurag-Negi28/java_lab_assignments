package exp1;

public class Must {
	public static void main(String[] args) {
		// Creating instances of different workers
		Worker hourlyWorker = new Worker("Hourly Worker", 15.0);
		DailyWorker dailyWorker = new DailyWorker("Daily Worker", 200.0, 5); // Worked for 5 days
		SalariedWorker salariedWorker = new SalariedWorker("Salaried Worker", 500.0);

		int hoursWorked = 50; // For demonstration purposes

		// Calculating and printing the weekly pay for each worker
		System.out.println("Weekly pay for Hourly Worker: " + hourlyWorker.computePay(hoursWorked));
		System.out.println("Weekly pay for Daily Worker: " + dailyWorker.computePay(hoursWorked));
		System.out.println("Weekly pay for Salaried Worker: " + salariedWorker.computePay(hoursWorked));
	}
}
