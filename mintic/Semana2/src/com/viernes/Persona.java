package com.viernes;

public class Persona {
	private String nombre="";
	private byte edad=0;
	private int id;
	private char sexo='H';
	private float peso=0;
	private float altura=0;
	
	public Persona(String nombre, byte edad, int id, char sexo, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}
