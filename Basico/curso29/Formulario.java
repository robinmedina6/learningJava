import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField textFieldUno;
  private JLabel labelUno;
  private JButton botonUno;

  public Formulario (){
    setLayout(null);
    labelUno  = new JLabel("Usuario:");
    labelUno.setBounds(10,10,100,30);
    add(labelUno);
    
    textFieldUno =  new JTextField();
    textFieldUno.setBounds(120,17,150,20);
    add(textFieldUno);
    
    botonUno = new JButton("Aceptar");
    botonUno.setBounds(10,80,100,30);
    add(botonUno);
    botonUno.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ev){
  if(ev.getSource() == botonUno){
    String textoUno = textFieldUno.getText();
    setTitle(textoUno);    
  }  
  }
  public static void main(String args[]){
    Formulario f1= new Formulario();
    f1.setBounds(0,0,300,160);
    f1.setVisible(true);
    f1.setResizable(false);
    f1.setLocationRelativeTo(null);

  }
}