/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author robin_vfh49pm
 */
public class Recursividad {
    private int mult=1;
    public void Factorial(int n){
        if(n<1){
            System.out.println(mult);
        }else{
            mult*=n;
            Factorial(n-1);
        }                
    }
}
