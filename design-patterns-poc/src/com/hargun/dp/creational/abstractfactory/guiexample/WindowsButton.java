package com.hargun.dp.creational.abstractfactory.guiexample;

/*
 * Concrete Products for Window
 */
public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Windows Button");
	}

}
