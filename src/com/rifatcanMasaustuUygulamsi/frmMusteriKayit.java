package com.rifatcanMasaustuUygulamsi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.ParseException;

import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frmMusteriKayit {

	private JFrame frmSporMerkeziMteri;
	private JTextField txtadi;
	private JTextField txtsoyadi;
	JFormattedTextField txttelefon;
	JFormattedTextField txtaciltelefon;
	JFormattedTextField txtdogumta;
	JFormattedTextField txttckimlik;
	JTextPane txtsaglikdurum;
	JTextPane txtadres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMusteriKayit window = new frmMusteriKayit();
					window.frmSporMerkeziMteri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmMusteriKayit() {
		try {
			initialize();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmSporMerkeziMteri = new JFrame();
		frmSporMerkeziMteri.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\rifatcan\\MasaustuUygulamasi\\images\\athlete.png"));
		frmSporMerkeziMteri.setTitle("SPOR MERKEZ\u0130 M\u00DC\u015ETER\u0130 KAYIT FORMU");
		frmSporMerkeziMteri.setBounds(100, 100, 536, 553);
		frmSporMerkeziMteri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSporMerkeziMteri.getContentPane().setLayout(null);
		
		JLabel lblTcKimlik = new JLabel("TC Kimlik");
		lblTcKimlik.setBounds(10, 11, 91, 14);
		frmSporMerkeziMteri.getContentPane().add(lblTcKimlik);
		
		JLabel lblAd = new JLabel("Ad\u0131");
		lblAd.setBounds(10, 36, 91, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad\u0131");
		lblSoyad.setBounds(10, 61, 91, 14);
		frmSporMerkeziMteri.getContentPane().add(lblSoyad);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(10, 86, 80, 14);
		frmSporMerkeziMteri.getContentPane().add(lblTelefon);
		
		JLabel lblAcilTelefon = new JLabel("Acil Telefon");
		lblAcilTelefon.setBounds(10, 111, 80, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAcilTelefon);
		
		JLabel lblDoumTarihi = new JLabel("Do\u011Fum Tarihi");
		lblDoumTarihi.setBounds(10, 136, 80, 14);
		frmSporMerkeziMteri.getContentPane().add(lblDoumTarihi);
		
		JLabel lblSalkD = new JLabel("Sa\u011Fl\u0131k Durumu");
		lblSalkD.setBounds(10, 162, 80, 14);
		frmSporMerkeziMteri.getContentPane().add(lblSalkD);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(10, 238, 80, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAdres);
		
		txtadi = new JTextField();
		txtadi.setColumns(10);
		txtadi.setBounds(119, 33, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txtadi);
		
		txtsoyadi = new JTextField();
		txtsoyadi.setColumns(10);
		txtsoyadi.setBounds(119, 58, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txtsoyadi);
		
		txttelefon = new JFormattedTextField(new MaskFormatter("0###-###-##-##"));
		txttelefon.setBounds(119, 83, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txttelefon);
		
		txtaciltelefon = new JFormattedTextField(new MaskFormatter("0###-###-##-##"));
		txtaciltelefon.setBounds(119, 108, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txtaciltelefon);
		
		txtdogumta = new JFormattedTextField(new MaskFormatter("##-##-####"));
		txtdogumta.setBounds(119, 133, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txtdogumta);
		
		txtsaglikdurum = new JTextPane();
		txtsaglikdurum.setBounds(119, 156, 159, 72);
		frmSporMerkeziMteri.getContentPane().add(txtsaglikdurum);
		
		txtadres = new JTextPane();
		txtadres.setBounds(119, 238, 159, 72);
		frmSporMerkeziMteri.getContentPane().add(txtadres);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\rifatcan\\MasaustuUygulamasi\\images\\if_man_47991 (1).png"));
		lblNewLabel.setBounds(351, 8, 128, 128);
		frmSporMerkeziMteri.getContentPane().add(lblNewLabel);
		
		JButton btnYeniKayt = new JButton("");
		btnYeniKayt.setIcon(new ImageIcon("D:\\rifatcan\\MasaustuUygulamasi\\images\\if_mypc_save_41757 (1).png"));
		btnYeniKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ekranýtemizle();
			}
		});
		btnYeniKayt.setBounds(10, 349, 91, 57);
		frmSporMerkeziMteri.getContentPane().add(btnYeniKayt);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(119, 349, 89, 23);
		frmSporMerkeziMteri.getContentPane().add(btnKaydet);
		
		JButton btnDzenle = new JButton("D\u00FCzenle");
		btnDzenle.setBounds(218, 349, 89, 23);
		frmSporMerkeziMteri.getContentPane().add(btnDzenle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(317, 349, 89, 23);
		frmSporMerkeziMteri.getContentPane().add(btnSil);
		
		JButton btniki = new JButton("\u00C7\u0131k\u0131\u015F");
		btniki.setBounds(421, 481, 89, 23);
		frmSporMerkeziMteri.getContentPane().add(btniki);
		
		txttckimlik = new JFormattedTextField(new MaskFormatter("###########"));
		txttckimlik.setBounds(119, 8, 159, 20);
		frmSporMerkeziMteri.getContentPane().add(txttckimlik);
	}
	
	public void ekranýtemizle()
	{
		txttckimlik.setText("");
		txtadi.setText("");
		txtsoyadi.setText("");
		txttelefon.setText("");
		txtaciltelefon.setText("");
		txtdogumta.setText("");
		txtsaglikdurum.setText("");
		txtadres.setText("");
	}
}
