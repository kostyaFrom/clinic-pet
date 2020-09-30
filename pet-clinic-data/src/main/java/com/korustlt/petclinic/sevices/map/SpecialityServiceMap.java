package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Speciality;
import com.korustlt.petclinic.sevices.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality type) {
        super.delete(type);
    }

    @Override
    public Speciality save(Speciality type) {
        return super.save(type);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
