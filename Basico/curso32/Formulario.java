import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  private JTextField txtField1;
  private JScrollPane scrollPane1;
  private JTextArea txtArea1;
  private JButton boton1;

  String texto="";
  
  public Formulario(){
    setLayout(null);
    txtField1=new JTextField();
    txtField1.setBounds(10,10,200,30);
    add(txtField1);
    
    boton1 = new JButton("Agregar");
    boton1.setBounds(250,10,100,30);
    add(boton1);
    boton1.addActionListener(this);
   
    txtArea1 = new JTextArea();
    scrollPane1 = new JScrollPane(txtArea1);
    scrollPane1.setBounds(10,50,400,300);
    add(scrollPane1);
  }
  
  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == boton1){
      texto+=txtField1.getText() + "\n";
      txtArea1.setText(texto);
      txtField1.setText("");
    }
  }

  public static void main(String args[]){
  Formulario form1 = new Formulario();
  form1.setBounds(0,0,540,400);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
  }
  


}