package com.rodrigo.gadda.demo.repository;

import java.util.UUID;

import com.rodrigo.gadda.demo.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<PhoneEntity, UUID> {

}
