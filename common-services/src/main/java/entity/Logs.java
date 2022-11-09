package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "db_log")
@Table(name = "debug")
@Data
@NoArgsConstructor
public class Logs {
    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String systemTypeId;
    private String methodParams;

}
