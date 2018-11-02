package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import patrones.ConfigurationLoader;
import validaciones.ValUserPass;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField tfLogin;
	private JPasswordField passwordField;
	private String user;
	private String pass;

	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 347, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblLogin = new JLabel("Login:");
		frame.setLocationRelativeTo(null);
		tfLogin = new JTextField();
		tfLogin.setColumns(10);

		JLabel lblNewLabel = new JLabel("Password:");

		JButton btnLogin = new JButton("Entrar");
		// btnLogin.addActionListener(l);;

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = tfLogin.getText();
				pass = new String(passwordField.getPassword());
				ValUserPass v1 = new ValUserPass();
				if (v1.valUserPass(user, pass)) {
					frame.setVisible(false);
					Datos_Cliente d1 = new Datos_Cliente();
					d1.obtenerUsuario(user);
					d1.getFrame().setVisible(true);
				} else {

				}

			}
		});

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					user = tfLogin.getText();
					pass = new String(passwordField.getPassword());
					ValUserPass v1 = new ValUserPass();
					if (v1.valUserPass(user, pass)) {
						frame.setVisible(false);
						Datos_Cliente d1 = new Datos_Cliente();
						d1.obtenerUsuario(user);
						d1.getFrame().setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Error en el login", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(32)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addGap(46)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(passwordField)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tfLogin, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
				.addContainerGap(100, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(32)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(29)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(btnLogin).addContainerGap(42, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public String pasarUsuario() {
		return this.user;
	}

}
