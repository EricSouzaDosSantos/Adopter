package com.adocao.pet.api_adocao.Repository;

import com.adocao.pet.api_adocao.Model.Entity.AdoptionInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptionRepository extends JpaRepository<AdoptionInformation, Long> {
}
