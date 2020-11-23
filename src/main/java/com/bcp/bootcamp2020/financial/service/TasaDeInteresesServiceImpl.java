package com.bcp.bootcamp2020.financial.service;

import com.bcp.bootcamp2020.financial.entity.TasaDeIntereses;
import com.bcp.bootcamp2020.financial.repository.TasaDeInteresesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasaDeInteresesServiceImpl implements TasaDeInteresesService {
    @Autowired
    TasaDeInteresesRepository tasaDeInteresesRepository;

    @Override
    public List<TasaDeIntereses> getTasaDeIntereses() {
        return tasaDeInteresesRepository.findAll();
    }

    @Override
    public Optional<TasaDeIntereses> getTasaDeInteresesById(Integer id) {
        return tasaDeInteresesRepository.findById(id);
    }

    @Override
    public TasaDeIntereses getTasaDeInteresesByInteresCode(String interesCode)
    {
        return tasaDeInteresesRepository.findByInteresCode(interesCode);
    }

    @Override
    public Double simulateCredit(String interesCode, Double monto, Integer meses) {
        // obtener la tasa de interes
        TasaDeIntereses tasaDeIntereses;
        tasaDeIntereses = tasaDeInteresesRepository.findByInteresCode(interesCode);

        // calcular el interés
        Double interes;
        interes = monto  * (meses / 12.0) * (tasaDeIntereses.interesMonto / 100.0);

        return interes;
    }
}
