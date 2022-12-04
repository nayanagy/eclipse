package com.xworkz.governor;

import com.xworkz.rules.LibraryRules;

public class Librarian {
	private LibraryRules library;

	public Librarian() {
		System.out.println("default constructor of Librarian");
	}

	public Librarian(LibraryRules library) {
		this.library = library;
	}

	public void checking() {
		System.out.println("running wearMask and reading");
		if (this.library != null) {
			boolean check = this.library.wearMask();
			boolean check1 = this.library.reading();
			{
				if (check == true && check1 == true) {
					System.out.println("Readers follow the rules");
				} else {
					System.out.println("Readers not follow the rules");
				}
			}
		}
	}

}
