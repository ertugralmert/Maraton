package com.mert.ucuncusoru.service;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Davranislar;
import com.mert.ucuncusoru.entity.Hayvan;
import com.mert.ucuncusoru.entity.Kedi;
import com.mert.ucuncusoru.repository.KediRepository;

public class KediService implements HayvanInterface , Davranislar {



 private KediRepository kedi = new KediRepository();
 private Kedi kediBilgileri;


 @Override
 public void hayvanOlusturma(String ad, byte yas, String tur, String renk, String yasamAlani) {
  Integer kacCanli = 9;
 Kedi yeniKedi = new Kedi(ad,yas,tur,renk,yasamAlani,kacCanli);
 this.kediBilgileri = yeniKedi;
  kedi.olusturulanHayvaniEkleme(yeniKedi);
 }
 public void kediKacCanli(Integer kacCanli){
  kediBilgileri.setKacCanli(kacCanli);

 }

 @Override
 public String listeleme() {
  StringBuilder listelemeHayvan = new StringBuilder();
for(Hayvan hayvan: Hayvanlar.hayvanlar) {
 listelemeHayvan.append(hayvan.toString().concat("\n"));
}return listelemeHayvan.toString();
 }

 @Override
 public String harekEt() {
return kediBilgileri.getAd().concat(" adlı kedi hareket etti");
 }

 @Override
 public String yemekYe() {
  return kediBilgileri.getAd().concat(" adlı kedi yemek yedi") ;
 }

 @Override
 public String yasArttir() {
  kediBilgileri.setYas((byte) (kediBilgileri.getYas()+(byte) 1));
  return kediBilgileri.getAd().concat(" adlı kedi yaş aldı ve yaşı: ") + (kediBilgileri.getYas());

 }

 @Override
 public String uyuma() {
  return kediBilgileri.getAd().concat(" adlı kedi uyudu");

 }

 @Override
 public String uyandirma() {
  return kediBilgileri.getAd().concat(" adlı kedi uyandu ");

 }


}
