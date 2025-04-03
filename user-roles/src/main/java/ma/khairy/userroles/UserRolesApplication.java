package ma.khairy.userroles;

import ma.khairy.userroles.entities.Role;
import ma.khairy.userroles.entities.User;
import ma.khairy.userroles.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserRolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRolesApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService) {
		return args -> {
			User user = new User();
			user.setUsername("khairy");
			user.setPassword("1234");
			userService.addUser(user);

			User user2 = new User();
			user2.setUsername("khairy2");
			user2.setPassword("1234");
			userService.addUser(user2);

			Role role = new Role();
			role.setRoleName("ROLE_ADMIN");
			userService.addRole(role);

			Role role2 = new Role();
			role2.setRoleName("ROLE_USER");
			userService.addRole(role2);

			userService.addRoleToUser("khairy", "ROLE_ADMIN");
			userService.addRoleToUser("khairy2", "ROLE_USER");

			try {
				User user1 = userService.authenticateUser("khairy", "1234");
				System.out.println("khairy is authenticated");
				user1.getRoles().forEach(r->{
					System.out.println(r.getRoleName());
				});
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}
}
