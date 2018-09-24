/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author kris
 */
public class MainFrame extends JFrame implements ActionListener {
     private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasien;
    private JMenuItem TambahAntrian;

    public MainFrame() {
        init();
    }

    public void init() {
        MenuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);
        exitMenuItem = new JMenuItem("Exit");
        TambahPasien = new JMenuItem("Tambah Pasien Baru");
        TambahAntrian = new JMenuItem("Tambah Antrian");
        
        
        fileMenu.add(TambahPasien);
        fileMenu.add(TambahAntrian);
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        TambahPasien.addActionListener(this);
        TambahAntrian.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == TambahPasien) {
            TambahPasienBaruDialog tampil = new TambahPasienBaruDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
        if (e.getSource() == TambahAntrian) {
            DaftarAntrianDialog tampil = new DaftarAntrianDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
    }

}
