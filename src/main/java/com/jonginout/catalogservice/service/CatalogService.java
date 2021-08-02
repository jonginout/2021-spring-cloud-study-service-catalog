package com.jonginout.catalogservice.service;

import com.jonginout.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
