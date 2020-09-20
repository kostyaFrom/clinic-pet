package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Owner;
import com.korustlt.petclinic.sevices.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner type) {
        return super.save(type.getId(), type);
    }

    @Override
    public void delete(Owner type) {
        super.delete(type);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
