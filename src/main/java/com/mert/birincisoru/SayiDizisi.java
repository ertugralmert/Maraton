package com.mert.birincisoru;

import java.util.Arrays;

public class SayiDizisi {

    private Integer[] sayilar;
    private  int size = 0;

   public SayiDizisi(){
       sayilar = new Integer[2]; //-> burayı kontrol edeceğim uzun vermeden yapamıyorum belki null'dan ilerlerim
       size = 0;
   }
   private void eklemeYap(){
       Integer[] genisletilmisDizi = new Integer[sayilar.length*2];
       for (int i = 0; i < sayilar.length; i++){
           genisletilmisDizi[i]= sayilar[i];
       }
       sayilar = genisletilmisDizi;
   }


    /**
     * Öncelikle dizinin full olup olmadığını kontrol ediyoruz
     * Dolu ise dizinin uzunluğunu arttıracağız.
     * @param sayi
     */
   public void add(int sayi){
      if ( size == sayilar.length){
          eklemeYap();
      }
      sayilar[size++] = sayi;
   }


   public void remove (Integer sayi){

       for(int i = 0; i<size; i++){
           if(sayilar[i].equals(sayi)){
               for (int j = i; j<size -1; j++){
                   sayilar[j] = sayilar[j+1];
               }
               sayilar[size -1] = null;
               size--;
               break;
           }

       }
   }

   public void add(int index,int sayi){
       if(index<0 || index> size){
           System.out.println("geçersiz index");
       }
       if (size == sayilar.length){
           eklemeYap();
       }
       for(int i = size; i>index; i--){
           sayilar[i] = sayilar[i-1];
       }
       sayilar[index] = sayi;
       size++;
   }

   public Integer[] listele(){
       Integer[] listelemeDizi = new Integer[size];
       for(int i = 0; i< size;i++){
           listelemeDizi[i] = sayilar[i];
       }
       return listelemeDizi;
   }



}


