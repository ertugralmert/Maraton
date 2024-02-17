package com.mert.ucuncusoru;

import com.mert.ucuncusoru.controller.HayvanController;
import com.mert.ucuncusoru.controller.KediController;
import com.mert.ucuncusoru.controller.KopekController;
import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Hayvan;
import com.mert.ucuncusoru.entity.Kedi;
import com.mert.ucuncusoru.entity.Kopek;
import com.mert.ucuncusoru.service.HayvanInterface;

public class Runner {

    public static void main(String[] args) {

        HayvanController hayvan = new KediController();
        hayvan.hayvanOlustur();
        hayvan.uyandirma();
        hayvan.uyuma();
        hayvan.yasArttir();
        hayvan.listeleme();

        hayvan = new KopekController();

        hayvan.hayvanOlustur();
        hayvan.uyuma();
        hayvan.uyandirma();
        hayvan.yasArttir();
        hayvan.listeleme();



    }
}
