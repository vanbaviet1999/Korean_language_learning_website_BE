package baviet.me.login.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "user_id")
    private int user_id;
    @JoinColumn(name = "user_name", unique = true)
    @NotBlank
    @Size(min = 5, max = 50)
    private String username;
    @JoinColumn(name = "password")
    @NotBlank
    @Size(min = 5, max = 256)
    private String password;
    @JoinColumn(name = "first_name")
    @NotBlank
    @Size(max = 50)
    private String first_name;
    @JoinColumn(name = "email")
    @NotBlank
    @Size(max = 50)
    private String email;
    @JoinColumn(name = "last_name")
    @NotBlank
    @Size(max = 50)
    private String last_name;
}
