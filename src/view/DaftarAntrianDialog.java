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
    private JLabel noRRekamMedisLabel;
    private JTextField namaText;
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
        namaLabel.setBounds(10, 20, 50, 25);
        this.add(namaLabel);
    }

}
