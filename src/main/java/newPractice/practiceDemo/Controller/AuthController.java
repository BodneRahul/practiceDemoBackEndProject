//package newPractice.practiceDemo.Controller;
//
//import newPractice.practiceDemo.Entity.LoginDTO;
//import newPractice.practiceDemo.Service.AuthService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//public class AuthController {
//    @Autowired
//    private AuthService authService;
//@PostMapping(value = {"/login","/signin"})
//    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO){
//        String login = authService.login(loginDTO);
//        return ResponseEntity.ok(login);
//
//    }
//
//}
