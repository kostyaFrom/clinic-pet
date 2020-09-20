package com.korustlt.petclinic.sevices;

import com.korustlt.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
