package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.PetType;
import com.korustlt.petclinic.sevices.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType type) {
        super.delete(type);
    }

    @Override
    public PetType save(PetType type) {
        return super.save(type);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
