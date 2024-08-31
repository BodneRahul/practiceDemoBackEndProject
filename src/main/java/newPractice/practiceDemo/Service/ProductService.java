//package newPractice.practiceDemo.Service;
//
//import newPractice.practiceDemo.DTO.ProductDTO;
//import newPractice.practiceDemo.Entity.Product;
//import newPractice.practiceDemo.Repository.ProductRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepo productRepo;
//
//    public ProductDTO saveProduct(ProductDTO productDTO) {
//        Product product = dtoToEntity(productDTO);
//        Product savedProduct = productRepo.save(product);
//        return entityToDto(savedProduct);
//    }
//
//    public ProductDTO getById(Long productId) {
//        Optional<Product> byId = productRepo.findById(productId);
//        return byId.map(this::entityToDto).orElse(null);
//    }
//
//    public List<ProductDTO> getAllProducts() {
//        List<Product> allProducts = productRepo.findAll();
//        return allProducts.stream().map(this::entityToDto).collect(Collectors.toList());
//    }
//
//    public ProductDTO updateProduct(ProductDTO productDTO, Long id) {
//        Optional<Product> byId = productRepo.findById(id);
//        if (byId.isPresent()) {
//            Product existingProduct = byId.get();
//            existingProduct.setProductName(productDTO.getProductName());
//            existingProduct.setProductDescription(productDTO.getProductDescription());
//            // Update other fields if necessary
//            return entityToDto(productRepo.save(existingProduct));
//        }
//        return null; // Handle the case when the product is not found
//    }
//
//    public String deleteById(Long id) {
//        Optional<Product> byId = productRepo.findById(id);
//        if (byId.isPresent()) {
//            productRepo.deleteById(id);
//            return "Product with ID " + id + " has been deleted";
//        }
//        return "Product with ID " + id + " not found"; // Handle the case when the product is not found
//    }
//
//    private ProductDTO entityToDto(Product product) {
//        return new ProductDTO(product.getId(), product.getProductName(), product.getProductDescription());
//    }
//
//    private Product dtoToEntity(ProductDTO productDTO) {
//        Product product = new Product();
//        product.setId(productDTO.getId());
//        product.setProductName(productDTO.getProductName());
//        product.setProductDescription(productDTO.getProductDescription());
//        return product;
//    }
//}
