/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel noRekamLabel;
    private JLabel alamatLabel;
    private JTextField noRekamText;
    private JTextField alamatText;

 
    public TambahAntrianDialog() {
        init();
    }

   
    public void init() {

        this.setLayout(null);
        judulLabel = new JLabel("Tambah Antri");
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);

        noRekamLabel = new JLabel("No. RM");
        noRekamLabel.setBounds(20, 60, 100, 50);
        this.add(noRekamLabel);

        noRekamText = new JTextField();
        noRekamText.setBounds(70, 75, 200, 20);
        this.add(noRekamText);
        noRekamText.addActionListener(this);

        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(20, 100, 100, 50);
        this.add(namaLabel);

        namaText = new JTextField(" ");
        namaText.setBounds(70, 115, 200, 20);
        this.add(namaText);
        namaText.addActionListener(this);

        alamatLabel = new JLabel("Alamat ");
        alamatLabel.setBounds(20, 140, 100, 50);
        this.add(alamatLabel);

        alamatText = new JTextField(" ");
        alamatText.setBounds(70, 155, 200, 20);
        this.add(alamatText);

    }

   
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == noRekamText) {
//            if (Pasien.cariPasien(noRekamText.getText()) != null) {
//                namaText.setText(Pasien.cariPasien(noRekamText.getText()).getNama());
//                alamatText.setText(Pasien.cariPasien(noRekamText.getText()).getAlamat());
//            } else {
//                JOptionPane.showMessageDialog(null, "Nomor Rekam Medis : "+noRekamText.getText()+" Tidak Tersedia");
//            }
//        
//        }
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





























