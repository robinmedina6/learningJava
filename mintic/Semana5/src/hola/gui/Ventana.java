package hola.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import agenda.gui.Contacto;

public class Ventana extends JFrame implements ActionListener {

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCelular;
	private JButton btnGuardar;
	private JButton btnImprimir;
	private ArrayList<Contacto> agenda;
	private JButton btnEliminar;

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	public Ventana(ArrayList<Contacto> agenda) {
		initialize();
		this.agenda = agenda;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(21, 68, 66, 25);
		this.getContentPane().add(lblNewLabel);

		txtNombre = new JTextField();
		txtNombre.setBounds(94, 70, 86, 20);
		this.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Mi Agenda");
		lblNewLabel_1.setBounds(81, 16, 191, 25);
		this.getContentPane().add(lblNewLabel_1);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(21, 104, 66, 25);
		this.getContentPane().add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(94, 106, 86, 20);
		this.getContentPane().add(txtApellido);

		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(94, 142, 86, 20);
		this.getContentPane().add(txtCelular);

		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(21, 140, 66, 25);
		this.getContentPane().add(lblCelular);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);

		btnGuardar.setBounds(49, 182, 89, 23);
		this.getContentPane().add(btnGuardar);

		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(this);
		btnImprimir.setBounds(267, 182, 89, 23);
		getContentPane().add(btnImprimir);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(158, 182, 89, 23);
		getContentPane().add(btnEliminar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnGuardar) {
			guardarContacto();
		} else if (e.getSource() == btnImprimir) {
			imprimirContactos();
		} else if (e.getSource() == btnEliminar) {
			eliminarContacto();
		}

	}

	public void guardarContacto() {
		this.agenda
				.add(new Contacto(txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtCelular.getText())));
		JOptionPane.showMessageDialog(null, "se guardo el contacto");
	}

	public void imprimirContactos() {
		StringBuilder str = new StringBuilder();
		for (Contacto cn : this.agenda) {
			str.append(cn.toString());
			str.append("\n");

		}
		JOptionPane.showMessageDialog(btnImprimir, str);
	}

	public void eliminarContacto() {
		for (Contacto cn : this.agenda) {
			if (cn.getNombre().equals(txtNombre.getText())) {
				agenda.remove(1);
			}
		}
	}
}
