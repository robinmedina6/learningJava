import javax.swing.*;
import java.awt.event.*;
public class Interfaces extends  JFrame implements ActionListener{
  JButton botonUno;
  public Interfaces(){
    setLayout(null);
    botonUno = new JButton("Cerrar");
    botonUno.setBounds(300,250,100,30);
    add(botonUno);
    botonUno.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent event){
    if(event.getSource() == botonUno){
       System.exit(0);
    }
    System.out.println("ejecutado");
  }
  public static void main(String args[]){
    Interfaces interfazUno = new Interfaces();
    interfazUno.setBounds(0,0,450,350);
    interfazUno.setVisible(true);
    interfazUno.setResizable(false);
    interfazUno.setLocationRelativeTo(null);
  }
  

}