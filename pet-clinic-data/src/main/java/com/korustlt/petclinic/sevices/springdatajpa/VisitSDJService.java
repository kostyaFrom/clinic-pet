package com.korustlt.petclinic.sevices.springdatajpa;

import com.korustlt.petclinic.model.Visit;
import com.korustlt.petclinic.repositories.VisitRepository;
import com.korustlt.petclinic.sevices.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJService implements VisitService {

    private final VisitRepository visitRepository;


    public VisitSDJService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit type) {
        return visitRepository.save(type);
    }

    @Override
    public void delete(Visit type) {
        visitRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
