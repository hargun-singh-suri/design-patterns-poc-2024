package com.hargun.dp.creational.abstractfactory.guiexample;

// Concrete Factory for Windows
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Window createWindow() {
		return new WindowsWindow();
	}

}
