package mx.org.asa.ivr.manejadorxml.krmenugo.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mx.gob.asa.iverar.conexiones.Connection_Class;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReportes extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection_Class Conexion = new Connection_Class();
	public GenerarReportes() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("- VENTANA DE REPORTE DE XML LE\u00CDDOS // ASA -\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 102, 102));
		panel_1.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		//----------------------------------------------------------------------------------------------------------
		
		//----------------------------------------------------------------------------------------------------------
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 102, 102));
		panel_2.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 102, 102));
		panel_3.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 51, 51));
		panel_4.setBackground(new Color(0, 51, 51));
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("New ------ label");
		lblNewLabel_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_2.setBackground(new Color(0, 51, 51));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_4.add(lblNewLabel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(0, 51, 51));
		lblNewLabel_4.setBackground(new Color(0, 51, 51));
		panel_4.add(lblNewLabel_4, BorderLayout.EAST);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setForeground(new Color(0, 51, 51));
		lblNewLabel_5.setBackground(new Color(0, 51, 51));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblNewLabel_5, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(0, 51, 51));
		lblNewLabel_6.setBackground(new Color(0, 51, 51));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblNewLabel_6, BorderLayout.NORTH);
		//--------------------------------------------------------------------------------------------------------------------
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(0, 51, 51));
		panel_4.add(lblNewLabel_1, BorderLayout.CENTER);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Connection_Class conexion = new Connection_Class();
				
				//-----------------------------------------------------------------------------------------------
				try{
		            String archivo = "C:\\Users\\car\\Documents\\- TITULACIÓN -\\Manejo_de_ XML_IVR_V2\\src\\mx\\org\\asa\\ivr\\manejadorxml\\krmenugo\\reporte\\reporteCFDI.jrxml";
		            
		            JasperReport masterReport= null;
		            
		            try {
		                masterReport= JasperCompileManager.compileReport(archivo);
		            }catch (JRException e1) {
		                JOptionPane.showMessageDialog(null,"Error al compilar reporte", "Generar Reporte",JOptionPane.ERROR_MESSAGE);
		            }

		            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,null,conexion.abrirConexion());
		            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
		            jviewer.setVisible(true);
		        
				} catch (Exception ex){
		            JOptionPane.showMessageDialog(null,"Error al generar PDF.", "Generar Reporte",JOptionPane.ERROR_MESSAGE);
		        }
				
				try {
				
				} catch (Exception e2) {
					System.out.println("Error al generar reporte. Intentalo de nuevo.\n" +  e2);
				}
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(GenerarReportes.class.getResource("/mx/gob/asa/iverar/img/btn_generarReporte.png")));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes window = new GenerarReportes();
					window.setSize(new Dimension(543, 271));

//					window.setVisible(true);
//					window.setLocationRelativeTo(null);
					
					window.setLocationRelativeTo(null);
					window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}