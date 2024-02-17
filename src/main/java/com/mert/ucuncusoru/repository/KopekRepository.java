package com.mert.ucuncusoru.repository;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Kopek;

public class KopekRepository extends HayvanRepository<Kopek> {


    @Override
    public void olusturulanHayvaniEkleme(Kopek kopek) {
        Hayvanlar.hayvanlar.add(kopek);
    }
}
