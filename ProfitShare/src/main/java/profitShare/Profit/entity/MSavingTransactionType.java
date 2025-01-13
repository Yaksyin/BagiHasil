package profitShare.Profit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MSavingTransactionType {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid" ,strategy = "uuid")
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "tx_code" ,referencedColumnName = "code")
    private TransactionType txCode;

    @ManyToOne
    @JoinColumn(name = "saving_id" ,referencedColumnName = "saving_id")
    private MSaving savingId;
}
