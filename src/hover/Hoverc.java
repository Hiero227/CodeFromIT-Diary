package hover;

public class Hoverc {
	int price = 2000000;
	int insurance = 1000000;
	int profit = 3000000;
	int outcome = 0;

	String profitPerMonth(int bought) {

		outcome += bought * (profit) - insurance - 10 * price;
		if (outcome < 0) {
			return "Seš žebrák kriple s dluhem Gabenovi: " + outcome;
		} else if (outcome > 0) {
			return "Seš Gaben s profitem: " + outcome;
		} else {
			return "Nemáš ani vindru.";
		}
	}
}