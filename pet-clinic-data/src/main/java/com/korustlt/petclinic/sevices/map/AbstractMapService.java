package com.korustlt.petclinic.sevices.map;

import com.korustlt.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T type) {
        if (type != null) {
            if (type.getId() == null) {
                type.setId(getNextId());
            }
            map.put(type.getId(), type);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return type;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T type) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(type));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
