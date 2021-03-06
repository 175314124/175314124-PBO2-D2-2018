package Model;

// @author FransiskaAW
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* program pada kelas ini digunakan untuk memasukan , memproses dan mengirim nilai balikan berupa
data Pasien. data tersebut berupa nomer rekam medis , nama , alamat , tempat lahir , tanggal lahir
bulan lahir , dan tahun lahir dari Pasien.
 */
public class Pasien implements Serializable{

    private String noRekamMedis;
//mendeklarasikan atribut noRekamMedis bertipe String dalam bentuk private
    private String nama;
    //mendeklarasikan atribut nama bertipe String dalam bentuk private
    private String alamat;
    //mendeklarasikan atribut alamat bertipe String dalam bentuk private
    private String tempatLahir;
    //mendeklarasikan atribut tempatlahir bertipe String dalam bentuk private
    private int tanggalLahir;
//mendeklarasikan atribut tanggallahir bertipe integer dalam bentuk private
    private int bulanLahir;
    //mendeklarasikan atribut bulanlahir bertipe integer dalam bentuk private
    private int tahunLahir;
//mendeklarasikan atribut tahunlahir bertipe integer dalam bentuk private
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<>();

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String noRekamMedis) {//menambahkan konstruktor, Konsktruktor adalah method yang memiliki nama yang sama dengan nama kelas

        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.noRekamMedis = noRekamMedis;
    }

   
    public Pasien() {

    }

    public void setNoRekamMedis(String noRekamMedis) {
        // method ini digunakan untuk memproses nomer rekam medis yang dilakukan selama nomer rekam medis lebih dari atau sama dengan 6

        this.noRekamMedis = noRekamMedis;

    }

    public String getNoRekamMedis() {
        // method untuk mengirim nilai balikan berupa noRekamMedis
        return noRekamMedis;
    }

    public void setNama(String nama) {
        // method untuk memasukkan  atau menginput nilai nama
        this.nama = nama;
    }

    public String getNama() {
        // method untuk mengirim nilai balikan berupa atribut nama
        return nama;
    }

    public void setAlamat(String alamat) {
        // method untuk memasukkan nilai alamat
        this.alamat = alamat;
    }

    public String getAlamat() {
        // method untuk mengirim nilai balikan alamat
        return alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        // method untuk mengirim nilai balikan tempatlahir
        this.tempatLahir = tempatLahir;
    }

    public String getTempatLahir() {
        // method untuk mengirim nilai balikan tempatlahir
        return tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //method untuk memproses atribut tanggallahir dengan syarat tanggalantrian tidak boleh lebih dari 31 dan tidak boleh 0

        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception(" Tanggal Lahir Anda Salah ");
        }

    }

    public int getTanggalLahir() {
        // method untuk mengirim nilai balikan tanggallahir
        return tanggalLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        //method untuk memproses atribut bulanlahir dengan syarat bulanlahir tidak boleh lebih dari 13 dan tidak boleh kurang dari  0

        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Salah ");
        }
    }

    public int getBulanLahir() {
        // method untuk mengirim nilai balikan bulanlahir

        return bulanLahir;
    }

    public void setTahunLahir(int TahunLahir) throws Exception {
        //method untuk memproses atribut tahunlahir dengan syarat tahunantrian harus lebih besar dari 0
        if (TahunLahir > 0) {
            this.tahunLahir = TahunLahir;
        } else {
            throw new Exception(" Tahun Lahir Anda Salah ");
        }
    }

    public int getTahunLahir() {
        // method untuk mengirim nilai balikan tahunlahir

        return tahunLahir;
        //
    }

    @Override
    public String toString() {
        return nama + "\t" + alamat + "\n";
    }
}
