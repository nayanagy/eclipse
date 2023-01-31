package com.xworkz.octane.component;

import org.springframework.stereotype.Component;

@Component
public class PenComponent {
	public PenComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
