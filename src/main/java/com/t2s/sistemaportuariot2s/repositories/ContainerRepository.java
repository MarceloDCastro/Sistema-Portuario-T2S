package com.t2s.sistemaportuariot2s.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.t2s.sistemaportuariot2s.model.Container;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Long> {

}
