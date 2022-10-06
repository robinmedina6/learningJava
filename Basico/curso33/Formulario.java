import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField txtfield1, txtfield2;
  private JLabel label1, label2, label3;
  private JButton boton1;

  public Formulario(){
    setLayout(null);
    label1=new JLabel("valor 1: ");
    label1.setBounds(50,5,100,30);
    add(label1);
   
    label2 = new JLabel("valor 2: ");
    label2.setBounds(50,35,100,30);
    add(label2);
    
    txtfield1 = new JTextField();
    txtfield1.setBounds(120,10,150,20);
    add(txtfield1);
    
    label3 = new JLabel("Resultado: ");
    label3.setBounds(120,80,150,30);
    add(label3);
    
    txtfield2= new JTextField();
    txtfield2.setBounds(120,40,150,20);
    add(txtfield2);
    
    boton1 = new JButton("Sumar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ev){
    if(ev.getSource()== boton1){
      int valorUno = 0, valorDos = 0, resultado = 0;
      valorUno = Integer.parseInt(txtfield1.getText());
      valorDos = Integer.parseInt(txtfield2.getText());
      resultado =  valorUno + valorDos;
      label3.setText("Resultado es: " + resultado);      
    }
  }
  public static void main(String args[]){
    Formulario form1 = new Formulario();
    form1.setBounds(0,0,500,500);
    form1.setVisible(true);
    form1.setResizable(false);
    form1.setLocationRelativeTo(null);    
  }

}