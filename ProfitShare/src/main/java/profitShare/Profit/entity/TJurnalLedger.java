package profitShare.Profit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TJurnalLedger {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "t_journal_ledger")
    private String id;

    @ManyToOne
    @JoinColumn(name = "tx_code" ,referencedColumnName = "code")
    private TransactionType txCode;

    @ManyToOne
    @JoinColumn(name = "coa_code" , referencedColumnName ="code" )
    private MCoa coaCode;

    @Column(name = "mutation")
    private String mutation;

    @Column(name = "nominal")
    private BigDecimal nominal;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "saving_tx_type_id",referencedColumnName = "id")
    private MSavingTransactionType savingTxTypeId;
}
