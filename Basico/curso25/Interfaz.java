import javax.swing.*;

public class Interfaz extends JFrame{
  
  public Interfaz(){
    setLayout(null);
  }
  public static void main(String args[]){
    Interfaz interfazUno = new Interfaz();
    interfazUno.setBounds(350,100,400,500);
    interfazUno.setVisible(true);
    interfazUno.setLocationRelativeTo(null);
    interfazUno.setResizable(false);
  }
}