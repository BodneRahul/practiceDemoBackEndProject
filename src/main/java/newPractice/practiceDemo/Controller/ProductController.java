//package newPractice.practiceDemo.Controller;
//
//import newPractice.practiceDemo.DTO.ProductDTO;
//import newPractice.practiceDemo.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/product")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping
//    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {
//        return new ResponseEntity<>(productService.saveProduct(productDTO), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/getById/{id}")
//    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
//        return new ResponseEntity<>(productService.getById(id), HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ProductDTO>> getAll() {
//        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO,
//                                                    @PathVariable Long id) {
//        return new ResponseEntity<>(productService.updateProduct(productDTO, id), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteById(@PathVariable Long id) {
//        return new ResponseEntity<>(productService.deleteById(id), HttpStatus.OK);
//    }
//}
