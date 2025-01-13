package profitShare.Profit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MSavingTxTypeCoa {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid" ,strategy = "uuid")
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "coa_code" ,referencedColumnName = "code")
    private MCoa coaCode;

    @ManyToOne
    @JoinColumn(name = "id_saving_tx_type" ,referencedColumnName = "id")
    private MSavingTransactionType idSavingTxType;

    @Column(name = "mutation")
    private String mutation;

}
