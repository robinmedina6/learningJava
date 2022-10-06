package com.club;

import java.util.Scanner;

public class Club {
	private String nombreClub;
	private Socio socio1,socio2,socio3;
	public Club(String nombreClub) {
		super();
		this.nombreClub = nombreClub;
		Scanner entrada = new Scanner(System.in);
		this.socio1 = new Socio(entrada);
		this.socio2 = new Socio(entrada);
		this.socio3 = new Socio(entrada);
		this.masAntiguo();
		System.out.println(this.getNombreClub());
	}
	private String getNombreClub() {
		return this.nombreClub;
	}
	private void masAntiguo() {
		System.out.println("el socio mas antiguo es: "+this.socio1.getNombre());
	}
}
