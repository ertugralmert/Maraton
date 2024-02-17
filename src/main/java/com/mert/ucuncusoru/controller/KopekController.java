package com.mert.ucuncusoru.controller;

import com.mert.ucuncusoru.service.KopekService;

import java.util.Scanner;

public class KopekController extends HayvanController{

 private    Scanner scanner = new Scanner(System.in);

 private KopekService kopek = new KopekService();

    @Override
    public void hayvanOlustur() {
        System.out.println("Kopek oluşturma işlemi başlatıldı");
        System.out.print("Lütfen Kopek ismini giriniz:");
        String ad = scanner.nextLine();
        System.out.print("Köpeğin yaşını giriniz: ");
        Byte yas = scanner.nextByte();
        String bug = scanner.nextLine();
        System.out.print("Köpeğin Turunu giriniz: ");
        String  tur = scanner.nextLine();
        System.out.print("Köpeğin rengi: ");
        String renk = scanner.nextLine();
        System.out.print("Köpeğin yaşam alanı: ");
        String yasamAlani = scanner.nextLine();
        System.out.print("Köpeğin Bildiği Komut Sayısı: ");
        byte bildigiKomutSayisi = scanner.nextByte();
        String bug1 = scanner.nextLine();
        kopek.hayvanOlusturma(ad,yas,tur,renk,yasamAlani);
        kopek.bildigiKomutSayisi(bildigiKomutSayisi);

    }

    @Override
    public void hareketEt() {
        System.out.println(kopek.harekEt());
    }

    @Override
    public void yemekYe() {
        System.out.println(kopek.yemekYe());
    }

    @Override
    public void yasArttir() {
        System.out.println(kopek.yasArttir());
    }

    @Override
    public void uyuma() {
        System.out.println(kopek.uyuma());
    }

    @Override
    public void uyandirma() {
        System.out.println(kopek.uyandirma());
    }

    @Override
    public void listeleme() {
        System.out.println(kopek.listeleme());
    }
}
