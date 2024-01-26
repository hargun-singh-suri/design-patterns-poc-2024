package com.hargun.dp.creational.abstractfactory.guiexample;

public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Window createWindow() {
		return new MacWindow();
	}

}
