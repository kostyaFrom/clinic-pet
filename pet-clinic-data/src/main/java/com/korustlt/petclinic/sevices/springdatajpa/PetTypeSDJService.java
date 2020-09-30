package com.korustlt.petclinic.sevices.springdatajpa;

import com.korustlt.petclinic.model.PetType;
import com.korustlt.petclinic.repositories.PetTypeRepository;
import com.korustlt.petclinic.sevices.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType type) {
        return petTypeRepository.save(type);
    }

    @Override
    public void delete(PetType type) {
        petTypeRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
