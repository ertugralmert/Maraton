package com.mert.ucuncusoru.entity;

public class Kus extends Hayvan{

    private Integer kanatUzunlugu;
    private Integer gagaUzunlugu;


    public Kus(String ad, byte yas, String tur, String renk, String yasamAlani, Integer kanatUzunlugu, Integer gagaUzunlugu) {
        super(ad, yas, tur, renk, yasamAlani);
        this.kanatUzunlugu = kanatUzunlugu;
        this.gagaUzunlugu = gagaUzunlugu;
    }

    public Integer getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(Integer kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public Integer getGagaUzunlugu() {
        return gagaUzunlugu;
    }

    public void setGagaUzunlugu(Integer gagaUzunlugu) {
        this.gagaUzunlugu = gagaUzunlugu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kus{");
        sb.append("kanatUzunlugu=").append(kanatUzunlugu);
        sb.append(", gagaUzunlugu=").append(gagaUzunlugu);
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
