package org.example.repository;

import org.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Репозиторий: работа с базой данных (готовые методы save, findAll и др.)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
