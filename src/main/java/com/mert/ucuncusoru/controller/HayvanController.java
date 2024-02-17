package com.mert.ucuncusoru.controller;

public class HayvanController {


    /**
     * Hayvan adi, yas,tur,renk ve yasam alanlarını giriniz.
     * Sonrasında girilen diğer değişkenler için her hayvan varlığı için
     * oluşturulmuş methodları çağırırız
     */
    public void hayvanOlustur(){
        System.out.println("hayvan oluşturuldu");
    }

    public void hareketEt(){
        System.out.println("hayvan haraket etti");
    }

    public void yemekYe(){
        System.out.println("hayvan yemek yedi");
    }


    public void yasArttir(){
        System.out.println("hayvanın yaşı arttırıldı");
    }

    /**
     * Oluşturulan hayvanın uyutma işlemi gerçekleştirilir.
     */
    public void uyuma(){
        System.out.println("hayvan uyutuldu");
    }

    /**
     * Oluşturulan hayvanın uyanması sağlanır.
     */
    public void uyandirma(){
        System.out.println("hayvan uyandırıldı");
    }

    /**
     * Oluşturulan hayvanların listesi çağrılır
     */
    public void listeleme(){
        System.out.println("hayvanlar listelendi");
    }
}
