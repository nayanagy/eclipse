package com.xworkz.governor;

import com.xworkz.rules.BankRules;

public class RBI {

	private BankRules bank;

	public RBI() {
		System.out.println("Default constructor of RBI");
	}

	public RBI(BankRules bank) {
		this.bank = bank;
	}

	public void checking() {
		System.out.println("running wearMask and balance");
		if (this.bank != null) {
			boolean check = this.bank.wearMask();
			double check1 = this.bank.balance();
			{
				if (check == true && check1 == 200000) {
					System.out.println("KarnatakaBank follow the rules");
				} else {
					System.out.println("KarnatakaBank not follow the rules");
				}
			}
		}
	}

}
