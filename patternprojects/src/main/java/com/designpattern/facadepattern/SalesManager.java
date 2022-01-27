package com.designpattern.facadepattern;

public class SalesManager {
	private WoodTypes wood;
	private ClosetTypes closet;
	
	public SalesManager() {
		this.wood = new WoodTypes();
		this.closet = new ClosetTypes();
	}
	
	public String ShowWoodTypes() {
		return this.wood.showProducts();
	}
	
	public String ShowClosetTypes() {
		return this.closet.showProducts();
	}
	
	public void showWoodClosetTypes() {
		this.wood.showProducts();
		this.closet.showProducts();
	}
	
}
