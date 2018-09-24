
package Model;

// @author FransiskaAW
/* program pada kelas ini digunakan untuk menyimpan dan memproses data antrian pasien.
data tersebut berupa tanggal antrian , bulan antrian , tahuin antrian , klinik dan daftar pasien.
*/
 
public class AntrianPasien { // Kelas Antrian Pasien adalah turunan dari kelas Pasien.
    private int tanggalantrian; //mendeklarasikan atribut tanggalantrian bertipe integer dalam bentuk private
    private int bulanantrian; //mendeklarasikan atribut bulanantrian bertipe integer dalam bentuk private
    private int tahunantrian; //mendeklarasikan atribut tahunantrian bertipe integer dalam bentuk private
    private Klinik Klinik; // mendeklarasikan atribut Klinik bertipe Klinik dalam bentuk private
    private Pasien daftarpasien[]; // mendeklarasikan atribut daftarpasien[] bertipe Pasien dalam bentuk private.

    public int getTanggalantrian(int tanggalantrian) {
        // method untuk mengirim nilai balikan tanggalantrian
        return tanggalantrian;
    }

    public void setTanggalantrian(int tanggalantrian) throws Exception {
       //method untuk memproses atribut tanggalantrian dengan syarat tanggalantrian tidak boleh lebih dari 31 dan tidak boleh 0
        if (tanggalantrian > 0 && tanggalantrian < 31) {
            this.tanggalantrian = tanggalantrian;
        } else {
            throw new Exception(" Tanggal Antrian Anda Salah ");
        }
    }

    public int getBulanantrian( int bulanantrian)  {
       // method untuk mengirim nilai balikan bulanantrian
        return bulanantrian;
    }

    public void setBulanantrian(int bulanantrian) throws Exception {
         //method untuk memproses atribut bulanantiran dengan syarat bulanantrian tidak boleh lebih dari 13 dan tidak boleh kurang dari  0
        if (bulanantrian > 0 && bulanantrian < 13) {
            this.bulanantrian= bulanantrian;
        } else {
            throw new Exception(" Bulan Antrian Anda Salah ");
        }
    }

    public int getTahunantrian(int tahunantrian) {
         // method untuk mengirim nilai balikan tahunantrian
        return tahunantrian;
    }

    public void setTahunantrian(int tahunantrian) throws Exception {
        if (tahunantrian> 0) {
             //method untuk memproses atribut tahunantiran dengan syarat tahunantrian harus lebih besar dari 0
            this.tahunantrian = tahunantrian;
        } else {
            throw new Exception(" Tahun Antrian Anda Salah ");
        }
    }

    public Klinik getKlinik() {
        // method ini digunakan untuk mengirim nilai balikan Klinik 
        return Klinik;
    }

    public void setKlinik(Klinik Klinik) {
         // method untuk memasukkan nilai Klinik dengan tipe Klinik
        this.Klinik = Klinik;
    }

    public Pasien[] getDaftarpasien() {
        // method ini digunakan untuk mengirim nilai balikan daftarpasien dengan tipe Pasien[]
        return daftarpasien;
    }

    public void setDaftarpasien(Pasien[] daftarpasien) {
         // method untuk memasukkan nilai  daftarpasien
        this.daftarpasien = daftarpasien;
    }
    
}
