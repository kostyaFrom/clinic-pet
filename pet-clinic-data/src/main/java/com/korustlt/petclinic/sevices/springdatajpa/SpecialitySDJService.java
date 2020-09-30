package com.korustlt.petclinic.sevices.springdatajpa;

import com.korustlt.petclinic.model.Speciality;
import com.korustlt.petclinic.repositories.SpecialityRepository;
import com.korustlt.petclinic.sevices.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJService implements SpecialitiesService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality type) {
        return specialityRepository.save(type);
    }

    @Override
    public void delete(Speciality type) {
        specialityRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
