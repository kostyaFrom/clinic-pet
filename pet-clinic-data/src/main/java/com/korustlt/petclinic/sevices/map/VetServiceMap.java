package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Vet;
import com.korustlt.petclinic.sevices.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet type) {
        return super.save(type);
    }

    @Override
    public void delete(Vet type) {
        super.delete(type);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
