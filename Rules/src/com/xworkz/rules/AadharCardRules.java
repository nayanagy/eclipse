package com.xworkz.rules;

public interface AadharCardRules {

	long mblno();

	String idProof();

	boolean validAddress();

	boolean photo();

	boolean fingerprint();

}
