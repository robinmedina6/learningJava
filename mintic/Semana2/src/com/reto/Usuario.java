package com.reto;

public class Usuario {
	
	public static void main(String[] args) {
		Usuario obj = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "desarrollo", true);
		obj.info();
		Usuario obj1 = new Usuario("Miguel Alvarez", 1099000222, "miguel.alvarez@correo.com", 29, "administrativa", false);
		obj1.info();
		Usuario obj2 = new Usuario("Miguel Alvarez", 1099000222, "miguel.alvarez@correo.com", 29, "administrativa", true);
		obj2.info();
		Usuario obj3 = new Usuario("Daniela Ramirez", 1099234000, "daniela.ramirez@correo.com", 23, "desarrollo", false);
		obj.info();
		Usuario obj4 = new Usuario("Daniela Ramirez", 1099234000, "daniela.ramirez@correo.com", 23, "desarrollo", false);
		obj4.info();
	}
	
	private String nombreUsuario;
	private int identificacion;
	private String email;
	private int edad;
	private String area ;
	private boolean jefe;
	private double salario;
	public Usuario(String nombreUsuario, int identificacion, String email, int edad, String area, boolean jefe) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.identificacion = identificacion;
		this.email = email;
		this.edad = edad;
		this.area = area;
		this.jefe = jefe;
		double totaldevengado=0;
		if(area.equalsIgnoreCase("desarrollo")) {
			totaldevengado=4500000;
			if(jefe == true) {
				totaldevengado+=2500000;
			}
		}else if(area.equalsIgnoreCase("administrativa")) {
			totaldevengado=3500000;
			if(jefe == true) {
				totaldevengado+=3000000;
			}
		}		
		if(totaldevengado>(908526*4)) {
			totaldevengado-=((totaldevengado*0.08)+(totaldevengado*0.01));
		}else {
			totaldevengado-=(totaldevengado*0.08);
		}
		this.salario=totaldevengado;
	}
	public void info() {
		System.out.println("[Usuario]:\nNombre: " + nombreUsuario + "\nIdentificacion: " + identificacion + "\nEmail: " + email
				+ "\nEdad: " + edad + "\nArea: " + area + "\nSalario: " + salario + "");
	
	}
}
