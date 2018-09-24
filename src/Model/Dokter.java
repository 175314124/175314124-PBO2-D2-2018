/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FransiskaAW
 */
public class Dokter {
    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String TempatLahir;
    private String TanggalLahir;

     public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

   public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

     public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

   
    
    
}
