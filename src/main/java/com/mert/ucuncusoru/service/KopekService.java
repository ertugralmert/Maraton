package com.mert.ucuncusoru.service;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Davranislar;
import com.mert.ucuncusoru.entity.Hayvan;
import com.mert.ucuncusoru.entity.Kopek;
import com.mert.ucuncusoru.repository.KopekRepository;

public class KopekService implements  HayvanInterface, Davranislar {

    private KopekRepository kopek = new KopekRepository();
    private Kopek kopekBilgileri;


    @Override
    public String harekEt() {
        return kopekBilgileri.getAd().concat(" adlı kopek hareket etti.");
    }

    @Override
    public String yemekYe() {
        return kopekBilgileri.getAd().concat(" adlı kopek yemek yedi");
    }

    @Override
    public String yasArttir() {
        kopekBilgileri.setYas((byte)(kopekBilgileri.getYas()+1));
        return kopekBilgileri.getAd().concat(" adlı kopek yaş aldı ve yaşı: ") + (kopekBilgileri.getYas());
    }

    @Override
    public String uyuma() {
        return kopekBilgileri.getAd().concat(" adlı kopek uyudu");
    }

    @Override
    public String uyandirma() {
        return kopekBilgileri.getAd().concat(" adlı kopek uyandırıldı");
    }

    @Override
    public void hayvanOlusturma(String ad, byte yas, String tur, String renk, String yasamAlani) {
        byte bildigiKomutSayisi= 4;
        Kopek yeniKopek = new Kopek(ad,yas,tur,renk,yasamAlani,bildigiKomutSayisi);
        this.kopekBilgileri = yeniKopek;
        kopek.olusturulanHayvaniEkleme(yeniKopek);
    }
    public void bildigiKomutSayisi(byte komutSayisi){
        kopekBilgileri.setBildigiKomutSayisi(komutSayisi);
    }

    @Override
    public String listeleme() {
        StringBuilder listelemeHayvan = new StringBuilder();
        for(Hayvan hayvan: Hayvanlar.hayvanlar) {
            listelemeHayvan.append(hayvan.toString().concat("\n"));
        }return listelemeHayvan.toString();
    }
}
