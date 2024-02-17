package com.mert.ikincisoru;

public class CustomStringTr {



    public int uzunluk(String metin){
        return metin.length();
    }

    public boolean esitlikDurumu(String metin, String metin2){
        return metin.equalsIgnoreCase(metin2);
    }

    public String kucukHarf(String metin){
        return metin.toLowerCase();
    }

    public String buyukHarf(String metin){
        return metin.toUpperCase();
    }

    public String degistir(String metin,String eski,String yeni){
        return metin.replace(eski,yeni);
    }

    public boolean metinIcindeVarMi(String metin,String aranacakMetin){
        return metin.contains(aranacakMetin);
    }

    public int indeksArama(String metin, String aranacakHarf){
        return metin.indexOf(aranacakHarf);
    }

    public char karakter(String metin,int index){
        return metin.charAt(index);
    }

    public String metinEkleme(String metin1, String metin2){
        return metin1.concat(" ").concat(metin2);
    }

    public String boslukYokEtme(String metin){
        return metin.trim();
    }


}
