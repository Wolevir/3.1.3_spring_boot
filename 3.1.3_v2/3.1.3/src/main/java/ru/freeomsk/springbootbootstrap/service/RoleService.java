package ru.freeomsk.springbootbootstrap.service;

import ru.freeomsk.springbootbootstrap.model.Role;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
