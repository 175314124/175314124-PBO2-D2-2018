/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public final class DaftarAntrianDialog extends JDialog {

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
        judulLabel = new JLabel("Daftar Nama Pasien");
        judulLabel.setBounds(98, 10, 200, 10);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(10, 30, 60, 25);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText .setBounds(132, 30, 130, 20);
        this.add(namaText);
        
        noRekamMedisLabel = new JLabel("no Rekam Medis ");
        noRekamMedisLabel.setBounds(10, 50, 110, 45);
        this.add(noRekamMedisLabel);
       
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(132, 55, 130, 20);
        this.add(noRekamMedisText);
        
//         AlamatLabel = new JLabel("Alamat ");
//        AlamatLabel.setBounds(10, 60, 70, 55);
//        this.add(AlamatLabel);
//        
//        Alamattext = new JTextField();
//        Alamattext.setBounds(130, 70, 140, 65);
//        this.add(Alamattext);
    }

}
