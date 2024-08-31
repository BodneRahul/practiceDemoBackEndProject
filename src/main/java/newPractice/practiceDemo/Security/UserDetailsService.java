//package newPractice.practiceDemo.Security;
//
//import newPractice.practiceDemo.Entity.User;
//import newPractice.practiceDemo.Repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.ResourceAccessException;
//
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
//    @Autowired
//    private UserRepo userRepo;
//    @Override
//    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
//        User user = userRepo.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).
//                orElseThrow(() -> new UsernameNotFoundException("uhiu" + usernameOrEmail));
//        Set<GrantedAuthority> authorities = user.getRoles()
//                .stream()
//                .map((i)-> new SimpleGrantedAuthority(i.getName())).collect(Collectors.toSet());
//
//
//        return new org.springframework.security.core.userdetails.
//                User(user.getEmail(),user.getPassword(),authorities);
//    }
//}
