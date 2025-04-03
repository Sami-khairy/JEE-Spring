package ma.khairy.userroles.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Entity @Table(name = "users")
public class User {
    @Id
    private String userId;
    @Column(unique = true, length = 20)
    private String username;
    private String password;
    @ManyToMany(mappedBy = "users", fetch = jakarta.persistence.FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

}
