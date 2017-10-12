package fr.creperie.model;

abstract class Marchandise {
	
	protected String name;
	protected String code;
	protected double price;
	
	
	 Marchandise(String name, String code, double price){
		
		this.name = name;
		this.code = code;
		this.price = price;
		
	}

	 
	 
	 
	 
	 
	 

	public String getName() {
		return name;
	}
	

	public String getCode() {
		return code;
	}
	
	public double getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCode(String code) {
		this.code = code;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
