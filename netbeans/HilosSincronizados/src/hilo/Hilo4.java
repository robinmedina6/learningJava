/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author robin_vfh49pm
 */
public class Hilo4 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("k");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo4" + e);
            }
        }
    }
    
}
