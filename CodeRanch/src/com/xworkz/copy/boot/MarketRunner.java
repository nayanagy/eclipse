package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Market;

public class MarketRunner {

	public static void main(String[] args) {

		String[] shops = { "Ayra", "Radhika" };
		int[] shopNos = { 25, 56 };
		int[] rents = { 45000, 5000 };
		String[] sales = { "50% off", "buy 2 get 1 free" };
		String[] address = { "Mysore", "Bangalore" };
		int[] team_no = { 1, 3 };

		Market market = new Market("Akshata", 95, 9449498840l, "akshata@gmail.com", "banglore", shops, shopNos, rents,
				sales, address, team_no);
		market.display();
	}

}
