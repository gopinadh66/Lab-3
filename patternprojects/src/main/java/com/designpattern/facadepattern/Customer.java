package com.designpattern.facadepattern;

public class Customer {
	public static void main(String[] args) {
		
		SalesManager slman = new SalesManager();
		
		slman.showWoodClosetTypes();
		slman.ShowClosetTypes();
		slman.ShowWoodTypes();
	}
}
