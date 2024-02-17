package com.mert.ucuncusoru.entity;

import java.util.UUID;

public class Hayvan {

    private String id;

    private String ad;
    private byte yas;
    private String tur;

    private String renk;

    private String yasamAlani;

    private static Integer hayvanSayisi= 0;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public byte getYas() {
        return yas;
    }

    public void setYas(byte yas) {
        this.yas = yas;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }

    public static Integer getHayvanSayisi() {
        return hayvanSayisi;
    }

    public static void setHayvanSayisi(Integer hayvanSayisi) {
        Hayvan.hayvanSayisi = hayvanSayisi;
    }

    public Hayvan() {
        this.id = UUID.randomUUID().toString();
    }

    public Hayvan(String ad, byte yas, String tur, String renk, String yasamAlani) {
        this();
        this.ad = ad;
        this.yas = yas;
        this.tur = tur;
        this.renk = renk;
        this.yasamAlani = yasamAlani;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hayvan{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", yas='").append(yas).append('\'');
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", renk='").append(renk).append('\'');
        sb.append(", yasamAlani='").append(yasamAlani).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
