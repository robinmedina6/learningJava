
package clases;


public class Pila {
    private Nodo ultimoValorIngresado;
    
    public Pila(){
        ultimoValorIngresado = null;
    }
    
    public void Insertar(char valor){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion=valor;
        if(ultimoValorIngresado==null){
            nuevo_nodo.siguiente=null;
            ultimoValorIngresado=nuevo_nodo;
        }else{
            nuevo_nodo.siguiente = ultimoValorIngresado;
            ultimoValorIngresado=nuevo_nodo;
        }
    }
    
    //metodo para extraer de la pila
    
    public char extraer(){
        if(ultimoValorIngresado!=null){
            char informacion = ultimoValorIngresado.informacion;
            ultimoValorIngresado=ultimoValorIngresado.siguiente;
            return informacion;
            
        }else{
            return Character.MAX_VALUE;
        }
    }
    public boolean PilaVacia(){
        return ultimoValorIngresado==null;
    }
    
}

