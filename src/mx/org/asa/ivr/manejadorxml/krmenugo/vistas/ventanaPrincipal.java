package mx.org.asa.ivr.manejadorxml.krmenugo.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

//import mx.gob.asa.iverar.conexiones.Eleccion_Ventana;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class ventanaPrincipal extends javax.swing.JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ventanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/mx/gob/asa/iverar/img/lector_logo_peque.png")));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().setSize(new Dimension(637, 400));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("- MANEJADOR DE COMPROBANTES DE NOMINAS //ASA -");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setForeground(Color.DARK_GRAY);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 51));
		panel_2.setForeground(Color.DARK_GRAY);
		getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 51));
		panel_3.setForeground(Color.DARK_GRAY);
		getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 51, 51));
		panel_4.add(panel_5, BorderLayout.CENTER);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel label = new JLabel("...");
		label.setForeground(new Color(0, 51, 51));
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 6;
		gbc_label.gridy = 0;
		panel_5.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("...");
		label_1.setForeground(new Color(0, 51, 51));
		label_1.setFont(new Font("Dialog", Font.BOLD, 24));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panel_5.add(label_1, gbc_label_1);
		//------------------------------------------------------------------------------------------------------------
		//ICONO LOGO 1
		JLabel lblIcono = new JLabel("");
		lblIcono.setSize(300, 300);
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 4;
		gbc_lblIcono.gridy = 1;
		panel_5.add(lblIcono, gbc_lblIcono);
		lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/lector_logo_peque.png")));
		//ICONO BOTON 1
		JLabel lblBtn = new JLabel("");
		lblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Abrir ventana de lector de comprobantes");
				Eleccion_Comprobante lector = new Eleccion_Comprobante();
				ventanaPrincipal menu = new ventanaPrincipal();
				menu.setVisible(false);
				lector.show();
				lector.setLocationRelativeTo(null);
				lector.setSize(new Dimension(900, 250));
			}
		});
		lblBtn.setToolTipText("LECTOR DE COMPROBANTES FISCALES DIGITALES");
		GridBagConstraints gbc_lblBtn = new GridBagConstraints();
		gbc_lblBtn.insets = new Insets(0, 0, 5, 0);
		gbc_lblBtn.gridx = 6;
		gbc_lblBtn.gridy = 1;
		panel_5.add(lblBtn, gbc_lblBtn);
		lblBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/btn_lector_peque.png")));
		lblBtn.setSize(800,100);
		
		JLabel lblNewLabel_1 = new JLabel("Neww");
		lblNewLabel_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		panel_5.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		//------------------------------------------------------------------------------------------------------------
		//ICONO LOGO 2
		JLabel lblIcono_1 = new JLabel("");
		lblIcono_1.setSize(300, 300);
		GridBagConstraints gbc_lblIcono_1 = new GridBagConstraints();
		gbc_lblIcono_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblIcono_1.gridx = 4;
		gbc_lblIcono_1.gridy = 4;
		panel_5.add(lblIcono_1, gbc_lblIcono_1);
		lblIcono_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/reporte_logo_peque.png")));
		
		//ICONO BOTON 2
		JLabel lblBtn_1 = new JLabel("");
		lblBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				GenerarReportes reportes = new GenerarReportes();
				reportes.setVisible(true);
				reportes.setLocationRelativeTo(null);
				reportes.setSize(new Dimension(560, 300));
				
			}
		});
		lblBtn_1.setToolTipText("GENERAR REPORTE");
		GridBagConstraints gbc_lblBtn_1 = new GridBagConstraints();
		gbc_lblBtn_1.gridx = 6;
		gbc_lblBtn_1.gridy = 4;
		panel_5.add(lblBtn_1, gbc_lblBtn_1);
		lblBtn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/btn_reporte_peque.png")));
		lblBtn_1.setSize(800,100);
		//------------------------------------------------------------------------------------------------------------
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal window = new ventanaPrincipal();
					window.setLocationRelativeTo(window);
					window.setSize(new Dimension(637, 350));
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
