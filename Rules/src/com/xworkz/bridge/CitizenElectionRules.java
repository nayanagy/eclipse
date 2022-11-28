package com.xworkz.bridge;

import com.xworkz.rules.ElectionRules;

public class CitizenElectionRules implements ElectionRules {

	@Override
	public boolean voterid() {

		return false;
	}

	@Override
	public boolean above18() {

		return false;
	}

	@Override
	public int wardNo() {

		return 0;
	}

	@Override
	public boolean que() {

		return false;
	}

	@Override
	public int votesPerPerson() {

		return 0;
	}

}
