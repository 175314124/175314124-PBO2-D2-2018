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
import javax.swing.*;

/**
 *
 * @author asus
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    private JLabel noRekamMedisLabel;
    private JLabel AlamatLabel;
    private JTextField noRekamMedisText;
    private JTextField AlamatText;
    private JLabel jenisKelaminLabel;
    private JRadioButton priaRadioButton;
    private JRadioButton perempuanRadioButton;
    private ButtonGroup groupButtonGroup;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JComboBox tanggalComboBox;
    private JComboBox bulanComboBox;
    private JComboBox tahunComboBox;
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"Januari", "Februari", "Maret", "April", "Mei", 
        "Juni", "Juli", "Agustus", "September","oktober", "november", "Desember"};
    private String tahunArray[] = {"1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", };

 private JButton simpanbutton;


    public TambahPasienBaruDialog() {
        init();
    }

    public void init() {

        this.setLayout(null);
        judulLabel = new JLabel("Form Tambah Pasien");
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(10, 30, 60, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(132, 30, 130, 20);
        this.add(namaText);

        noRekamMedisLabel = new JLabel("NIK");
        noRekamMedisLabel.setBounds(10, 45, 110, 45);
        this.add(noRekamMedisLabel);

        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(132, 55, 130, 20);
        this.add(noRekamMedisText);

        AlamatLabel = new JLabel("Alamat");
        AlamatLabel.setBounds(10, 60, 100, 65);
        this.add(AlamatLabel);

        AlamatText = new JTextField();
        AlamatText.getText();
        AlamatText.setBounds(132, 80, 130, 20);
        this.add(AlamatText);

        jenisKelaminLabel = new JLabel("Jenis Kelamin ");
        jenisKelaminLabel.setBounds(10, 165, 100, 50);
        this.add(jenisKelaminLabel);

        priaRadioButton = new JRadioButton("Pria", true);
        priaRadioButton.setBounds(132, 180, 50, 20);
        this.add(priaRadioButton);

        perempuanRadioButton = new JRadioButton("Perempuan", false);
        perempuanRadioButton.setBounds(132, 200, 120, 20);
        this.add(perempuanRadioButton);
        
        groupButtonGroup = new ButtonGroup();
        groupButtonGroup.add(priaRadioButton);
        groupButtonGroup.add(perempuanRadioButton);

        tanggalLahirLabel = new JLabel("Tanggal");
        tanggalLahirLabel.setBounds(10, 230, 80, 20);
        this.add(tanggalLahirLabel);

        tanggalComboBox = new JComboBox(tanggalArray);
        tanggalComboBox.setBounds(75, 230, 40, 20);
        this.add(tanggalComboBox);

        bulanLahirLabel = new JLabel("Bulan");
        bulanLahirLabel.setBounds(120, 230, 80, 20);
        this.add(bulanLahirLabel);

        bulanComboBox = new JComboBox(bulanArray);
        bulanComboBox.setBounds(160, 230, 40, 20);
        this.add(bulanComboBox);

        tahunLahirLabel = new JLabel("Tahun");
        tahunLahirLabel.setBounds(210, 230, 80, 20);
        this.add(tahunLahirLabel);

        tahunComboBox = new JComboBox(tahunArray);
        tahunComboBox.setBounds(250, 230, 90, 20);
        this.add(tahunComboBox);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(140, 300, 100, 30);
        this.add(saveButton);
        saveButton.addActionListener(this);

               
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien daftar = new Pasien();
            daftar.setNama(namaText.getText());
            daftar.setAlamat(AlamatText.getText());
            daftar.setNoRekamMedis(noRekamMedisText.getText());
            RumahSakit.tambahPasienBaru(daftar);
            this.dispose();
        }
    }
}
