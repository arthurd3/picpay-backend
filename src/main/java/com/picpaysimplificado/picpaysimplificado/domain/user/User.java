package com.picpaysimplificado.picpaysimplificado.domain.user;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity(name = "users")
@Table(name= "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String document;
    private String password;

    @Column(unique = true)
    private String email;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;

}
