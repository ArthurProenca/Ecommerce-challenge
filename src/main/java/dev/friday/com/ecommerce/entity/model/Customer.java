package dev.friday.com.ecommerce.entity.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "`TCUSTOMER`")
@Entity
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "uuid")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "national_id")
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}
