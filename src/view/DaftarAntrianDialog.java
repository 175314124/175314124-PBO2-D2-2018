/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Pasien;
import Model.RumahSakit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DaftarAntrianDialog extends JFrame implements ActionListener{
private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel AlamatLabel;
    private JLabel noRekamMedisLabel;
    private JTextField namaText;
    private JTextField Alamattext;
    private JTextField noRekamMedisText;
    private JButton saveButton;
   
    public DaftarAntrianDialog() {
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("Daftar Antrian Pasien");
        judulLabel.setBounds(98, 10, 200, 10);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(10, 30, 60, 25);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText .setBounds(132, 30, 130, 20);
        this.add(namaText);
        
        noRekamMedisLabel = new JLabel("no Rekam Medis ");
        noRekamMedisLabel.setBounds(10, 45, 110, 45);
        this.add(noRekamMedisLabel);
       
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(132, 55, 130, 20);
        this.add(noRekamMedisText);
        noRekamMedisText.addActionListener(this);
        
        
        AlamatLabel = new JLabel("Alamat");
        AlamatLabel.setBounds (10,60,100,65);
        this.add(AlamatLabel);
        
        Alamattext = new JTextField();
        Alamattext.getText();
        Alamattext.setBounds(132,80,130,20);
        this.add(Alamattext);
        
        
        
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds (100,180,100,30);
        this.add(saveButton);
        
   
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noRekamMedisText) {
            namaText.setText(RumahSakit.cariPasien(noRekamMedisText.getText()).getNama());
            Alamattext.setText(RumahSakit.cariPasien(noRekamMedisText.getText()).getAlamat());
        }
        
    }
}