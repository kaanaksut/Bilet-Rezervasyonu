class Ucus {
    private String kalkisYeri;
    private String varisYeri;
    private String tarih;
    private int koltukSayisi;
    private Yolcu[] yolcular;

    // yapıcı metot
    public Ucus(String kalkisYeri, String varisYeri, String tarih, int koltukSayisi, Yolcu[] yolcular) {
        this.kalkisYeri = kalkisYeri;
        this.varisYeri = varisYeri;
        this.tarih = tarih;
        this.koltukSayisi = koltukSayisi;
        this.yolcular = yolcular;
    }

    public boolean rezervasyonYap(Yolcu yolcu, int koltukNo) {
        if (koltukNo < 1 || koltukNo > koltukSayisi) {
            System.out.println("Geçersiz koltuk numarası!");
            return false;
        }
        if (yolcular[koltukNo - 1] == null) {
            yolcular[koltukNo - 1] = yolcu;
            System.out.println("Rezervasyon başarılıdır.\n " + yolcu.toString() + "\nKoltuk No: " + koltukNo);
            return true;
        } else {
            System.out.println("Bu koltuk doludur.");
            return false;
        }
    }

    public void ucusGoster() {
        System.out.println("Ucus Bilgisi: \nKalkis Yeri:" + kalkisYeri + "\nVaris Yeri: " + varisYeri +
                "\nTarih: " + tarih + "\nToplam Koltuk Sayisi: " + koltukSayisi);
    }
}
