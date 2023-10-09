package com.carrent.book.cars;



public class Cars {
	
	private int car_id; 
	private String car_name;
	private long car_price;
	private String car_brand;
	


	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public long getCar_price() {
		return car_price;
	}

	public void setCar_price(long d) {
		this.car_price = d;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	@Override
	public String toString() {
		return 
				" THE CAR ID IS   : " + car_id+"\n"+
				" THE CAR NAME IS : " + car_name+"\n"+
				" THE CAR PRICE IS: " + car_price + "\n"+
				" THE CAR BRAND IS: "+ car_brand + "" +"\n ";
	}

	
	
	
	
	
	
	
}
