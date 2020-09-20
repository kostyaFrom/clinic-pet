package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Pet;
import com.korustlt.petclinic.sevices.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
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
        return super.save(type.getId(), type);
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
