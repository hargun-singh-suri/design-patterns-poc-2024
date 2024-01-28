package com.hargun.dp.creational.builder.manufacturingsystem_example;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle {

	private Set<String> parts = new HashSet<>();

	public void addPart(String partName) {
		parts.add(partName);
	}

	public void showParts() {
		parts.forEach(part -> {
			System.out.println(part);
		});
	}

}
