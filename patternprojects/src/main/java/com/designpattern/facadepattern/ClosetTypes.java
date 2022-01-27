package com.designpattern.facadepattern;

public class ClosetTypes implements ProductCatalogue{

	public String showProducts() {
		System.out.println("Linen");
		System.out.println("Utility");
		System.out.println("Pantry");
		return "Linen";
	}

}
