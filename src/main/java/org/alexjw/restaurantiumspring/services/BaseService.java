package org.alexjw.restaurantiumspring.services;

import org.alexjw.restaurantiumspring.domains.BaseDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseService<DOM extends BaseDomain, REP extends JpaRepository<DOM, Integer>> {

    REP repository;

    public BaseService(REP repository) {
        this.repository = repository;
    }

    public List<DOM> getAll() {
        return repository.findAll();
    }

    public DOM getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public DOM save(DOM dom) {
        return repository.save(dom);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
