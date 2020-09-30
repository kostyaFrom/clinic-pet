package com.korustlt.petclinic.sevices.springdatajpa;

import com.korustlt.petclinic.model.Pet;
import com.korustlt.petclinic.repositories.PetRepository;
import com.korustlt.petclinic.sevices.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJService implements PetService {

    private final PetRepository petRepository;

    public PetSDJService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet type) {
        return petRepository.save(type);
    }

    @Override
    public void delete(Pet type) {
        petRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
