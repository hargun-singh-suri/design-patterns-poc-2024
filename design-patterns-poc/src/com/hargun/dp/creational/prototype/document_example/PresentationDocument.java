package com.hargun.dp.creational.prototype.document_example;

import java.util.ArrayList;
import java.util.List;

// Implement Concrete Prototypes
public class PresentationDocument implements DocumentPrototype {

	private List<String> slides = new ArrayList<>();

	public PresentationDocument(List<String> slides) {
		this.slides = slides;
	}

	@Override
	public DocumentPrototype cloneCurrentInstance() {
		List<String> clonedSlides = new ArrayList<>(getSlides());
		return new PresentationDocument(clonedSlides);
	}

	@Override
	public void display() {
		System.out.println("Displaying Presentation Document with Slides: " + slides);

	}

	public List<String> getSlides() {
		if (slides == null) {
			slides = new ArrayList<>();
		}
		return slides;
	}

}
