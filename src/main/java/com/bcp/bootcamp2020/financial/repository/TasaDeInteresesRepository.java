package com.bcp.bootcamp2020.financial.repository;

import com.bcp.bootcamp2020.financial.entity.TasaDeIntereses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TasaDeInteresesRepository extends JpaRepository<TasaDeIntereses, Integer>, JpaSpecificationExecutor<TasaDeIntereses> {
    TasaDeIntereses findByInteresCode(String interesCode);
}