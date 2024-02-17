package com.mert.ucuncusoru.entity;

public class Kopek extends Hayvan {

    private byte bildigiKomutSayisi;

    public byte getBildigiKomutSayisi() {
        return bildigiKomutSayisi;
    }



    public void setBildigiKomutSayisi(byte bildigiKomutSayisi) {
        this.bildigiKomutSayisi = bildigiKomutSayisi;
    }



    public Kopek(String ad, byte yas, String tur, String renk, String yasamAlani, byte bildigiKomutSayisi) {
        super(ad, yas, tur, renk, yasamAlani);
        this.bildigiKomutSayisi = bildigiKomutSayisi;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kopek{");
        sb.append("bildigiKomutSayisi=").append(bildigiKomutSayisi);
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", yas=").append(getYas());
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", renk='").append(getRenk()).append('\'');
        sb.append(", yasamAlani='").append(getYasamAlani()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
