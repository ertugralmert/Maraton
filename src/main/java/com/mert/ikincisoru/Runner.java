package com.mert.ikincisoru;

public class Runner {

    public static void main(String[] args) {

        CustomStringTr turkce = new CustomStringTr();

        System.out.println(turkce.esitlikDurumu("ahmet","mert"));
        System.out.println(turkce.buyukHarf("mert"));
        System.out.println(turkce.kucukHarf("AHMET"));
        System.out.println(turkce.degistir("şelae","ş","s"));
        System.out.println(turkce.metinIcindeVarMi("selamlar bugün sınavım var","b"));
        System.out.println(turkce.indeksArama("mert","m"));
        System.out.println(turkce.karakter("merhaba",4));
        System.out.println(turkce.uzunluk("selamlar ben bir dünyalıyım"));
        System.out.println(turkce.metinEkleme("merhaba dünya", "ben java öğreniyorum"));
        System.out.println(turkce.boslukYokEtme("  selamlar ben bir süper programcıyım     "));



    }
}
