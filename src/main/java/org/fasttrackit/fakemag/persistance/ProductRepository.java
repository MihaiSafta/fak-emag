package org.fasttrackit.fakemag.persistance;

import org.fasttrackit.fakemag.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
