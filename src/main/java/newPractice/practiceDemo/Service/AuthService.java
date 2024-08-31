//package newPractice.practiceDemo.Service;
//
//import newPractice.practiceDemo.Entity.LoginDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//import java.util.SplittableRandom;
//@Service
//public class AuthService {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    public String login(LoginDTO loginDTO){
//        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                loginDTO.getUsernameOrEmail(), loginDTO.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authenticate);
//
//        return "User Logged in successfully.";
//    }
//
//}
