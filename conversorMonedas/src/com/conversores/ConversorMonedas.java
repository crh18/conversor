package com.conversores;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.clases.Divisa;

import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ConversorMonedas extends JInternalFrame {
	private JTextField ctMontoConvertido;
	private JComboBox cbDivisasInicial;
	private JTextField ctMontoInicial;
	private JComboBox cbDivisasFinal;
	private JLabel img1;
	private JLabel img2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorMonedas frame = new ConversorMonedas();
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
	public ConversorMonedas() {
		getContentPane().setBackground(new Color(211, 211, 211));
		setClosable(true);
		setTitle("Conversor de Divisas");
		setBounds(100, 100, 316, 300);
		getContentPane().setLayout(null);
		
		cbDivisasInicial = new JComboBox();
		cbDivisasInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = (String) cbDivisasInicial.getSelectedItem();
				switch (p) {
					case "COP - Peso Colombiano":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/colombia.jpg")));
						break;
					case "USD - Dolar":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/eeuu.jpg")));
						break;
					case "EUR - Euro":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/ue.jpg")));
						break;
					case "GBP - Libra Esterlina":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/gb.jpg")));
						break;
					case "JPY - Yen Japonés":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/japon.jpg")));
						break;
					case "KRW - Won sur-coreano":
						img1.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/korea.jpg")));
						break;
				}
			}
		});
		cbDivisasInicial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbDivisasInicial.setModel(new DefaultComboBoxModel(new String[] {"COP - Peso Colombiano", "USD - Dolar", "EUR - Euro", "GBP - Libra Esterlina", "JPY - Yen Japonés", "KRW - Won sul-coreano"}));
		cbDivisasInicial.setBounds(46, 92, 207, 22);
		getContentPane().add(cbDivisasInicial);
		
		JLabel eTexto = new JLabel("Ingresa cantidad a convertir:");
		eTexto.setFont(new Font("Tahoma", Font.BOLD, 15));
		eTexto.setBounds(46, 35, 207, 27);
		getContentPane().add(eTexto);
		
		ctMontoConvertido = new JTextField();
		ctMontoConvertido.setFont(new Font("Tahoma", Font.BOLD, 15));
		ctMontoConvertido.setHorizontalAlignment(SwingConstants.CENTER);
		ctMontoConvertido.setBounds(46, 195, 207, 27);
		getContentPane().add(ctMontoConvertido);
		ctMontoConvertido.setColumns(10);
		
		ctMontoInicial = new JTextField();
		ctMontoInicial.setHorizontalAlignment(SwingConstants.CENTER);
		ctMontoInicial.setFont(new Font("Tahoma", Font.BOLD, 15));
		ctMontoInicial.setColumns(10);
		ctMontoInicial.setBounds(46, 62, 207, 27);
		getContentPane().add(ctMontoInicial);
		
		img2 = new JLabel("");
		img2.setHorizontalAlignment(SwingConstants.CENTER);
		img2.setBounds(182, 125, 60, 31);
		getContentPane().add(img2);
		
		img1 = new JLabel("");
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		img1.setBounds(56, 125, 60, 31);
		getContentPane().add(img1);
		
		JLabel lbl = new JLabel(">>>");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(126, 125, 46, 31);
		getContentPane().add(lbl);
		
		JLabel eTitulo = new JLabel("CONVERSOR DE DIVISAS");
		eTitulo.setForeground(new Color(0, 0, 255));
		eTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		eTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		eTitulo.setBounds(10, 0, 274, 34);
		getContentPane().add(eTitulo);
		
		cbDivisasFinal = new JComboBox();
		cbDivisasFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = (String) cbDivisasFinal.getSelectedItem();
				switch (t) {
					case "COP - Peso Colombiano":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/colombia.jpg")));
						break;
					case "USD - Dolar":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/eeuu.jpg")));
						break;
					case "EUR - Euro":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/ue.jpg")));
						break;
					case "GBP - Libra Esterlina":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/gb.jpg")));
						break;
					case "JPY - Yen Japonés":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/japon.jpg")));
						break;
					case "KRW - Won sur-coreano":
						img2.setIcon(new ImageIcon(ConversorMonedas.class.getResource("/com/recursos/korea.jpg")));
						break;
				}
			}
		});
		cbDivisasFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbDivisasFinal.setModel(new DefaultComboBoxModel(new String[] {"USD - Dolar", "EUR - Euro", "GBP - Libra Esterlina", "JPY - Yen Japonés", "KRW - Won sur-coreano", "COP - Peso Colombiano"}));
		cbDivisasFinal.setBounds(46, 167, 207, 22);
		getContentPane().add(cbDivisasFinal);
		
		JButton btnNewButton = new JButton("CONVERTIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					convertir();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(desktopIcon, "Error! Ingrese un valor correcto");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(98, 233, 108, 31);
		getContentPane().add(btnNewButton);

	}
	
	public void convertir() {
		//Declaro las divisas
		ArrayList<Divisa> listaDivisa = new ArrayList<>();
		Divisa COP = new Divisa("COP - Peso Colombiano", 1);
		Divisa USD = new Divisa("USD - Dolar", 4400);
		Divisa EUR = new Divisa("EUR - Euro", 4700);
		Divisa GBP = new Divisa("GBP - Libra Esterlina", 5450);
		Divisa JPY = new Divisa("JPY - Yen Japonés", 31.44);
		Divisa KRW = new Divisa("KRW - Won sur-coreano", 3.33);
		double n = 0;
		double e = 0;
		double f = 0;
		listaDivisa.add(COP);
		listaDivisa.add(USD);
		listaDivisa.add(EUR);
		listaDivisa.add(GBP);
		listaDivisa.add(JPY);
		listaDivisa.add(KRW);
		DecimalFormat decimal = new DecimalFormat("##.##");
		
		//Operaciones
		for(Divisa item : listaDivisa) {
			if (cbDivisasInicial.getSelectedItem() == item.getNombre()) {
				e = item.getEquivalenciaPesoCol();
			}
			if (cbDivisasFinal.getSelectedItem() == item.getNombre()) {
				f = item.getEquivalenciaPesoCol();
			}
		}
		
		n = Double.parseDouble(ctMontoInicial.getText())*e/f;
		ctMontoConvertido.setText(String.valueOf(decimal.format(n)));
	}
	
}
