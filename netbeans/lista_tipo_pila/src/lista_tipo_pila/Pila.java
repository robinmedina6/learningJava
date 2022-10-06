
package lista_tipo_pila;

import javax.swing.JOptionPane;


public class Pila {
    private Nodo ultimoValorIngresado;
    int tamano=0;
    String Lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
        
    }
    //metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
        return ultimoValorIngresado == null;
    }
    // metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado=nuevo_nodo;
        tamano++;
    }
    public int EliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    //Metodo para conocer cual es el ultimo valor ingresado
    public int MostrarUltimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }
    
    //metodo para conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    //metodo para vaciar nuestra pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    public void MostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        while(recorrido != null){
            Lista +=recorrido.informacion+"\n";
                    recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista ="";
    }
            
    
    
    
}
