package com.hargun.dp.creational.abstractfactory.guiexample;

/*
 * Concrete Products for Window
 */
public class WindowsWindow implements Window {

	@Override
	public void render() {
		System.out.println("Windows window");
	}

}
