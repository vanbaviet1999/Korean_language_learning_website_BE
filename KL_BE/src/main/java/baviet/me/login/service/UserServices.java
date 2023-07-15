package baviet.me.login.service;

import baviet.me.login.model.User;
import baviet.me.login.payload.request.SignupRequest;
import baviet.me.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User save(SignupRequest signupRequest){
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setFirst_name(signupRequest.getFirst_name());
        user.setLast_name(signupRequest.getLast_name());
        return userRepository.save(user);
    }


}
