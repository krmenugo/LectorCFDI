package mx.org.asa.ivr.manejadorxml.krmenugo.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import mx.gob.asa.iverar.conexiones.conexion_BD_LogIn;

import java.awt.GridBagConstraints;
import javax.swing.JPasswordField;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Toolkit;

public class LogIn extends javax.swing.JFrame implements ActionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	conexion_BD_LogIn con_pru = new conexion_BD_LogIn();
	Connection connection_login = con_pru.abrirConexion();
	
	private JTextField txtUser;
	private JPasswordField txtPass;
	int resultado = 0;

	public void validar_acceso() {
		try {
			String usuario = txtUser.getText();
			String password = String.valueOf(txtPass.getPassword());
			String sql = "SELECT * FROM usuario WHERE user = '"+ usuario +"' AND pass='"+ password +"'";
			Statement st = connection_login.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				resultado = 1;
				ventanaPrincipal vp = new ventanaPrincipal();
				vp.setVisible(true);
				vp.setLocationRelativeTo(null);
				vp.setSize(new Dimension(600, 350));
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Error en el acceso, Vuleva a intentarlo");
				txtPass.setText("");
				txtUser.setText("");
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error en el acceso, Vuleva a intentarlo");
			txtPass.setText("");
			txtUser.setText("");
		}
	}
	
	public LogIn() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogIn.class.getResource("/mx/gob/asa/iverar/img/lector_logo_peque.png")));
		setTitle("Lector CFDI'S ASA");
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel, BorderLayout.NORTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/log_In_peque.png"))); // L O G O
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_1, BorderLayout.WEST); 
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//--------------------------------------------------------------
				//--------- B O T O N   D E  A C C E D E R ---------------------
				//--------------------------------------------------------------
				validar_acceso();
			}
		});
		lblNewLabel_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/gob/asa/iverar/img/btnAcceder_login_peque.png")));
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel label = new JLabel("...");
		label.setBackground(new Color(0, 51, 51));
		label.setForeground(new Color(0, 51, 51));
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		panel_4.add(label, gbc_label);
		
		JLabel lblUser = new JLabel(" USER ");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 0;
		gbc_lblUser.gridy = 1;
		panel_4.add(lblUser, gbc_lblUser);
		
		txtUser = new JTextField();
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.insets = new Insets(0, 0, 5, 0);
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.gridx = 2;
		gbc_txtUser.gridy = 1;
		panel_4.add(txtUser, gbc_txtUser);
		txtUser.setColumns(10);
		
		JLabel label_1 = new JLabel("...");
		label_1.setBackground(new Color(0, 51, 51));
		label_1.setForeground(new Color(0, 51, 51));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 3;
		panel_4.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("...");
		label_2.setBackground(new Color(0, 51, 51));
		label_2.setForeground(new Color(0, 51, 51));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 5;
		panel_4.add(label_2, gbc_label_2);
		
		JLabel lblPassword = new JLabel(" PASSWORD ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 6;
		panel_4.add(lblPassword, gbc_lblPassword);
		
		txtPass = new JPasswordField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.insets = new Insets(0, 0, 5, 0);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 2;
		gbc_txtPass.gridy = 6;
		panel_4.add(txtPass, gbc_txtPass);
		
		JLabel label_3 = new JLabel("...");
		label_3.setBackground(new Color(0, 51, 51));
		label_3.setForeground(new Color(0, 51, 51));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 7;
		panel_4.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("...");
		label_4.setBackground(new Color(0, 51, 51));
		label_4.setForeground(new Color(0, 51, 51));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 8;
		panel_4.add(label_4, gbc_label_4);
		}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.setVisible(true);
					//window.setIconImage("/mx/gob/asa/iverar/img/lector_logo.png");
					
					window.setSize(new Dimension(310, 450));
					window.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}