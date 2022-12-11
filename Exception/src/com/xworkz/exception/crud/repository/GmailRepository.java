package com.xworkz.exception.crud.repository;

public interface GmailRepository {
	boolean create(String gmail);

	default int totalGmails() {
		return 10;

	}

}
