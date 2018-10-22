package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class seleccionCoche extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seleccionCoche frame = new seleccionCoche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public seleccionCoche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("SELECCIONA EL MODELO DEL COCHE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		
		JTextArea textArea_1 = new JTextArea();
		
		JTextArea textArea_2 = new JTextArea();
		
		JButton btnNewButton = new JButton("Siguiente");
		
		JButton btnAnterior = new JButton("Anterior");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAnterior)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton)
							.addGap(199))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(204))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(136)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(lblNewLabel_1)))))
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(111)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
					.addGap(74)
					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnAnterior))
					.addGap(34))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
