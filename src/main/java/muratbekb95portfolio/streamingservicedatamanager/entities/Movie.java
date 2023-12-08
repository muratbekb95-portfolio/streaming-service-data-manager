package muratbekb95portfolio.streamingservicedatamanager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonProperty("info")
    private String info;

    @OneToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private User created_by;

    @Column(name = "created_on")
    private Date created_on;

    @OneToOne
    @JoinColumn(name = "update_by", referencedColumnName = "id")
    private User update_by;

    @Column(name = "update_on")
    private Date update_on;
}
