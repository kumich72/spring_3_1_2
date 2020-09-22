package ru.javamentor.springboot.dto;

import ru.javamentor.springboot.model.Role;
import ru.javamentor.springboot.model.User;

import java.util.List;
import java.util.Map;

public class UserRole {
    private ru.javamentor.springboot.model.User User;
    private List<Role> roles;
    private Map<String, Boolean> rolesUser;

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public UserRole(User user, List<Role> roles, Map<String, Boolean> rolesUser) {
        User = user;
        this.roles = roles;
        this.rolesUser = rolesUser;
    }

    public UserRole() {
    }

    public Map<String, Boolean> getRolesUser() {
        return rolesUser;
    }

    public void setRolesUser(Map<String, Boolean> rolesUser) {
        this.rolesUser = rolesUser;
    }
}