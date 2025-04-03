package ma.khairy.userroles.services;

import ma.khairy.userroles.entities.Role;
import ma.khairy.userroles.entities.User;

public interface UserService {
    User addUser(User user);
    Role addRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByName(String roleName);
    void addRoleToUser(String username, String roleName);
    User authenticateUser(String username, String password);
}
