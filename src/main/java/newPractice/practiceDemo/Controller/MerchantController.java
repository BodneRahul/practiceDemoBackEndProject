//package newPractice.practiceDemo.Controller;
//
//import newPractice.practiceDemo.DTO.MerchantDTO;
//import newPractice.practiceDemo.Service.MerchantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/Merchant")
//public class MerchantController {
//
//    @Autowired
//    private MerchantService merchantService;
//
//    @PostMapping("/CreatePost")
//    public ResponseEntity<MerchantDTO> saveMerchant(@RequestBody MerchantDTO merchantDTO) {
//        MerchantDTO merchantDTO1 = merchantService.saveMerchant(merchantDTO);
//        return new ResponseEntity<>(merchantDTO1, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/Get")
//    public ResponseEntity<List<MerchantDTO>> getAll() {
//        List<MerchantDTO> all = merchantService.getAll();
//        return new ResponseEntity<>(all, HttpStatus.OK);
//    }
//
//    @GetMapping("/GetById/{id}")
//    public ResponseEntity<MerchantDTO> getById(@PathVariable Long id) {
//        MerchantDTO byId = merchantService.getById(id);
//        return new ResponseEntity<>(byId, HttpStatus.OK);
//    }
//}
