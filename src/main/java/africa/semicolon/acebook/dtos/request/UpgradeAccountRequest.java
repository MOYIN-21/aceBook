package africa.semicolon.acebook.dtos.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpgradeAccountRequest {
    private String transactionReference;
    private Long accountId;
}
