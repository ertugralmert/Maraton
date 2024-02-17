package com.mert.ucuncusoru.entity;

public class Kedi extends Hayvan {



    private Integer kacCanli;

    public Kedi(){
        super();
    }

    public Kedi(String ad, byte yas, String tur, String renk, String yasamAlani, Integer kacCanli) {
        super(ad, yas, tur, renk, yasamAlani);
        this.kacCanli = kacCanli;
    }

    public Integer getKacCanli() {
        return kacCanli;
    }

    public void setKacCanli(Integer kacCanli) {
        this.kacCanli = kacCanli;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kedi{");
        sb.append("kacCanli=").append(kacCanli);
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", yas='").append(getYas()).append('\'');
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", renk='").append(getRenk()).append('\'');
        sb.append(", yasamAlani='").append(getYasamAlani()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
