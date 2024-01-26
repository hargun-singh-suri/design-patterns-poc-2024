package com.hargun.dp.creational.abstractfactory.guiexample;

public class Application {
	private GUIFactory factory;
	private Button button;
	private Window window;

	public void createUI() {
		button.paint();
		window.render();
	}

	public Application(GUIFactory factory) {
		super();
		this.factory = factory;
		this.button = factory.createButton();
		this.window = factory.createWindow();
	}

	public static void main(String[] args) {
		GUIFactory windowsFactory = new WindowsFactory();
		Application windowsApp = new Application(windowsFactory);
		windowsApp.createUI();

		GUIFactory macFactory = new MacFactory();
		Application macApp = new Application(macFactory);
		macApp.createUI();
	}

	/**
	 * Windows Button
	 * 
	 * Windows window
	 * 
	 * MAC Button
	 * 
	 * MAC window
	 * 
	 */
}
