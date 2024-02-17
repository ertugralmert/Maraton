package com.mert.ucuncusoru.controller;

import com.mert.ucuncusoru.service.KusService;

import java.util.Scanner;

public class KusController extends HayvanController{

    private final Scanner scanner = new Scanner(System.in);
    private final KusService kus = new KusService();

    @Override
    public final void hayvanOlustur() {
        System.out.println("Kuş oluşturma işlemi başlatıldı");
        System.out.print("Lütfen Kuş ismini giriniz:");
        String ad = scanner.nextLine();
        System.out.print("Kuşun yaşını giriniz: ");
        Byte yas = scanner.nextByte();
        String bug = scanner.nextLine();
        System.out.print("Kuşun Turunu giriniz: ");
        String  tur = scanner.nextLine();
        System.out.print("Kuşun rengi: ");
        String renk = scanner.nextLine();
        System.out.print("Kuşun yaşam alanı: ");
        String yasamAlani = scanner.nextLine();
        System.out.print("Kuşun kanat uzunluğu: ");
        Integer kanatUzunlugu = scanner.nextInt();
        String bug2 = scanner.nextLine();
        System.out.print("Kuşun gaga uzunlugu: ");
        Integer gagaUzunlugu = scanner.nextInt();
        String bug1 = scanner.nextLine();
        kus.hayvanOlusturma(ad,yas,tur,renk,yasamAlani);
        kus.gagaUzunluguGirme(gagaUzunlugu);
        kus.kanatUzunluguGirme(kanatUzunlugu);
    }

    @Override
    public final void hareketEt() {
        System.out.println(kus.harekEt());
    }

    @Override
    public final void yemekYe() {
        System.out.println(kus.yemekYe());
    }

    @Override
    public final void yasArttir() {
        System.out.println(kus.yasArttir());
    }

    @Override
    public final void uyuma() {
        System.out.println(kus.uyuma());
    }

    @Override
    public final void uyandirma() {
        System.out.println(kus.uyandirma());
    }

    @Override
    public final void listeleme() {
        System.out.println(kus.listeleme());
    }
}
