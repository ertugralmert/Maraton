package com.mert.ucuncusoru.repository;

import com.mert.ucuncusoru.database.Hayvanlar;
import com.mert.ucuncusoru.entity.Kedi;

public abstract class HayvanRepository<T> {

    public abstract void olusturulanHayvaniEkleme(T entity);


}
