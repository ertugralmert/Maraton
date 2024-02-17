package com.mert.ucuncusoru.controller;

import com.mert.ucuncusoru.service.KediService;

import java.util.Scanner;

public class KediController extends HayvanController {

  private final   Scanner scanner = new Scanner(System.in);

    private final KediService kedi = new KediService();

    @Override
    public final void hayvanOlustur() {
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

    public final void hareketEt(){
        System.out.println(kedi.harekEt());
    }

    public final void yemekYe(){
        System.out.println(kedi.yemekYe());
    }

    public final void yasArttir(){
        System.out.println(kedi.yasArttir());
    }

    public final void uyuma(){
        System.out.println(kedi.uyuma());
    }

    public final void uyandirma(){
        System.out.println(kedi.uyandirma());
    }

    @Override
    public final void listeleme() {
        System.out.println(kedi.listeleme());
    }
}
