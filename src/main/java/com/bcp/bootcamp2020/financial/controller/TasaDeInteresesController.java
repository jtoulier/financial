package com.bcp.bootcamp2020.financial.controller;

import com.bcp.bootcamp2020.financial.entity.TasaDeIntereses;
import com.bcp.bootcamp2020.financial.service.TasaDeInteresesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TasaDeInteresesController {
    @Autowired
    TasaDeInteresesService tasaDeInteresesService;

    @GetMapping("/api/tasas")
    public List<TasaDeIntereses> getTasasDeIntereses() {
        return tasaDeInteresesService.getTasaDeIntereses();
    }

    @GetMapping("/api/tasas/{id}")
    public Optional<TasaDeIntereses> getTasasDeIntereses(@PathVariable Integer id) {
        return tasaDeInteresesService.getTasaDeInteresesById(id);
    }

    @GetMapping("/api/simulation/{interesCode}/{monto}/{meses}")
    public Double simulateCredit(
        @PathVariable String interesCode,
        @PathVariable Double monto,
        @PathVariable Integer meses
    ) {
        return tasaDeInteresesService.simulateCredit(interesCode, monto, meses);
    }
}
