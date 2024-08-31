//package newPractice.practiceDemo.Controller;
//
//import newPractice.practiceDemo.Entity.Database;
//import newPractice.practiceDemo.Service.Dataservice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/rahul")
//public class DatabaseController {
//
//    @Autowired
//    private Dataservice dataservice;
//    @PostMapping()
//    ResponseEntity<Database> savedd(@RequestBody Database database){
//       return new ResponseEntity<>(dataservice.saveid(database), HttpStatus.OK) ;
//
//    }
//    @GetMapping
//    ResponseEntity<List<Database>> getAll(){
//        return new ResponseEntity<>(dataservice.GetALl(), HttpStatus.OK) ;
//
//    }
//
//}
