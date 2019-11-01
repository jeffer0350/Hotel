package com.hotel.demoHotel.definitions;


import com.hotel.demoHotel.steps.HotelSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelDefinitions {
	
	@Steps
	HotelSteps hotelSteps;
	
	@Given("^un lugar ([^\"]*)$")
	public void un_lugar(String lugarViaje) {
		hotelSteps.seleccionarLugar(lugarViaje);
	}

	@Given("^selecciono fecha check in ([^\"]*) y check out ([^\"]*)$")
	public void selecciono_fecha_check_in_y_check_out(String fechaIda, String fechaDevuelta) {
		hotelSteps.seleccionarFechasHotel(fechaIda, fechaDevuelta);
	}

	@Given("^doy click en el boton SEARCH$")
	public void doy_click_en_el_boton_SEARCH() {
		hotelSteps.clickBoton();
	}
    
}
