package com.mert.ucuncusoru.service;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Davranislar;
import com.mert.ucuncusoru.entity.Hayvan;
import com.mert.ucuncusoru.entity.Kus;
import com.mert.ucuncusoru.repository.KusRepository;

public class KusService implements HayvanInterface, Davranislar {

    private KusRepository kus = new KusRepository();
    private Kus kusBilgileri;

    @Override
    public String harekEt() {
        return kusBilgileri.getAd().concat(" adlı kuş uçtu");
    }

    @Override
    public String yemekYe() {
        return kusBilgileri.getAd().concat(" adlı kuş yemek yedi");
    }

    @Override
    public String yasArttir() {
        kusBilgileri.setYas((byte) (kusBilgileri.getYas()+1));
        return kusBilgileri.getAd().concat(" adlı kuş yaş aldı ve yaşı: "+(kusBilgileri.getAd()));
    }

    @Override
    public String uyuma() {
        return kusBilgileri.getAd().concat(" adlı kuş uyudu");
    }

    @Override
    public String uyandirma() {
        return kusBilgileri.getAd().concat(" adlı kuş uyandı");
    }

    @Override
    public void hayvanOlusturma(String ad, byte yas, String tur, String renk, String yasamAlani) {
        Integer gagaUzunlugu = 4;
        Integer kanatUzunlugu = 5;
        Kus yeniKus = new Kus(ad,yas,tur,renk,yasamAlani,kanatUzunlugu,gagaUzunlugu);
        this.kusBilgileri = yeniKus;
        kus.olusturulanHayvaniEkleme(yeniKus);
    }

    public void gagaUzunluguGirme(Integer gagaUzunlugu){
        kusBilgileri.setGagaUzunlugu(gagaUzunlugu);
    }
    public void kanatUzunluguGirme(Integer kanatUzunlugu){
        kusBilgileri.setKanatUzunlugu(kanatUzunlugu);
    }

    @Override
    public String listeleme() {
        StringBuilder listelemeHayvan = new StringBuilder();
        for(Hayvan hayvan: Hayvanlar.hayvanlar) {
            listelemeHayvan.append(hayvan.toString().concat("\n"));
        }return listelemeHayvan.toString();
    }
}
