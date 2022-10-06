import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel labelUno;
  private JLabel labelDos;
  
  public Formulario(){
    setLayout(null);
    labelUno = new JLabel("Interfaz Grafica");
    labelUno.setBounds(10,20,300,30);
    add(labelUno);
    labelDos = new JLabel("Version 1.0");
    labelDos.setBounds(10,100,100,30);
    add(labelDos);
  }

  public static void main(String args[]){
    Formulario formularioUno = new Formulario();
    formularioUno.setBounds(0,0,300,200);
    formularioUno.setResizable(false);
    formularioUno.setVisible(true);
    formularioUno.setLocationRelativeTo(null);
  }

}