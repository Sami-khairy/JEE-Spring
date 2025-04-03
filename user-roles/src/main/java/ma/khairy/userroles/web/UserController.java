package ma.khairy.userroles.web;

import ma.khairy.userroles.entities.User;
import ma.khairy.userroles.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("users/{username}")
    public User getUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }
}
