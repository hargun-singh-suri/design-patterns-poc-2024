package com.hargun.dp.creational.prototype.document_example;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditingApp {

	public static void main(String args[]) {
		List<String> reportSections = new ArrayList<>(List.of("Introduction", "Analysis", "Conclusion"));
		DocumentPrototype reportDocument = new ReportDocument(reportSections);

		List<String> presentationSlides = new ArrayList<>(List.of("Title Slide", "Content Slide 1", "Content Slide 2"));
		DocumentPrototype presentationDocument = new PresentationDocument(presentationSlides);

		DocumentPrototype clonedReportDocument = reportDocument.cloneCurrentInstance();
		DocumentPrototype clonedPresentationDocument = presentationDocument.cloneCurrentInstance();

		((ReportDocument) clonedReportDocument).getSections().add("Stats");
		((PresentationDocument) clonedPresentationDocument).getSlides().add("Thank you slide");

		System.out.println("Original Documents");
		reportDocument.display();
		presentationDocument.display();
		System.out.println("--------------------");
		System.out.println("Cloned Documents (Actual data with some added details)");
		clonedReportDocument.display();
		clonedPresentationDocument.display();

	}

	// Output -
	
	// Original Documents
	// Displaying Report Document with Sections: [Introduction, Analysis,
	// Conclusion]
	// Displaying Presentation Document with Slides: [Title Slide, Content Slide 1,
	// Content Slide 2]
	// --------------------
	// Cloned Documents (Actual data with some added details)
	// Displaying Report Document with Sections: [Introduction, Analysis,
	// Conclusion, Stats]
	// Displaying Presentation Document with Slides: [Title Slide, Content Slide 1,
	// Content Slide 2, Thank you slide]
}
