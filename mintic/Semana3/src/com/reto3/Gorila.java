package com.reto3;

public class Gorila extends Animal{

	public Gorila(double pesoArg,double alturaArg) {
	
		this.peso=pesoArg;
		this.altura=alturaArg;
	}
	public double getPesoAlims() {//devuelve en gramos
		double pesototal=0;
		for (int i=0 ; i<this.alimsIngeridos.length; i++){
			pesototal+=alimsIngeridos[i].getGramos();
		}	
		return pesototal;
	}
	public double getIMC(){
        double pesogorila=peso+getPesoAlims()/1000;
        return(pesogorila/Math.pow(altura,2));
    }
	
}
