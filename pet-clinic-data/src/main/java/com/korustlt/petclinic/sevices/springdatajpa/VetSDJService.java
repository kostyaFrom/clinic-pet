package com.korustlt.petclinic.sevices.springdatajpa;

import com.korustlt.petclinic.model.Vet;
import com.korustlt.petclinic.repositories.VetRepository;
import com.korustlt.petclinic.sevices.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet type) {
        return vetRepository.save(type);
    }

    @Override
    public void delete(Vet type) {
        vetRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
