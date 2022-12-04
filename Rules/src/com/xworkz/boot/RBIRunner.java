package com.xworkz.boot;

import com.xworkz.follower.KarnatakaBank;
import com.xworkz.governor.RBI;
import com.xworkz.rules.BankRules;

public class RBIRunner {

	public static void main(String[] args) {
		BankRules bankRules = new KarnatakaBank();
		RBI RBI = new RBI(bankRules);
		RBI.checking();

	}

}
