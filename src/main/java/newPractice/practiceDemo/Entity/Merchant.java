//package newPractice.practiceDemo.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "Merchant_table")
//public class Merchant {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // use lowercase 'id' for consistency
//
//    private String merchantName;
//    private String merchantAddress; // corrected typo
//    private String merchantHistory;
//
//    @ManyToMany
//    @JoinTable(
//            name = "Merchant_Product",
//            joinColumns = @JoinColumn(name = "merchant_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id")
//    )
//    private List<Product> products = new ArrayList<>(); // corrected product to Product and initialized
//}
