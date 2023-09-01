package Tugas2;

public class Main {
    public static void main(String[] args) {
        BangunRuang kubus = new BangunRuang(5);
        BangunRuang balok = new BangunRuang();
        balok.setPanjang(10);
        balok.setLebar(5);
        balok.setTinggi(7);
        BangunRuang balok2 = new BangunRuang(10, 5, 4);
        BangunRuang bola = new BangunRuang();
        bola.setJariJari(19.9);

        System.out.println("Perhitungan volume dan luas untuk setiap objek: ");
        System.out.println();

        System.out.println("Hasil Perhitungan 'Kubus': ");
        System.out.println("Volume Kubus dengan sisi " + kubus.getSisi() + " adalah " + kubus.hitungVolumeKubus());
        System.out.println("Luas permukaan Kubus dengan sisi " + kubus.getSisi() + " adalah " + kubus.hitungLuasKubus());
        System.out.println();

        System.out.println("Hasil Perhitungan 'Balok': ");
        System.out.println("Volume Balok dengan panjang " + balok.getPanjang() + ", lebar " + balok.getLebar() + ", dan tinggi " + balok.getTinggi() + " adalah " + balok.hitungVolumeBalok());
        System.out.println("Luas permukaan Balok dengan panjang " + balok.getPanjang() + ", lebar " + balok.getLebar() + ", dan tinggi " + balok.getTinggi() + " adalah " + balok.hitungLuasBalok());
        System.out.println();

        System.out.println("Hasil perhitungan 'Balok2': ");
        System.out.println("Volume Balok dengan panjang " + balok2.getPanjang() + ", lebar " + balok2.getLebar() + ", dan tinggi " + balok2.getTinggi() + " adalah " + balok2.hitungVolumeBalok());
        System.out.println("Luas permukaan Balok dengan panjang " + balok2.getPanjang() + ", lebar " + balok2.getLebar() + ", dan tinggi " + balok2.getTinggi() + " adalah " + balok2.hitungLuasBalok());
        System.out.println();

        System.out.println("Hasil Perhitungan  'Bola': ");
        System.out.println("Volume Bola dengan jari-jari " + bola.getJariJari() + " adalah " + bola.hitungVolumeBola());
        System.out.println("Luas permukaan Lingkaran dengan jari-jari " + bola.getJariJari() + " adalah " + bola.hitungLuasBola());
        System.out.println();
    }
}
