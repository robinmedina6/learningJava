import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private  JMenuBar menubar;
  private  JMenu menu1, menu2, menu3;
  private  JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

  public Formulario(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    
    menu1= new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Tamaño de la Ventana");
    menu1.add(menu2);
    menu3 = new JMenu("color de fondo");
    menu1.add(menu3);
    
    menuitem1 = new JMenuItem("300*200");
    menu2.add(menuitem1);
    menuitem1.addActionListener(this);

    menuitem2 = new JMenuItem("640*480");
    menu2.add(menuitem2);
    menuitem2.addActionListener(this);

    menuitem3 = new JMenuItem("rojo");
    menu3.add(menuitem3);
    menuitem3.addActionListener(this);

    menuitem4 = new JMenuItem("verde");
    menu3.add(menuitem4);
    menuitem4.addActionListener(this);
    
  }

  public void actionPerformed(ActionEvent ev){
     if(ev.getSource()==menuitem1){
       setSize(300,200);
     }
     if(ev.getSource()==menuitem2){
       setSize(640,480);
     }
     if(ev.getSource()==menuitem3){
       getContentPane().setBackground(new Color(255,0,0));
       
     }
     if(ev.getSource()==menuitem4){
       getContentPane().setBackground(new Color(0,255,0));       
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