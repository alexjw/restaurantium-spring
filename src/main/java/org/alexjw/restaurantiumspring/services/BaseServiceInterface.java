package org.alexjw.restaurantiumspring.services;

import org.alexjw.restaurantiumspring.domains.BaseDomain;

import java.util.List;

public interface BaseServiceInterface<DOM extends BaseDomain> {

    public List<DOM> getAll();

    public DOM getById(Integer id);

    public DOM save(DOM dto);

    public void delete(Integer id);
}
