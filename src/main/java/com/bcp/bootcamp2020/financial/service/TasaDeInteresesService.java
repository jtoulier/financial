package com.bcp.bootcamp2020.financial.service;

import com.bcp.bootcamp2020.financial.entity.TasaDeIntereses;

import java.util.List;
import java.util.Optional;

public interface TasaDeInteresesService {
    public List<TasaDeIntereses> getTasaDeIntereses();
    public Optional<TasaDeIntereses> getTasaDeInteresesById(Integer id);
    public TasaDeIntereses getTasaDeInteresesByInteresCode(String code);

    Double simulateCredit(String interesCode, Double monto, Integer meses);
}
