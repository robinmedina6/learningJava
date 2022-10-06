package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	public JPanel panel1;// creacion de un panel

	public Ventana() {
		this.setSize(500, 500);// establecemos el tama�o de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// se le dice que debe cerrar al darle clicn en cerrar con la
														// constante 3 EXIT ONCLOSE
		this.setTitle("hola robillo");// se le coloca titulo
		// this.setLocation(100,200);//situa la ventanaa
		// this.setBounds(100,100,500,500);//incluye tama�o y posicion
		this.setLocationRelativeTo(null);// se establece en el centro

		iniciarComponentes();

	}

	private void iniciarComponentes() {
		colocarPaneles();
		// colocarEtiquetas ();
		//colocarBotones();
		//colocarRadioBotones();
		//colocarCajasdeTexto();
		//colocarAreasdeTexto();
		colocarcombobox();
	}

	private void colocarPaneles() {
		panel1 = new JPanel();
		panel1.setLayout(null);
		this.getContentPane().add(panel1);// agregamos el panel a la ventana
		// panel1.setBackground(Color.GREEN);

	}

	private void colocarEtiquetas() {
		JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER);// creamos una etiqueta
		// etiqueta.setText("hola");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);// establecemos la alineacion horizontal del texto en la
																// etiqueta
		etiqueta.setBounds(120, 120, 40, 15);// poicion y tamano
		etiqueta.setForeground(Color.white);// cambiar el color de la fuente
		etiqueta.setOpaque(true);// activa el modo opaco para poder pintar el fondo
		etiqueta.setFont(new Font("chiller", Font.PLAIN, 20));// modifica la fuente de las etiquetas

		etiqueta.setBackground(Color.black);

		// etiqueta tipo imagen
		ImageIcon imagen = new ImageIcon("img.png");
		JLabel etiqueta2 = new JLabel();
		panel1.add(etiqueta2);
		etiqueta2.setBounds(10, 80, 400, 400);
		etiqueta2.setIcon(new ImageIcon(
				imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

		panel1.add(etiqueta);// agregamos la etiqueta al panel

	}

	private void colocarBotones() {
		// boton de text
		JButton boton1 = new JButton();
		boton1.setBounds(100, 100, 100, 40);
		boton1.setText("Click");
		boton1.setEnabled(true);// encender o apagar el boton
		boton1.setMnemonic('a');// establecer alt mas el caracter establecido para hacer click
		boton1.setForeground(Color.blue);
		boton1.setFont(new Font("cooper black", Font.BOLD, 20));
		panel1.add(boton1);

		JButton boton2 = new JButton();
		boton2.setBounds(100, 200, 150, 60);
		boton2.setOpaque(false);

		ImageIcon imagenBoton2 = new ImageIcon("boton2.png");
		boton2.setIcon(new ImageIcon(
				imagenBoton2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		// boton2.setBackground(Color.green);//Estableceos el color de fondo del boton
		panel1.add(boton2);

	}
	private void colocarRadioBotones() {
		JRadioButton radioboton1=new JRadioButton("Opcion 1", true);
		radioboton1.setBounds(50,100,100,50);
		panel1.add(radioboton1);

		JRadioButton radioboton2=new JRadioButton("Opcion 2", false);
		radioboton2.setBounds(50,150,100,50);
		panel1.add(radioboton2);

		JRadioButton radioboton3=new JRadioButton("Opcion 3", false);
		radioboton3.setBounds(50,200,100,50);
		panel1.add(radioboton3);
		
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioboton1);
		grupoRadioBotones.add(radioboton2);
		grupoRadioBotones.add(radioboton3);
		radioboton1.setText("hola");
		radioboton1.setFont(new Font("Cooper black",Font.BOLD,20));
		
	}
	private void colocarCajasdeTexto() {
		JTextField cajatexto = new JTextField("hola");
		cajatexto.setBounds(50,50,100,30);
		//cajatexto.setText("hola");
		panel1.add(cajatexto);
	}
	private void  colocarAreasdeTexto() {
		JTextArea areatexto = new JTextArea();
		areatexto.setBounds(120,120,300,200);
		areatexto.setText("Escriba aqui lo que desee");
		panel1.add(areatexto);
		areatexto.append("\nescribe aquq#�");
		areatexto.setEditable(false);//se deshabilita la edicion
	}
	private void colocarcombobox() {
		String [] paises = {"peru","colombia", "Paraguay", "Ecuador"};
		JComboBox listaDesplegable = new JComboBox(paises);
		listaDesplegable.setBounds(20, 30, 100,30);
		listaDesplegable.addItem("Argentina");
		listaDesplegable.setSelectedItem("Paraguay");
		panel1.add(listaDesplegable);
		
				
		
		}
}
