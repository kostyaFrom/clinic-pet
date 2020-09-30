package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.Speciality;
import com.korustlt.petclinic.model.Vet;
import com.korustlt.petclinic.sevices.SpecialitiesService;
import com.korustlt.petclinic.sevices.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialitiesService specialitiesService;

    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

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
        if (type.getSpecialities().size() > 0) {
            type.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality saveSpeciality = specialitiesService.save(speciality);
                    speciality.setId(saveSpeciality.getId());
                }
            });
        }
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
