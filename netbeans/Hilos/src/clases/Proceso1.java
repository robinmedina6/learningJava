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
public class Proceso1 extends Thread {
    
    @Override
    public void run(){
      for(int i=0; i<=5; i++){
          System.out.println("Proceso 1");
      }  
    }
}
