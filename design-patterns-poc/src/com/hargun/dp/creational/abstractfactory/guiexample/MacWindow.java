package com.hargun.dp.creational.abstractfactory.guiexample;

/*
 * Concrete Products for MAC
 */
public class MacWindow implements Window {

	@Override
	public void render() {
		System.out.println("MAC window");
	}

}
