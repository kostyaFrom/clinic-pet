package com.korustlt.petclinic.bootstrap;

import com.korustlt.petclinic.model.Owner;
import com.korustlt.petclinic.model.Pet;
import com.korustlt.petclinic.model.PetType;
import com.korustlt.petclinic.model.Vet;
import com.korustlt.petclinic.sevices.OwnerService;
import com.korustlt.petclinic.sevices.PetTypeService;
import com.korustlt.petclinic.sevices.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Grove Street");
        owner1.setCity("LA");
        owner1.setTelephone("893723569645");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glean");
        owner2.setAddress("123 Avenue Street");
        owner2.setCity("NY");
        owner2.setTelephone("893758946500");
        Pet fionaPet = new Pet();
        fionaPet.setPetType(savedCatPetType);
        fionaPet.setOwner(owner2);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setName("Margo");
        owner2.getPets().add(fionaPet);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jess");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
