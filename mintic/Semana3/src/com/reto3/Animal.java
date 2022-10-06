package com.reto3;

public class Animal {
	protected double peso;
	protected double altura;
	protected Alimento alimsIngeridos[];
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Alimento[] getAlimsIngeridos() {
		return alimsIngeridos;
	}
	public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
		this.alimsIngeridos = alimsIngeridos;
	}
	
	public double getIMC() {
		 //peso/altura^2
		double resultado=this.peso/(Math.pow(altura,2));
		 return resultado; 
	}
}
