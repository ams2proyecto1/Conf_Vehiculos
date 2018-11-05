package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datos_Cliente {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtPrimerApellido;
	private JTextField txtSegundoApellido;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JLabel labelUsuario;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public Datos_Cliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JLabel labelDatosCliente = new JLabel("DATOS DEL CLIENTE");
		labelDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 24));

		JLabel labelNombre = new JLabel("Nombre *");

		txtNombre = new JTextField();
		txtNombre.setColumns(10);

		JLabel labelPrimerApellido = new JLabel("Primer Apellido *");

		JLabel labelSegundoApellido = new JLabel("Segundo Apellido *");

		JLabel labelDireccion = new JLabel("Direccion *");

		JLabel labelCorreo = new JLabel("Correo Electronico *");

		txtPrimerApellido = new JTextField();
		txtPrimerApellido.setColumns(10);

		txtSegundoApellido = new JTextField();
		txtSegundoApellido.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);

		JLabel labelGenero = new JLabel("Genero");

		JRadioButton rbHombre = new JRadioButton("Hombre");
		buttonGroup.add(rbHombre);

		JRadioButton rbMujer = new JRadioButton("Mujer");
		buttonGroup.add(rbMujer);

		JRadioButton rbNoDeterminado = new JRadioButton("No determinado");
		buttonGroup.add(rbNoDeterminado);

		JLabel labelFecha = new JLabel("Fecha Nacimiento");

		JDateChooser dcFechaNacimiento = new JDateChooser();

		JButton botonGuardar = new JButton("Guardar");
		//27. Hacer las mismas comprobacionesque se hace con el boton siguiente con el boton guardar
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				String email = txtCorreo.getText();
				Matcher mather = pattern.matcher(email);
				if(txtNombre.getText().equals("") || txtPrimerApellido.getText().equals("") || txtSegundoApellido.getText().equals("") || txtDireccion.getText().equals("") || txtCorreo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Hay campos obligatorios sin rellenar", "Error",
							JOptionPane.ERROR_MESSAGE);
				}else if(!txtCorreo.getText().equals("") && (mather.find() == false)){
					JOptionPane.showMessageDialog(null, "El campo Correo esta mal escrito", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton botonSiguiente = new JButton("Siguiente");
		botonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				String email = txtCorreo.getText();
				Matcher mather = pattern.matcher(email);
				if(txtNombre.getText().equals("") || txtPrimerApellido.getText().equals("") || txtSegundoApellido.getText().equals("") || txtDireccion.getText().equals("") || txtCorreo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Hay campos obligatorios sin rellenar", "Error",
							JOptionPane.ERROR_MESSAGE);
				}else if(!txtCorreo.getText().equals("") && (mather.find() == false)){
					JOptionPane.showMessageDialog(null, "El campo Correo esta mal escrito", "Error",
							JOptionPane.ERROR_MESSAGE);
				}else {
					Seleccion_Coche sc = new Seleccion_Coche();
					sc.setVisible(true);
					frame.setVisible(false);
				}
			}
		});


		labelUsuario = new JLabel("Usuario:");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(40)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(labelNombre)
												.addComponent(labelPrimerApellido)
												.addComponent(labelSegundoApellido)
												.addComponent(labelDireccion)
												.addComponent(labelCorreo)
												.addComponent(labelGenero)
												.addComponent(labelFecha))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addGap(73)
														.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(txtPrimerApellido)
																.addComponent(txtSegundoApellido)
																.addComponent(txtDireccion)
																.addComponent(txtCorreo)
																.addComponent(txtNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
												.addGroup(groupLayout.createSequentialGroup()
														.addGap(18)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
																.addComponent(dcFechaNacimiento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(rbHombre)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(rbMujer)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(rbNoDeterminado)))))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(botonGuardar, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
										.addComponent(botonSiguiente, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
										.addGap(25))))
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(91)
						.addComponent(labelDatosCliente)
						.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
						.addComponent(labelUsuario)
						.addGap(97))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(28)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelDatosCliente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelUsuario))
						.addGap(59)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(labelNombre)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(35)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelPrimerApellido)
								.addComponent(txtPrimerApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(36)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelSegundoApellido)
								.addComponent(txtSegundoApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(34)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelDireccion)
								.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(labelCorreo)
								.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(41)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelGenero)
								.addComponent(rbHombre)
								.addComponent(rbMujer)
								.addComponent(rbNoDeterminado))
						.addGap(25)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(labelFecha)
								.addComponent(dcFechaNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(33)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(botonGuardar, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(botonSiguiente, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
						.addGap(36))
				);
		frame.getContentPane().setLayout(groupLayout);
	}


	public JFrame getFrame() {
		return frame;
	}
	public void obtenerUsuario(String usuario) {

		labelUsuario.setText(labelUsuario.getText() +": " +  usuario);
	}
}
