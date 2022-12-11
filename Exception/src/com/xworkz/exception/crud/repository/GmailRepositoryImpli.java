package com.xworkz.exception.crud.repository;

import com.xworkz.exception.crud.customException.GmailSizeExceededException;

public class GmailRepositoryImpli implements GmailRepository {

	private String[] gmails = new String[10];
	private int gmailIndex = 0;

	@Override
	public boolean create(String gmail) {
		System.out.println("running create gmail repo");
		if (this.gmailIndex > this.gmails.length) {
			throw new GmailSizeExceededException();
		}
		this.gmails[gmailIndex] = gmail;
		this.gmailIndex++;
		return false;
	}

	@Override
	public int totalGmails() {
		System.out.println("running totalGmails");
		return GmailRepository.super.totalGmails();

	}

}
