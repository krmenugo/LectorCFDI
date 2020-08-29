package mx.gob.asa.iverar.conexiones;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Eleccion_Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	public static String archivoNombre;

	public Eleccion_Ventana() {
		initialize();
		this.setUndecorated(true); // QUITAR BOTONES DE MINIMIZAR Y MAXIMIZAR
		//setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	}

	private void initialize() {
		setBounds(80, 80, 610, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("  Ruta de los XML: ");
		getContentPane().add(lblNewLabel_1, BorderLayout.WEST);

		TextField textField = new TextField();
		getContentPane().add(textField, BorderLayout.CENTER);
		// -------------- BUTTON EXAMINAR -----------------------
		Button button = new Button("Examinar");
		button.setBackground(new Color(154, 205, 50));
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setActionCommand("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser(); // CREA OBJETO DE HERRAMIENTA FILECHOOSER
				chooser.setDialogTitle("Abrir documento...");
				String fileContents = "C:\\Users\\iverari\\Documents"; // URL DE LA VENTANA QUE SE ABRIRA EN FILECHOOSER
				
				File directorioRuta = new File(fileContents);
				chooser.setCurrentDirectory(directorioRuta);
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				String ruta = directorioRuta.getPath();
				chooser.setAcceptAllFileFilterUsed(false);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de nómina (*.xml)", "xml");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					textField.setText(chooser.getSelectedFile().getName());
					System.out.println("El elemento fué: " + chooser.getSelectedFile().getName());
					archivoNombre = chooser.getSelectedFile().getName();
					System.out.println("---------------------------------------");
				}
			}// ------ TERMINA BUTTON EXAMINAR --------
		});

		getContentPane().add(button, BorderLayout.EAST);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		JButton btnNewButton = new JButton("A C E P T A R");
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eleccion_Lector.main(null);
			}
		});

		panel.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("CANCELAR / BORRAR");
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});

		panel.add(btnNewButton_1);
		
		JButton btnCerrar = new JButton("REGRESAR");
		btnCerrar.setBackground(new Color(220, 20, 60));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
			                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			            System.exit(0);
			    }
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel.add(btnCerrar);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_1, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleccion_Ventana window = new Eleccion_Ventana();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
