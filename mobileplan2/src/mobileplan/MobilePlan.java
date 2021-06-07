package mobileplan;

public class MobilePlan {

	public final double CallCharges;
	public final double smsCharges;
	public final int MonthlyCharges;
	public final char plan;
	public final double GST = 0.125;
	double bill = 0;
	int calls;
	int sms;

	public MobilePlan(char plan, double callCharges, double smsCharges, int monthlyCharges, int calls, int sms) {
		super();
		this.plan = plan;
		CallCharges = callCharges;
		this.smsCharges = smsCharges;
		MonthlyCharges = monthlyCharges;

		this.calls = calls;
		this.sms = sms;
	}

	public static void menu() {
		System.out.println("Plese enter a choice");
		System.out.println("1: To scbscribe Plan-A");
		System.out.println("2: To scbscribe Plan-B");
		System.out.println("3: To scbscribe Plan-C");
		System.out.println("4: To exit");
	}

	public void smsBill() {
		if (calls <= 50) {
			System.out.println("First 50 SMS FREE!!!!");

		}

		if (sms > 50 && sms <= 100) {

			bill += (sms - 50) * smsCharges / 2;
			double bill1 = (sms - 50) * smsCharges / 2;
			System.out.println("First 50 SMS FREE!!!!");
			System.out.println("Remaining " + (sms - 50) + " SMS bill @50% discount:" + bill1);

		}

		if (sms > 100) {

			bill += (50 * smsCharges / 2) + (sms - 100) * smsCharges;
			double bill2 = (sms - 100) * smsCharges;
			System.out.println("First 50 SMS FREE!!!!");
			System.out.println("Next 50 SMS bill @50% discount: " + (50 * smsCharges / 2));
			System.out.println("Remaining " + (sms - 100) + " SMS bill:" + bill2);

		}

	}

	public void callsBill() {
		if (calls <= 50) {
			System.out.println("First 50 calls FREE!!!!");

		}

		if (calls > 50 && calls <= 100) {

			bill += (calls - 50) * 0.5;
			System.out.println("First 50 calls FREE!!!!");
			System.out.println("Remaining " + (calls - 50) + " calls bill @50% discount:" + bill);

		}

		if (calls > 100) {

			bill += (50 * CallCharges / 2) + (sms - 100) * CallCharges;
			double bill2 = (calls - 100) * CallCharges;
			System.out.println("First 50 calls FREE!!!!");
			System.out.println("Next 50 calls bill @50% discount:" + 50 * CallCharges / 2);
			System.out.println("Remaining " + (calls - 100) + " calls bill :" + bill2);

		}

	}

	public void netBill() {
		double Totalbill = MonthlyCharges + bill;
		double netgst = Totalbill * GST;
		double netbill = Totalbill + netgst;
		System.out.println("Total bill: " + Totalbill + " GST: " + netgst);
		System.out.println("Total bill after 12.5% GST: " + netbill);

	}

	@Override
	public String toString() {
		return "Plan_" + plan + " [MonthlyCharges=" + MonthlyCharges + ", CallCharges=" + CallCharges + ", smsCharges="
				+ smsCharges + "]";
	}

}