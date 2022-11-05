import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("=======APLIKASI KLIKIK BROTOMULYO========");
        System.out.println("=========================================");
        System.out.println();
        Dokter Dokter = new Dokter();
        Dokter.isi_data();
        Dokter.update_data();
        KaryawanAdministrasi KaryawanAdministrasi = new KaryawanAdministrasi();
        KaryawanAdministrasi.isi_data();
        KaryawanAdministrasi.update_data();
        Pasien Pasien = new Pasien();
        Pasien.isi_data();
        Pasien.update_data();
        Perawat Perawat = new Perawat();
        Perawat.isi_data();
        Perawat.update_data();
        KlinikBrotomulyo KlinikBrotomulyo = new KlinikBrotomulyo();
        KlinikBrotomulyo.lihat_data();
        Berobat Berobat = new Berobat();
        Berobat.isi_data();
        Berobat.lihat_data();
        Berobat.update_data();
    }
}