package com.general;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.conversores.ConversorMonedas;
import com.conversores.ConversorTemperatura;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ventanaNavegacion {

	private JFrame frmProgramaDeConversores;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaNavegacion window = new ventanaNavegacion();
					window.frmProgramaDeConversores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaNavegacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgramaDeConversores = new JFrame();
		frmProgramaDeConversores.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				salir();
			}
		});
		frmProgramaDeConversores.setTitle("SISTEMA DE CONVERSORES");
		frmProgramaDeConversores.setBounds(100, 100, 973, 560);
		frmProgramaDeConversores.setLocationRelativeTo(null);
		frmProgramaDeConversores.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmProgramaDeConversores.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("ARCHIVO");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("SALIR");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu menuConversores = new JMenu("CONVERSORES");
		menuConversores.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(menuConversores);
		
		JMenuItem itemMonedas = new JMenuItem("MONEDAS");
		itemMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorMonedas c = new ConversorMonedas();
				desktopPane.add(c);
				c.setVisible(true);
			}
		});
		menuConversores.add(itemMonedas);
		
		JMenuItem itemTemperatura = new JMenuItem("TEMPERATURA");
		itemTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorTemperatura q = new ConversorTemperatura();
				desktopPane.add(q);
				q.setVisible(true);
			}
		});
		menuConversores.add(itemTemperatura);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 128, 0));
		frmProgramaDeConversores.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel instrucciones = new JLabel("¡Hola, Bienvenido!");
		instrucciones.setForeground(new Color(255, 0, 0));
		instrucciones.setHorizontalAlignment(SwingConstants.LEFT);
		instrucciones.setFont(new Font("Tahoma", Font.BOLD, 30));
		instrucciones.setBounds(407, 255, 380, 55);
		desktopPane.add(instrucciones);
		
		JLabel instrucciones_1 = new JLabel("Elige tu conversor en el \r\nmenú \"CONVERSORES\" ");
		instrucciones_1.setHorizontalAlignment(SwingConstants.LEFT);
		instrucciones_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		instrucciones_1.setBounds(407, 315, 504, 25);
		desktopPane.add(instrucciones_1);
		
		JLabel instrucciones_1_1 = new JLabel("Arriba a la \r\nizquierda :D");
		instrucciones_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		instrucciones_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		instrucciones_1_1.setBounds(407, 339, 504, 25);
		desktopPane.add(instrucciones_1_1);
		
		JLabel instrucciones_1_1_1 = new JLabel("Que tal :)");
		instrucciones_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		instrucciones_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		instrucciones_1_1_1.setBounds(407, 388, 504, 25);
		desktopPane.add(instrucciones_1_1_1);
		
		JLabel instrucciones_1_1_1_1 = new JLabel("Cristian Rojas");
		instrucciones_1_1_1_1.setForeground(new Color(255, 0, 0));
		instrucciones_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		instrucciones_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		instrucciones_1_1_1_1.setBounds(407, 424, 504, 25);
		desktopPane.add(instrucciones_1_1_1_1);
		
		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon(ventanaNavegacion.class.getResource("/com/recursos/principal.jpg")));
		background.setBounds(0, 0, 964, 506);
		desktopPane.add(background);
	}
	
	private void salir() {
		int resp = javax.swing.JOptionPane.showConfirmDialog(frmProgramaDeConversores, "¿Quiere salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(resp == 0) {
			System.exit(0);
		}
	}
}
