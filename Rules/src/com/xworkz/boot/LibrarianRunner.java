package com.xworkz.boot;

import com.xworkz.follower.Readers;
import com.xworkz.governor.Librarian;
import com.xworkz.rules.LibraryRules;

public class LibrarianRunner {

	public static void main(String[] args) {
		LibraryRules libraryRules = new Readers();
		Librarian Librarian = new Librarian(libraryRules);
		Librarian.checking();

	}

}
