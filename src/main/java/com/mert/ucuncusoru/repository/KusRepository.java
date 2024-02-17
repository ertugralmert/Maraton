package com.mert.ucuncusoru.repository;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Kus;

public class KusRepository extends HayvanRepository<Kus>{


    @Override
    public void olusturulanHayvaniEkleme(Kus kus) {
        Hayvanlar.hayvanlar.add(kus);
    }
}
