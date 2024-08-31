//package newPractice.practiceDemo.Repository;
//
//import newPractice.practiceDemo.Entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface UserRepo extends JpaRepository<User,Long> {
//
//    Optional<User>findByEmail(String email);
//    Optional<User>findByUsernameOrEmail(String username,String email);
//    Optional<User>findByUsername(String username);
////    Boolean existByUsername(String username);
////    Boolean existByEmail(String email);
//}
