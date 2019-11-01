package com.hotel.demoHotel.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HotelPageObjects extends PageObject{
	
	@FindBy(xpath="//span[contains(text(),'Location')]/following::div[1]/div/div[1]/div/div[2]")
	private WebElement strComboLugarApertura;
	
	public void seleccionarLugar(String lugarViaje) {
		strComboLugarApertura.click();
		String strListaLugar = "//div[@class='dx-item-content dx-list-item-content' and contains(text(),"+lugarViaje+")]";
		findBy(strListaLugar).click();
	}

	public void seleccionarFechaIda(String fechaIda) {
		//findBy(strCheckIn).click();
		//findBy(strCheckIn).type(fechaIda);
	}

	public void seleccionarFechaDevuelta(String fechaDevuelta) {
		//find(By.id(strCheckOut)).type(fechaDevuelta);	
	}

	public void darClickBoton() {
		
	}
}
