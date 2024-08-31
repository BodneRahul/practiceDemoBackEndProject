package newPractice.practiceDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantDTO {

    private Long Id;
    private String MerchantName;
    private String merchantAddress;
    private String MerchantHistory;
    private List<Long> products;

}
