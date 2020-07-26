package org.hoss.flowertrakker.repository;

import org.hoss.flowertrakker.models.FlowerType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerTypeRepository extends CrudRepository<FlowerType, Long> {
}
