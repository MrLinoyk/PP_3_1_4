package ru.vtagin.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vtagin.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
}
