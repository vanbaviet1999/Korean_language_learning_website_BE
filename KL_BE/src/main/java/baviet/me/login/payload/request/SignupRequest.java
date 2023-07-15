package baviet.me.login.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignupRequest {
    @NotBlank(message = "Username must not be blank")
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank(message = "Email must not be blank")
    @Size(max = 50,message = "Email must be less than 50 characters")
    @Email
    private String email;


    @NotBlank(message = "Password must not be blank")
    @Size(min = 6, max = 40,message = "Usernames can only be between 6 and 40 characters")
    private String password;

    @NotBlank(message = "First name must not be blank")
    @Size(max = 50,message = "First name must be less than 50 characters")
    private String first_name;
    @NotBlank(message = "Last name must not be blank")
    @Size(max = 50,message = "Last name must be less than 50 characters")
    private String last_name;
}
