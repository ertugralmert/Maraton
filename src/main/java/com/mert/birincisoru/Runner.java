package com.mert.birincisoru;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        SayiDizisi sayiDizisi = new SayiDizisi();
        sayiDizisi.add(5);
        sayiDizisi.add(1);
        sayiDizisi.add(2,10);
        sayiDizisi.add(12);
        sayiDizisi.add(1231);
        sayiDizisi.add(456);
        sayiDizisi.remove(12);
        System.out.println(Arrays.toString(sayiDizisi.listele()));

    }
}
