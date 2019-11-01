package com.hotel.demoHotel.steps;

import com.hotel.demoHotel.pageobjects.HotelPageObjects;


public class HotelSteps {
	
	HotelPageObjects hotelPageObjects;

	public void seleccionarLugar(String lugarViaje) {
		hotelPageObjects.open();
		hotelPageObjects.seleccionarLugar(lugarViaje);
	}

	public void seleccionarFechasHotel(String fechaIda, String fechaDevuelta) {
		hotelPageObjects.seleccionarFechaIda(fechaIda);
		hotelPageObjects.seleccionarFechaDevuelta(fechaDevuelta);
	}

	public void clickBoton() {
		hotelPageObjects.darClickBoton();
	}
}
