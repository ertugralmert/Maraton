package com.mert.ucuncusoru.repository;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Hayvan;
import com.mert.ucuncusoru.entity.Kedi;

public class KediRepository extends HayvanRepository<Kedi>{


    @Override
    public void olusturulanHayvaniEkleme(Kedi kedi) {
        Hayvanlar.hayvanlar.add(kedi);
    }
}
