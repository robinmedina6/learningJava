import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel labelUno;
  public Formulario(){
    setLayout(null);
    labelUno = new JLabel("Hola mundo Swing con label");
    labelUno.setBounds(10,20,200,300);
    add(labelUno);
  }
  public static void main(String args[]){
    Formulario formularioUno = new Formulario();
    formularioUno.setBounds(0,0,400,300);
    formularioUno.setVisible(true);
    formularioUno.setLocationRelativeTo(null);
  }
}