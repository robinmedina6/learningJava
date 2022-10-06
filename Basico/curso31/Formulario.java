import javax.swing.*;

public class Formulario extends JFrame{
  private JTextField txt1;
  private JScrollPane scrollPane1;
  private JTextArea txtArea1;
 
  public Formulario(){
    setLayout(null);
    txt1 = new JTextField();
    txt1.setBounds(10,10,200,30);
    add(txt1);
    
    txtArea1 = new JTextArea();
    scrollPane1=new JScrollPane(txtArea1);
    scrollPane1.setBounds(10,60,400,300);
    add(scrollPane1);
    
  }
  
  public static void main(String args[]){
    Formulario form1 = new Formulario();
    form1.setBounds(0,0,540,400);
    form1.setVisible(true);
    form1.setResizable(false);
    form1.setLocationRelativeTo(null);
  
  }

}