package com.rodrigo.gadda.demo.repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import com.rodrigo.gadda.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<UserEntity, UUID> {

	Optional<UserEntity> findByEmail(String email);

	@Transactional
	@Modifying
	@Query("UPDATE UserEntity u SET u.token = :nuevoToken, u.last_login = :last_login WHERE u.email = :email")
	int actualizarTokenYLastLoginPorEmail(@Param("nuevoToken") String nuevoToken, @Param("email") String email, @Param("last_login") LocalDate last_login);

}
