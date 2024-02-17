package com.mert.ucuncusoru.controller;

import com.mert.ucuncusoru.service.KediService;

import java.util.Scanner;

public class KediController extends HayvanController {

    Scanner scanner = new Scanner(System.in);

    private KediService kedi = new KediService();

    @Override
    public void hayvanOlustur() {
        System.out.println("Kopek oluşturma işlemi başlatıldı");
        System.out.print("Lütfen Kedinin ismini giriniz:");
        String ad = scanner.nextLine();
        System.out.print("KEdinin yaşını giriniz: ");
        Byte yas = scanner.nextByte();
        String bug = scanner.nextLine();
        System.out.print("Kedinin Turunu giriniz: ");
        String  tur = scanner.nextLine();
        System.out.print("Kedinin rengi: ");
        String renk = scanner.nextLine();
        System.out.print("Kedinin yaşam alanı: ");
        String yasamAlani = scanner.nextLine();
        System.out.print("Kedi Kac Canli: ");
        Integer kacCanli = scanner.nextInt();
        String bug1 = scanner.nextLine();
        kedi.hayvanOlusturma(ad,yas,tur,renk,yasamAlani);
        kedi.kediKacCanli(kacCanli);
    }

    public void hareketEt(){
        System.out.println(kedi.harekEt());
    }

    public void yemekYe(){
        System.out.println(kedi.yemekYe());
    }

    public void yasArttir(){
        System.out.println(kedi.yasArttir());
    }

    public void uyuma(){
        System.out.println(kedi.uyuma());
    }

    public void uyandirma(){
        System.out.println(kedi.uyandirma());
    }

    @Override
    public void listeleme() {
        System.out.println(kedi.listeleme());
    }
}
