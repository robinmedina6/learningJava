import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  private JButton  botonUno, botonDos, botonTres;
  private JLabel labelUno;
  
  public Formulario(){
    setLayout(null);
    botonUno = new JButton("1");
    botonUno.setBounds(10,100,90,30);
    add(botonUno);
    botonUno.addActionListener(this);

    botonDos = new JButton("2");
    botonDos.setBounds(110,100,90,30);
    add(botonDos);
    botonDos.addActionListener(this);
    
    botonTres = new JButton("3");
    botonTres.setBounds(210,100,90,30);
    add(botonTres);
    botonTres.addActionListener(this);
 
    labelUno = new JLabel("en espera");
    labelUno.setBounds(10,10,300,30);
    add(labelUno);
       
  }
  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == botonUno){
      labelUno.setText("BotonUno");
    }
    if(ev.getSource() == botonDos){
      labelUno.setText("botonDos");
    }
    if(ev.getSource() == botonTres){
      labelUno.setText("botonTres");
    }
  }
  public static void main(String args[]){
    Formulario fUno = new Formulario();
    fUno.setBounds(0,0,350,200);
    fUno.setVisible(true);
    fUno.setResizable(false);
    fUno.setLocationRelativeTo(null);


  } 
}