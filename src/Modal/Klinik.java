
package Modal;

// @author FransiskaAW
/*program ini digunakan untuk memproses dan mendeklarasikan nama dan id dari sebuah klinik*/

public class Klinik {
  private  String nama ;   // mendeklarasikan atribut nama bertipe String dalam bentuk private
  private  String idklinik;  // mendeklarasikan atribut idKlinik bertipe String dalam bentuk private

    public String getNama() { // method untuk memproses dan mengirim nilai balikan atribut nama
        return nama;
    }

    public void setNama(String nama) { // method untuk memasukkan  atau menginput nilai nama
        this.nama = nama;
    }

    public String getIdklinik() { // method untuk memproses dan mengirim nilai balikan atribut Idklinik
        return idklinik;
    }

    public void setIdklinik(String idklinik) { // method untuk memasukkan  atau menginput nilai idklinik
        this.idklinik = idklinik;
    }
  
  
}
