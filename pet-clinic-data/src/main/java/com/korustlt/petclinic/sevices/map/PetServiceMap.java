package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Pet;
import com.korustlt.petclinic.sevices.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet type) {
        return super.save(type);
    }

    @Override
    public void delete(Pet type) {
        super.delete(type);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
