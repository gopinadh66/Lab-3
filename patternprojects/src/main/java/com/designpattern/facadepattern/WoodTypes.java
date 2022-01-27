package com.designpattern.facadepattern;

public class WoodTypes implements ProductCatalogue {

	public String showProducts() {
		System.out.println("Bamboo");
		System.out.println("Cedar");
		System.out.println("Celtis");
		return "Bamboo";
	}

}
