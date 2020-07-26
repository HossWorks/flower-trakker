package org.hoss.flowertrakker.repository;

import org.hoss.flowertrakker.models.GiftingMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftingMethodRepository extends CrudRepository<GiftingMethod, Long> {
}
