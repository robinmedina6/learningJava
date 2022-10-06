import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{
  private JComboBox combo1;

  public Formulario(){
    setLayout(null);
    combo1= new JComboBox();
    combo1.setBounds(10,10,80,20);
    add(combo1);
    
    combo1.addItem("Rojo");
    combo1.addItem("Verde");
    combo1.addItem("Azul");
    combo1.addItem("Amarillo");
    combo1.addItem("Negro");
    combo1.addItemListener(this);
    
  }
  
  public void itemStateChanged(ItemEvent ev){
    if(ev.getSource() == combo1){
       String seleccionText = combo1.getSelectedItem().toString();
       setTitle(seleccionText);
       
    }
  }
  public static void main(String args[]){
    Formulario form1 = new Formulario();
    form1.setBounds(0,0,300,200);
    form1.setVisible(true);
    form1.setResizable(false);
    form1.setLocationRelativeTo(null);

  }
}