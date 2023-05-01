package com.elearningweb.library.repository;

import com.elearningweb.library.model.ERole;
import com.elearningweb.library.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Connect to database
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
