package Model;

import static Model.Pasien.daftarPasienKlinik;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class RumahSakit {

    private String nama;
    private String alamat;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    public static ArrayList<AntrianPasien> DaftarAntrianKlinik = new ArrayList<AntrianPasien>();

    public RumahSakit() {
    }

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {

            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            boolean noRM = false;
            boolean nama = false;
            boolean alamat = false;
            String n;
            String RM;
            String ala;
            Pasien temp = new Pasien();
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t' && noRM == false && nama == false && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == false && nama == false && alamat == false) {
                        noRM = true;
                        temp.setNoRekamMedis(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && nama == false && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && nama == false && alamat == false) {
                        nama = true;
                        temp.setNama(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && nama == true && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && nama == true && alamat == false) {
                        alamat = true;
                        temp.setAlamat(hasilBaca);
                        hasilBaca = "";
                    }
                } else {
                    alamat = true;
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    nama = false;
                    noRM = false;
                    alamat = false;
                    temp = new Pasien();
                }
            }
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String norekam) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (norekam == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null
                    : norekam.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

    public void simpanObjekRumahSakit(File file) {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream cos = new ObjectOutputStream(fos);
            cos.writeObject(daftarPasienKlinik);
            cos.close();
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        Klinik bantu = new Klinik();
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                bantu.setNama(daftarKlinik.get(i).getNama());
            }
        }
        return bantu;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalantrian(tanggal);
        antrian.setBulanantrian(bulan);
        antrian.setTahunantrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            this.DaftarAntrianKlinik.add(antrian);
        } else {
            JOptionPane.showMessageDialog(null, "Antrian Sudah Ada !");
        }
    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        // Pasien cari = new Pasien();
        for (int i = 0; i < DaftarAntrianKlinik.size(); i++) {
            if (tanggal == DaftarAntrianKlinik.get(i).getTanggalantrian()
                    && bulan == DaftarAntrianKlinik.get(i).getBulanantrian(bulan)
                    && tahun == DaftarAntrianKlinik.get(i).getTahunantrian(tahun)
                    && DaftarAntrianKlinik.get(i).getKlinik().getIdklinik().equalsIgnoreCase(klinik.getIdklinik())
                    && DaftarAntrianKlinik.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())) {
                return i;
            }
        }
        return -1;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            DaftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).getDaftarpasien();
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            DaftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).getDaftarpasien();

        }

    }

    public void bacaObjekRumahSakit(File file) {
        FileInputStream fis = null;

        try {
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            RumahSakit a = (RumahSakit) ois.readObject();
//            this.setDaftarPasein(a.getDaftarPasien());
//            this.setDaftarAntrianKlinik(a.getDaftarAntrianKlinik());
//            this.setDaftarKlinik(a.getDaftarKlinik());
//            this.setNama(a.getNama());
//            this.setAlamat(a.getAlamat());
            fis = new FileInputStream(file);
            ObjectInputStream cis = new ObjectInputStream(fis);
            daftarPasienKlinik = (ArrayList<Pasien>) cis.readObject();
            cis.close();
            JOptionPane.showMessageDialog(null, "Open Berhasil");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Pasien> getDaftarPasien() {
        return this.daftarPasienKlinik;
    }

  

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        RumahSakit.daftarKlinik = daftarKlinik;
    }

    public static ArrayList<Pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public static void setDaftarPasienKlinik(ArrayList<Pasien> daftarPasienKlinik) {
        RumahSakit.daftarPasienKlinik = daftarPasienKlinik;
    }

    public static ArrayList<AntrianPasien> getDaftarAntrianKlinik() {
        return DaftarAntrianKlinik;
    }

    public static void setDaftarAntrianKlinik(ArrayList<AntrianPasien> DaftarAntrianKlinik) {
        RumahSakit.DaftarAntrianKlinik = DaftarAntrianKlinik;
    }

    private ArrayList<Pasien> setDaftarPasein(ArrayList<Pasien> daftarPasien) {
        return daftarPasienKlinik;
    }

}
