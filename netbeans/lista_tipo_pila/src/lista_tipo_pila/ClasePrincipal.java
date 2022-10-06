/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author robin_vfh49pm
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "Menu de opciones \n"
                        + "1. Insertar un nodo \n"
                        + "2. Eliminar un nodo \n"
                        + "3. ¿la pila esta vacia?\n"
                        + "4. ¿cual es el ultimo valor de la pila"
                        + "5. ¿cuantos nodos tiene la pila? \n"
                        + "6. vaciar la pila \n"
                        + "7. Mostar el contenido de la pila \n"
                        + "8. Salir\n\n"
                        + ""));
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "porfavor ingrese el valor a guardar en la pila"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "se ha eleminado un nodo con el valor: "
                            + pila.EliminarNodo()
                            );
                        }else{
                               JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        break;
                    case 3:
                          if(pila.PilaVacia()){
                              JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                                                 
                          }else{
                              JOptionPane.showMessageDialog(null, "pila no vacia");
                          }
                          
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valoir ingresado es: " + pila.MostrarUltimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "la pila contiene" + pila.TamanoPila() + " nodos");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "se ha vaciado la pila");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta vuelvea intentar nuevamente");
                        break;
                }
            } catch (NumberFormatException e) {
            }

        } while (opcion != 8);

    }

}
