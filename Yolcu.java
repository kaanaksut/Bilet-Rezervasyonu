class Yolcu {
    private String ad;
    private String soyad;
    private String tcKimlik;

    // yapıcı metot tanımladık
    public Yolcu(String ad, String soyad, String tcKimlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlik = tcKimlik;
    }

    // getter - setter tanımladık
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    @Override
    public String toString() {
        return "Yolcu [ad=" + ad + ", soyad=" + soyad + ", tcKimlik=" + tcKimlik + "]";
    }

    
}
