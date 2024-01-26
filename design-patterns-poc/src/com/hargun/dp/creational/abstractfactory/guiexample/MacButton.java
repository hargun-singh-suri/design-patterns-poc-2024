package com.hargun.dp.creational.abstractfactory.guiexample;

/*
 * Concrete Products for MAC
 */
public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("MAC Button");
	}

}
