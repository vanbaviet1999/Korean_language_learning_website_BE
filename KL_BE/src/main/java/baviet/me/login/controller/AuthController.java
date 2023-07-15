package baviet.me.login.controller;

import baviet.me.login.model.User;
import baviet.me.login.payload.request.SignupRequest;
import baviet.me.login.service.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AuthController {
    @Autowired
    UserServices userServices;
    @GetMapping("")
    public String Login(){
        return "Login";
    }
    @PostMapping("/signup")
    public ResponseEntity<User> signup(@Valid @RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(userServices.save(signupRequest));
    }
}
