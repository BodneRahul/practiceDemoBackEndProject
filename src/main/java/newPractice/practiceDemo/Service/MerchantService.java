//package newPractice.practiceDemo.Service;
//
//import newPractice.practiceDemo.DTO.MerchantDTO;
//import newPractice.practiceDemo.DTO.ProductDTO;
//import newPractice.practiceDemo.Entity.Merchant;
//import newPractice.practiceDemo.Entity.Product;
//import newPractice.practiceDemo.Repository.MerchantRepo;
//import newPractice.practiceDemo.Repository.ProductRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class MerchantService {
//
//    @Autowired
//    private MerchantRepo merchantRepo;
//
//    @Autowired
//    private ProductRepo productRepo;
//
//
//    public MerchantDTO saveMerchant(MerchantDTO merchantDTO) {
//        Merchant merchant = dtoToEntity(merchantDTO);
//        Merchant savedMerchant = merchantRepo.save(merchant);
//        return entityToDto(savedMerchant);
//    }
//
//    public List<MerchantDTO> getAll() {
//        List<Merchant> allMerchants = merchantRepo.findAll();
//        return allMerchants.stream().map(this::entityToDto).collect(Collectors.toList());
//    }
//
//    public MerchantDTO getById(Long id) {
//        Optional<Merchant> merchantOptional = merchantRepo.findById(id);
//        return merchantOptional.map(this::entityToDto).orElse(null);
//    }
//
//    private MerchantDTO entityToDto(Merchant merchant) {
//        MerchantDTO merchantDTO = new MerchantDTO();
//        merchantDTO.setId(merchant.getId());
//        merchantDTO.setMerchantAddress(merchant.getMerchantAddress());
//        merchantDTO.setMerchantHistory(merchant.getMerchantHistory());
//        merchantDTO.setMerchantName(merchant.getMerchantName());
//        merchantDTO.setProducts(merchant.getProducts().stream()
//                .map(this::productEntityToDto)
//                .collect(Collectors.toList()));
//        return merchantDTO;
//    }
//
//    private Merchant dtoToEntity(MerchantDTO merchantDTO) {
//        Merchant merchant = new Merchant();
//        merchant.setId(merchantDTO.getId());
//        merchant.setMerchantAddress(merchantDTO.getMerchantAddress());
//        merchant.setMerchantName(merchantDTO.getMerchantName());
//        merchant.setMerchantHistory(merchantDTO.getMerchantHistory());
//
//        if (merchantDTO.getProducts() != null && !merchantDTO.getProducts().isEmpty()) {
//            List<Product> products = merchantDTO.getProducts().stream()
//                    .map(this::productDtoToEntity)
//                    .collect(Collectors.toList());
//            merchant.setProducts(products);
//        }
//        return merchant;
//    }
//
//    private ProductDTO productEntityToDto(Product product) {
//        return new ProductDTO(product.getId(), product.getProductName(), product.getProductDescription());
//    }
//
//    private Product productDtoToEntity(ProductDTO productDTO) {
//        Product product = new Product();
//        product.setId(productDTO.getId());
//        product.setProductName(productDTO.getProductName());
//        product.setProductDescription(productDTO.getProductDescription());
//        return product;
//    }
//}
