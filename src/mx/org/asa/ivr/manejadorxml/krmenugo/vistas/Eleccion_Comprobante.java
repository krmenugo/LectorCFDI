package mx.org.asa.ivr.manejadorxml.krmenugo.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import mx.gob.asa.iverar.conexiones.Eleccion_Lector;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.FileNameMap;
import java.awt.Toolkit;

public class Eleccion_Comprobante extends javax.swing.JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public static String archivo_Nombre_Ruta;
	public Eleccion_Comprobante() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleccion_Comprobante.class.getResource("/mx/gob/asa/iverar/img/lector_logo_peque.png")));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_4 = new JLabel("- LECTURA DE COMPROBANTES DE NOMINAS //ASA -");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 26));
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(0, 128, 128));
		panel_5.setBackground(new Color(0, 51, 51));
		panel_5.setSize(new Dimension(100, 100));
		panel_3.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("");
		panel_5.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//--------------- A C E P T A R -------------------------------------------------------------------------
				Eleccion_Lector.main(null);
			}
		});//------------------------------------------------------------------------------------------------------------
		lblNewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/btn_aceptar.png")));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 51, 51));
		panel_4.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(0, 51, 51));
		lblNewLabel_6.setBackground(new Color(0, 51, 51));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 51, 51));
		panel_4.add(panel_7, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setForeground(new Color(0, 51, 51));
		lblNewLabel_5.setBackground(new Color(0, 51, 51));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_7.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("RUTA: ");
		lblNewLabel_2.setBackground(new Color(0, 51, 51));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		panel_4.add(lblNewLabel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//----------- E X A M I N A R -------------------------------------------------------------------------------
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogTitle("Abrir documento...");
				String fileContents = ""; // URL - DOCUMENTOS
				
				File directorioRuta = new File(fileContents); //OBJETO FILE
				chooser.setCurrentDirectory(directorioRuta);
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				chooser.setAcceptAllFileFilterUsed(false);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de nómina (*.xml)", "xml");
				int returnVal = chooser.showOpenDialog(getParent());
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					archivo_Nombre_Ruta = chooser.getSelectedFile().getAbsolutePath();
				    System.out.println("Elegiste el directorio: " + 
				     chooser.getSelectedFile().getAbsolutePath());
				    textField.setText(archivo_Nombre_Ruta);
				}
				chooser.setFileFilter(filter);
			}
		});
		lblNewLabel_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/btn_examinar.png")));
		panel_4.add(lblNewLabel_3, BorderLayout.EAST);
		//------------------------------------------------------------------------------------------------------------------
		textField = new JTextField();
		panel_4.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleccion_Comprobante window = new Eleccion_Comprobante();
					window.setSize(new Dimension(800, 230));

//					window.setVisible(true);
//					window.setLocationRelativeTo(null);
					
					window.setLocationRelativeTo(window);
//					window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
