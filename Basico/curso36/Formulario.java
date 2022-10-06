import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;
  public Formulario(){
    setLayout(null);
    menubar= new JMenuBar();
    setJMenuBar(menubar);
    

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);
    
    menuitem1= new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);
    menuitem2= new JMenuItem("Verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);
    menuitem3= new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);
    
  }

  public void actionPerformed(ActionEvent ev){
    Container fondo = this.getContentPane();
    if(ev.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0));
    }
    if(ev.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0));
    }
    if(ev.getSource() == menuitem3){
      fondo.setBackground(new Color(0,0,255));
    } 

  }
  public static void main(String args[]){
    Formulario form1 = new Formulario();
    form1.setBounds(0,0,400,300);
    form1.setVisible(true);
    form1.setLocationRelativeTo(null);
  }

  
}