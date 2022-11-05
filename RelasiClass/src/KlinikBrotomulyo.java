public class KlinikBrotomulyo {
    int id_klinik;
    String nama_klinik;
    String alamat_klinik;

     void lihat_data(){
        PoliUmum PoliUmum = new PoliUmum();
        PoliGigi PoliGigi = new PoliGigi();
        PoliPenyakitDalam PoliPenyakitDalam = new PoliPenyakitDalam();
        System.out.println("=========================================");
        System.out.println("==============DAFTAR POLI================");
        System.out.println("=========================================");
        System.out.println("NO |     NAMA POLI ");
        PoliUmum.lihat_data();
        PoliGigi.lihat_data();
        PoliPenyakitDalam.lihat_data();
        System.out.println("=========================================");



    }


}
