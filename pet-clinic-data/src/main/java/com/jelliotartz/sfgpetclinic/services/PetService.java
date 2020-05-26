package com.jelliotartz.sfgpetclinic.services;

import com.jelliotartz.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
