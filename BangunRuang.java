package Tugas2;

public class BangunRuang {
    private float sisi;
    private double panjang, lebar, tinggi;
    private double jariJari;

    public BangunRuang() {

    }

    public BangunRuang(float sisi) {
        this.sisi = sisi;

    }

    public BangunRuang(double jariJari) {
        this.jariJari = jariJari;
    }

    public BangunRuang(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasKubus() {
        return 6 * sisi * sisi;
    }

    public double hitungLuasBalok() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double hitungLuasBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolumeKubus() {
        return sisi * sisi * sisi;
    }

    public double hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
