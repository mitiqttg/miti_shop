package com.ecommerce.project.repositories;

import com.ecommerce.project.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.project.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
