package com.hargun.dp.creational.prototype.document_example;

import java.util.ArrayList;
import java.util.List;

// Implement Concrete Prototypes
public class ReportDocument implements DocumentPrototype {

	private List<String> sections = new ArrayList<>();

	public ReportDocument(List<String> sections) {
		this.sections = sections;
	}

	@Override
	public DocumentPrototype cloneCurrentInstance() {
		List<String> clonedSections = new ArrayList<>(getSections());
		return new ReportDocument(clonedSections);
	}

	@Override
	public void display() {
		System.out.println("Displaying Report Document with Sections: " + sections);
	}

	public List<String> getSections() {
		if (sections == null) {
			sections = new ArrayList<>();
		}
		return sections;
	}
}
